 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wiu.gofish;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * 
 */
public class Game {
    //private String currentplayerturn;
    private int currentPlayerTurn; //show who the current player turn is
    private String lastplayerturn;
    private String nextplayerturn;
    private Boolean isgameover;
    private String winner;
    private int playercount;
    private ArrayList<Player> players = new ArrayList<Player>(); //this list also serves as the turn order. 
    //index 0 is the first player, rest are Ais
    private final Deck deck;

    
    
    
    public Game(){//constructor for the game class
        
        
        //players.add(a);
        //players.add(b);
        isgameover = false;
        playercount = 2;
        deck = new Deck();
        deck.reset();
        
        /*double rand = Math.random();
        if(rand >.05){//if the random number is greater than .5, set the AI as the first player
            players.add(players.remove(0));
        }*/
        
        
        
        
    }
    
    //Return the player
    public Player getPlayer(int a){
        return players.get(a);
    
    }
    //return list of player
    public ArrayList<Player> getPlayers(){
        return this.players;
    };
    //get deck object
    public Deck getDeck(){
        return this.deck;
    };
    //create new player using a string input
    public void addPlayer(String a){
        Player b = new Player(a);       
        players.add(b);
    
    };
    
    //create new Ai using a string input
    public void addAi(String a, int i){
        
        Ai b = new Ai(a, i);
        players.add(b);
    }
    //this sets the turn order in the array list. *check later: currently only works with one Ai, modify if we make more ai's a final decision*
    public void setTurnOrder(){
        double rand = Math.random();
        if(rand >.05){//if the random number is greater than .5, set the AI as the first player
            players.add(players.remove(0));
        }
    
    }
    //DEBIUGGING, DELETE LATER
    public void setSpecificTurnAI(){
        currentPlayerTurn = 1;
    
    }
    public void setSpecificTurnplayer(){
        currentPlayerTurn = 0;
    
    }    
    //DEBUGGING, DELETE LATER
    
    public void startGame(){//method to start the game
        deck.shuffle();
        currentPlayerTurn = 0;
        
        if(playercount <= 3 ){
            for(int i = 0; i <=6; i++){
                //put 7 cards in  players hands
                for(int j = 0; j < players.size(); j++){
                    players.get(j).addCard(deck.draw());
                }
            }        
        }else{
            for(int i = 0; i <=4; i++){
                //put 5 cards in each players hand
                for(int j = 0; j < players.size(); j++){
                    players.get(j).addCard(deck.draw());                    
                }
            }
        }
        //Below is a test-----------------------------------------------------------delete later
        for(int j=0;j<players.size();j++){
                System.out.println(players.get(j).toString());
            }
        System.out.println(deck.toString());
        
    }
    
    
    
    public void goFish(){
        //method for clicking on the deck
        //players.get(currentPlayerTurn).addCard(deck.draw());//draws a card and places it into the current player's hand
        this.setNextPlayerTurn(); // cycles the first person to the back of the line
        
        
    }
    public Card pickCard(Card a){
        //this should be used when clicking a button. it needs to compare the selected card
        //with the hand of the opponant. if they have the card, remove from the hand and place in the other's hand.  
        return a;
    }
    
    //End the game, WIP    
    public void endGame(){
        if(isgameover == true){
        
        
        }
    
    
    }
    
    //returns 0 for no game over, 1 for score game over, and 2 for no cards in hand game over
    public int checkGameOver(){
        for(int i=0; i<=players.size()-1; i++){
            //if score is >= 8, set gameover to true
            if (players.get(i).getScore()>=8){
                isgameover = true;
                this.winner = this.players.get(i).getName();
                return 1;
            }else if(players.get(i).getHand().isEmpty()){
                //only works 1player
                if (players.get(i).equals(players.size()-1))    
                    this.winner = players.get(0).getName();
                else
                    this.winner = players.get(1).getName();
                
                isgameover = true;
                return 2;
            }else if(this.getDeck().getSize() == 0){
                switch(this.players.size()){
                    case 2:{
                        if(players.get(0).getScore() > players.get(1).getScore()){
                            this.winner = players.get(0).getName();
                        }else
                            this.winner = players.get(1).getName();
                        break;
                    }
                }
                isgameover = true;
                return 3;
            }
        }
        return 0;
            
    }
    
    public boolean getGameOver(){
        return this.isgameover;
    }
    
    public String getWinner(){
        return this.winner;
    
    }

    

