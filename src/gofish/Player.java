/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofish;
import java.util.ArrayList;

/**
 *
 * 
 */
public class Player {
    private String playername;
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int score;
    
    public Player(String name){
        playername = name;
    }
    public int getCard(int a){
        return a;
    }
    public String getName(){//returns the player name
        return this.playername;
    }
    public void addCard(Card c){//takes in a card object and places it in the hand.
        this.hand.add(c);
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
    @Override
    public String toString(){// puts the name of the player and the current cards in "hand"
        String a = this.playername+""+hand.toString();
        return a;
    
    
    }
    
    
}
