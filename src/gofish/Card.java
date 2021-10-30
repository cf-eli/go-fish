/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofish;

/**
 *
 * @author Vuilk
 */
public class Card {
          
    public static final String[] RANK = {null, "Ace", "2", "3", "4", "5", "6",
        "7", "8", "9", "8", "9", "10", "Jack", "Queen", "King"};
    
    public static final String[] SUIT = {"Clubs", "Diamonds",
        "Hearts", "Spades"};
    
    private final int rank; // rank is from 1-13 1=ace, 11-13= jack,queen,king
    private final int suit; // 0= club, 1=diamond, 2= heart, 3 = Spade
    
    public Card(int rank, int suit){ // constructor, Card threeOfClubs = new Card(3,0);
        
        this.rank = rank;
        this.suit = suit;
    
    }
    public int getRank(){
        return this.rank;
    }
    public int getSuit(){
        return this.suit;
    }
    
    @Override
    public String toString(){//method for displaying card info
                
        String a = RANK[this.rank] + " of " + SUIT[this.suit];
        return a;
                
        }
    public int compareTo(Card x){ //compares 2 cards, priority: suits>rank>even
        //expected to only really need this for sorting cards
        if (this.suit < x.suit)
            return -1;
        if (this.suit > x.suit)
            return 1;
        if(this.rank < x.rank)
            return -1;
        if(this.rank > x.rank)
            return 1;
        return 0;
                    
    
    }
        
        
}
    /*enum Rank{
        Zero, Ace, Two, Three, Four, Five, Six, Seven, Eigth, Nine, Ten, Jack, Queen, King;
        
        private static final Rank[] ranks = Rank.values();
        public static Rank getColor(int i)
        {
            return Rank.ranks[i];
        }
    } */
            
    
