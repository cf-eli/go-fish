/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofish;
import java.util.*;

/**
 *
 * 
 */
public class Game {
    //private String currentplayerturn;
    private String lastplayerturn;
    private String nextplayerturn;
    private Boolean isgameover;
    private int playercount;
    private ArrayList<Player> players = new ArrayList<Player>(); //this list also serves as the turn order. 
    //index 0 is the next immediate turn, 1 is the next one, ect... the last in the list should always be the last turn.
    private Deck deck;
    
    
    
    public Game(Player a, Ai b){//constructor for the game class, need to input the player string entered from the GUI for first perameter 
        
        
        players.add(a);
        players.add(b);
        isgameover = false;
        playercount = 2;
        deck = new Deck();        
        
        double rand = Math.random();
        if(rand >.05){//if the random number is greater than .5, set the AI as the first player
            players.add(players.remove(0));
        }
        
        
        
        
    }
    //this needs to be tested
    public void startGame(){//method to start the game
        deck.shuffle();
        
        
        if(playercount <= 3 ){
            for(int i = 0; i <=6; i++){
                //put 7 cards in  players hands
                for(int j = 0; j <= players.size()-1; j++){
                    players.get(j).addCard(deck.draw());
                }
            }        
        }else{
            for(int i = 0; i <=4; i++){
                //put 5 cards in each players hand
                for(int j = 0; j <= players.size()-1; j++){
                    players.get(j).addCard(deck.draw());                    
                }
            }
        }
        
    }
    
    
    
    public void goFish(){
        //method for clicking on the deck
        players.get(0).addCard(deck.draw());//draws a card and places it into the current player's hand
        players.add(players.remove(0)); // cycles the first person to the back of the line
        
        
    }
    public Card pickCard(Card a){
        //this should be used when clicking a button. it needs to compare the selected card
        //with the hand of the opponant. if they have the card, remove from the hand and place in the other's hand.  
        return a;
    }
    
        
    public void endGame(){}
    
    public void checkGameOver(){
        for(int i=0; i<=players.size(); i++){
            if (players.get(i).getScore()>=8){
                isgameover = true;
                //this.gameOver();//not functioning yet, not sure if it should go here yet
            }
        }
            
    }
    public void setNextTurn(){// takes the first person on the list and places them at the end of the list
        players.add(players.remove(0));
 
    }
    public String getCurrentTurnName(){ //return the current player's name
        return players.get(0).getName();
    }
    
    
    
}


