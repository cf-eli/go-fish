/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wiu.gofish;

/**
 *
 * @author Vuilk
 */
public class Card {
    //Assign rank for each of the cards, null for 0, 1 for Ace, etc      
    public static final String[] RANK = {null, "Ace", "2", "3", "4", "5", "6",
        "7", "8", "9", "10", "Jack", "Queen", "King"};
    //Assign each suit a numbers
    public static final String[] SUIT = {"Clubs", "Diamonds",
        "Hearts", "Spades"};
    
    private final int rank; // rank is from 1-13 1=ace, 11-13= jack,queen,king
    private final int suit; // 0= club, 1=diamond, 2= heart, 3 = Spade
    
    public Card(int rank, int suit){ // constructor, Card threeOfClubs = new Card(3,0);
        
        this.rank = rank;
        this.suit = suit;
    
    }
    
    //Return rank(int)
    public int getRank(){
        return this.rank;
    }
    
    //Return suit(int)
    public int getSuit(){
        return this.suit;
    }
    
    //Return suit string
    public String getSuitString(){
        return SUIT[this.getSuit()];
    }
    
    //Return rank string
    public String getRankString(){   
        return RANK[this.getRank()];
    }
    
    //Return img string using the card rank and suit to create the image string
    public String getImg(){//return img string
        String[] imgRank = {"back", "1", "2", "3", "4", "5", "6","7", "8", "9", 
            "10", "11", "12", "13"};
        String[] imgSuit = {"c", "d", "h", "s"};
        String img = String.format("/%s%s.png", imgRank[this.rank], 
                imgSuit[this.suit]);//String cardresults = System.out.println(card + suit);    
        return img; //return img string
    }
    @Override
    public String toString(){//method for displaying card info
                
        String a = RANK[this.rank] + " of " + SUIT[this.suit];
        return a;
                
        }
            
}

    
