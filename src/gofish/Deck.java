/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofish;
import java.util.Random;
/**
 *
 * @author Vuilk
 */
public class Deck {
    private Card[] cards;
    private int cardsInDeck; //use this to keep place in the deck when populating, increment when card is changed, in theory anyway
    
    public Deck(){
        cards = new Card[52]; // makes 52 null cards, gotta make a method that resets the deck(fill the values)  
    }
    
    public void reset(){ //populate the deck in this method
        cardsInDeck = 0;

       for(int i = 0; i < 4; i++){ //4 suits
            for(int j = 1; j<14; j++) //13 cards per suit
            {
                cards[cardsInDeck] = new Card(j, i);
                cardsInDeck++;
            }
       }
       //for(int i = 0; i<52; i++){ //test
        //   System.out.println(cards[i]);
       //}


    }
    
    public void shuffle(){
        Random gen = new Random(); 
        int loc1, loc2;
        Card [] temp = new Card[1]; //create a temperory deck of 1 card
        for (int i = 0; i < 300; i++) //shuffle the array(deck) 300 times
        {
            //Pick two random locations in the array(deck)
            loc1 = gen.nextInt(52);
            loc2 = gen.nextInt(52);
            //swap them
            temp[0] = cards[loc1];
            cards[loc1] = cards[loc2];
            cards[loc2] = temp[0];
        }

        for(int i = 0; i<52; i++){ //test
            System.out.println(cards[i]);
        }
    }
    
}
