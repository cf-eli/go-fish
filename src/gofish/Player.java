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
        //System.out.println(c.getImg()); //test
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
    public void checkHand(){//this is set to only match 4 cards-----------------------------------
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<hand.size();i++){ //add all ranks in hand to a temp array
            temp.add(hand.get(i).getRank());
        }
        System.out.println(temp);//This is just a test
        //check from rank 0-13 and see if theres 4 of the same matches, if so, remove those cards and call the 
        //increaseScore() function
        for(int i=0;i<13;i++){ 
            int occurrences = Collections.frequency(temp, i);
            System.out.printf("\n%d: %d",i,occurrences);//Also test(delete)
            if (occurrences==4){
                int rank = i;
                for(int j=0;j<hand.size();j++){
                    if (hand.get(j).getRank()==rank){
                        hand.remove(j);
                    }
                }
                increaseScore();
            }
        }
        System.out.println(hand);//test   
          
    }
    public ArrayList<String> getImg(){
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
    
    public ArrayList<Integer> getHandFreq(){
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
        
        
     
    @Override
    public String toString(){// puts the name of the player and the current cards in "hand"
        String a = this.playername+""+hand.toString();
        return a;
    
    
    }
    
    
}
