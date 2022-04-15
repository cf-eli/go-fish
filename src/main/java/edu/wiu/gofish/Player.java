/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wiu.gofish;
import java.util.*;

/**
 *
 * 
 */
public class Player {
    private String playername;
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int score;
    private int playerid = 0; //this will always be 0 for a player, there should only be one
    private ArrayList<Card> recently_lost = new ArrayList<Card>();
   //Hold player name 
    public Player(String name){
        playername = name;
    }
    //Hold player hand
    public ArrayList<Card> getHand(){
        return this.hand;
    }
    //grab a card in player hand
    public int getCard(int a){
        hand.get(a);
        return a;
    }
    //return the player name
    public String getName(){//returns the player name
        return this.playername;
    }

    public Card addCard(Card c){//takes in a card object and places it in the hand.
        this.hand.add(c);
        return c;
        //System.out.println(c.getImg()); test
    }
    public void removeCard(Card c){//removes a specific card from the hand, should always be pairs with a addCard function on another
        this.hand.remove(c);
    }
    public int getScore(){ //returns the score value
        return this.score;
    }
    public void increaseScore(){//increments the score, if someone reaches 8 the game should be set to over
        this.score ++;
    }
    //return player number
    public int getPlayernumber(){
        return playerid;
    }
    //set player id
    public int setPlayerid(int i){
        playerid = i;
        return playerid;
    }
    //return amount in hand
    public int getAmountInHand(){
    
        return this.hand.size();
    }
    //returns the recently lost array list, used for GUI
    public ArrayList<Card> getRecently_Lost(){
        return this.recently_lost;
    }
    
    //check hand for matches        
    public void checkHand(){//player and ai
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<hand.size();i++){ //add all ranks in hand to a temp array
            temp.add(hand.get(i).getRank());
        }
        System.out.println(temp);//This is just a test
        //check from rank 0-13 and see if theres 4 of the same matches, if so, remove that array and call the 
        //increaseScore() function
        for(int i=0;i<13;i++){ 
            int occurrences = Collections.frequency(temp, i);
            System.out.printf("\n%d: %d",i,occurrences);//Also test(delete)
            if (occurrences==4){
                int rank = i;
                //int size = hand.size();
                ArrayList<Card> tempHand = hand;
                for(int j=0;j<hand.size();j++){
                    if (hand.get(j).getRank()==rank){
                        tempHand.remove(j);
                        j--;
                    }
                    
                }
                increaseScore();
            }
        }
        System.out.println(hand);//test
        
          
    }
    
    //look at player hand for images  
    public ArrayList<String> getImg(){//player only
        ArrayList<String> img = new ArrayList<>();
        ArrayList<Integer> occurred = new ArrayList<>();
        for(int i =0;i<hand.size();i++){
            if(!occurred.contains(hand.get(i).getRank())) //check if the array already have an image with a similar rank
                img.add(hand.get(i).getImg());
            occurred.add(hand.get(i).getRank());
        }
        System.out.println(img);//test
        return img;
    }
    //get freq for how many time a rank shows up in hand
    public ArrayList<Integer> getHandFreq(){//player only
        ArrayList<Integer> freq = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i=0;i<hand.size();i++){ //add all ranks in hand to a temp array
            temp.add(hand.get(i).getRank());
        }
        
        ArrayList<Integer> occurred = new ArrayList<>();
        
        for(int i=0;i<temp.size();i++){ 
            int occurrences = Collections.frequency(temp, temp.get(i));
            if(!occurred.contains(temp.get(i))){
                occurred.add(temp.get(i));
                freq.add(occurrences);
            }
        }
        System.out.println(occurred);
        System.out.println(freq);
        return freq;
    }    
    public void inHand(Card card){//player only//testing purposes only------ delete later?
        for(int i=0;i<hand.size();i++){
            //System.out.println(card);
            //System.out.println(hand.get(i));
            //System.out.println(card);
            if(hand.get(i).getRank()==card.getRank() && hand.get(i).getSuit()==card.getSuit()){
                System.out.println(card.toString());
                System.out.println("match");
                System.out.println(hand.get(i).toString());
            }
        }
    }
    
    public ArrayList<Card> isMatch(Card card){//player and ai - Remove ALL ranks that is similar to rank asked for
        Boolean match = false;
        ArrayList<Card> matches = new ArrayList<>();
        if (!this.recently_lost.isEmpty()){
            this.recently_lost.clear();
        }
        for(int i = 0; i<hand.size();i++){
            if(hand.get(i).getRank()==card.getRank()){
                matches.add(hand.get(i));
                this.recently_lost.add(hand.remove(i));
                match = true;
                System.out.println(hand);//test
            }
        }
        return matches;
    }

    @Override
    public String toString(){// puts the name of the player and the current cards in "hand"
        String a = this.playername+"\n  "+hand.toString();
        return a;
    
    
    }
    
    
}
