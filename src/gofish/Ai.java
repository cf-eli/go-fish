/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofish;

import java.util.*;

/**
 *
 * @author Vuilk
 */
public class Ai extends Player{
    private int difficulty;//set this to 0-2, 0= easy, 1 = normal, 2 = hard
    private ArrayList<Card> memory = new ArrayList<Card>();
    
    Ai(String a, int i){
        super(a);
        //this just needs functions specific to the Ai player. so the function decideing what card to pick can go here. need to figure out how to handle difficulty. maybe a memory bank of the last cards you have or something
        if (i==1)
            super.setPlayerid(i);
        else if (i == 2)
            super.setPlayerid(i);
        else
            super.setPlayerid(i);
    }  
    
    public void setMemory(int i, Card a){//if 0 is passed, only one is stored, if 1 is passed, 2 memory locations are stores, if 2 is passed, 3 is stored
        switch(i){
            case 0: 
                if(memory.size() == 1){
                    memory.remove(memory.size()-1);
                    memory.add(a);
                }else
                    memory.add(a);
                break;
            case 1:
                if(memory.size() == 2){
                    memory.remove(memory.size()-1);
                    memory.add(a);
                }else{
                    memory.add(a);
                }
                break;
            case 2:
                if(memory.size()== 3){
                    memory.remove(memory.size()-1);
                    memory.add(a);
                }else{
                    memory.add(a);
                }
                break;
            default:
                System.out.println("not valid memory level");
                
        }
            
            
    }
    public ArrayList<Card> getMemory(){
        return memory;
    }
    
    
    public void setDifficulty(String a){
        if (a == "Easy")
            this.difficulty = 0;
        else if( a == "Normal")
            this.difficulty = 1;
        else
            this.difficulty = 2;
    }
    public int getDifficulty(){
        return this.difficulty;
    }
    
    
    //basic methods
    public Card decideCard(Card c1, Card c2){
    
    return c1;
    }    
    public Player decidePlayer(Player p){
    
    return p;
    }
    public Player decidePlayer(Player p, Ai one){
    
    return p;
    }    
    public Player decidePlayer(Player p, Ai one, Ai two){
    
    return p;
    }    
    public Player decidePlayer(Player p, Ai one, Ai two, Ai three){
    
    return p;
    }    
    
    @Override
    public String toString(){
        String a = super.toString()+" \n    Difficulty: "+difficulty;
        return a;
    
    }
    
    
    
    
    
}