    public String getCurrentTurnName(){ //return the current player's name
        return players.get(currentPlayerTurn).getName();
    }
    
    public int getCurrentTurn(){//Get the currentPlayerTrun, testing only
        return currentPlayerTurn;
    }
    
    public Player getCurrentTurnPlayer(){
        return this.getPlayer(currentPlayerTurn);
    }
    
    //might need to be updated for more players
    public Card setNextPlayerTurn(){//set the next player turn
        Card drawn;
        
        drawn = players.get(currentPlayerTurn).addCard(deck.draw());
        
        //debuging
        System.out.println("players.size():"+ players.size());
        System.out.println("current Player Turn+1: "+(currentPlayerTurn+1));
        System.out.println("current player turn: "+currentPlayerTurn);
        
        if(players.size()==2 && currentPlayerTurn == 0){ //if playersize is 2 and the current turn is 0
            currentPlayerTurn++; //set playerturn to one
            System.out.println("current turn: "+ currentPlayerTurn);
        }    
        else 
            currentPlayerTurn = 0;
        System.out.println("current player turn after else: "+currentPlayerTurn);
        return drawn;
    }
    
    
    
    //player only, get image url for button icons
    public ArrayList<String> getImg(){
       ArrayList<String> img = new ArrayList<>(); //make img arraylist of strings
       img = players.get(0).getImg();
       return img;
    }
    //player only, get how many times card rank freq appears in hand for label above buttons
    public ArrayList<Integer> getFreq(){ 
        ArrayList<Integer> freq = new ArrayList<>();
        freq = players.get(0).getHandFreq();//getHand freq
        return freq;
    }
    //test pursposes-----------------------------------------------------------delete later
    public void inHand(Card card){
        players.get(0).inHand(card);
    }
    //player only, get name of all the player in the game (used for jCombo
    public ArrayList<String> getCurrentPlayers(){
        ArrayList<String> cPlayers = new ArrayList<>();
        for(int i = 0;i<players.size();i++){
            cPlayers.add(players.get(i).getName());
        }
        return cPlayers;
    }
    //player only, create a card using url
    public Card createCard(String url){
        Pattern p = Pattern.compile("[^\\[\\/.png\\]]+");
        Matcher m = p.matcher(url);
        m.find();
        //System.out.println(m);//test
        String check = m.group(0);
        System.out.println(check);
        p = Pattern.compile("([\\d]+)([hcds])");
        m = p.matcher(check);
        m.find();
        int rank = Integer.parseInt(m.group(1));
        String suitS = m.group(2);
        int suit;
        if (suitS.equals("c"))
            suit = 0;
        else if (suitS.equals("d"))
            suit = 1;
        else if (suitS.equals("h"))
            suit = 2;
        else 
            suit = 3;
        Card card = new Card(rank, suit);
        return card;
    }
    //player and ai, return who asked for askResult class and askCard class
    public String getWhoAsked(){
        System.out.println(players.get(currentPlayerTurn).getName());//test
        return players.get(currentPlayerTurn).getName();
    }
    //player and ai, return go fish or matched accordingly
    public String isMatch(Card card, String name){ //input is card from attacker, and name of the target
        ArrayList<Card>  matches = new ArrayList<>();
        System.out.println("ismatch card passed is:"+card);
        System.out.println("ismatch name passed is:"+ name);
        
        for(int i = 0; i<players.size();i++){
            System.out.println("is "+players.get(i).getName()+" == "+name+"?");
            if ((players.get(i).getName()).equals(name)){
                System.out.println(players.get(i).getName()+" == "+name);
                matches = players.get(i).isMatch(card);
                //this adds the ai target into the PC target variable
                if (Controller.getGame().getCurrentTurnPlayer() == Controller.getGame().getPlayers().get(0)){
                    Controller.getGame().getCurrentTurnPlayer().setlast_Ai_tart((Ai)players.get(i));
                }
            }
        }
        System.out.println("found matches :"+matches.toString());
        if(matches.size()>0){
            for(int i = 0;i<matches.size();i++){
                players.get(currentPlayerTurn).addCard(matches.get(i));
            }
            System.out.println(players.get(currentPlayerTurn));
            return "Matched";
            }
        return "Go Fish"; 
    }
    //tell checkHand function in playerhand which to check current player
    public int checkHand(){
        return players.get(currentPlayerTurn).checkHand();
    }
    //Return number of player
    public int getPlayerCount(){
        return players.size();
    }
    
    
    
}


