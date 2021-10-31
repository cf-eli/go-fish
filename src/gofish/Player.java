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
    private ArrayList<Card> hand;
    private int score;
    
    public Player(String name){
        playername = name;
    }
    public int getCard(int a){
        return a;
    }
    public String getName(){
        return this.playername;
    }
    public void addHand(Card c){
        this.hand.add(c);
    }
    public void removeHand(Card c){
        this.hand.remove(c);
    }
    public int getScore(){
        return this.score;
    }
    public void increaseScore(){
        this.score ++;
    }
    
    
}
