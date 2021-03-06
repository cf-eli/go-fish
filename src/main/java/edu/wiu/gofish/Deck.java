/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.wiu.gofish;
import java.util.*;//example\
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
/**
 *
 * @author Vuilk
 */
public class Deck {
    private int cardsInDeck; //use this to keep place in the deck when populating, increment when card is changed, in theory anyway
    private final ArrayList<Card> decklist = new ArrayList<>();//All cards in deck
    
    
    public Deck(){
        
    }
    
    //Return size of deck
    public int getSize(){
        return this.decklist.size();
        
    }
    public Card getCard(int a){
        return decklist.get(a);
    }
    
    
    public void reset(){ //populate the deck in this method
        cardsInDeck = 0;
        
        if (this.decklist.isEmpty()){
            for(int i = 0; i < 4; i++){ //4 suits
                for(int j = 1; j<14; j++) //13 cards per suit
                {
                    this.decklist.add(new Card(j,i));
                    cardsInDeck++;
                }
            }
        }else{
            this.decklist.clear();
            for(int i = 0; i < 4; i++){ //4 suits
                for(int j = 1; j<14; j++) //13 cards per suit
                {
                    this.decklist.add(new Card(j,i));
                    cardsInDeck++;
                }
            }
        }
    }
    
    public void shuffle(){//shuffle deck
        Collections.shuffle(this.decklist);
        
        
    }
    
    //Draw a card from the deck, and remove it form the deck
    public Card draw(){
        cardsInDeck = decklist.size()-1;
        return this.decklist.remove(0);
        
        
        
        
        
        
        
    }
    @Override
    public String toString(){// prints out the values of the decklist
        String a = this.decklist.toString();
        return a;
        
    }
    
}
