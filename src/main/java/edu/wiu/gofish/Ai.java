/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wiu.gofish;

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
            case 0 -> { 
                if(memory.size() == 1){
                    memory.remove(memory.size()-1);
                    memory.add(a);
                }else
                    memory.add(a);
            }
            case 1 -> {
                if(memory.size() == 2){
                    memory.remove(memory.size()-1);
                    memory.add(a);
                }else{
                    memory.add(a);
                }
            }
            case 2 -> {
                if(memory.size()== 3){
                    memory.remove(memory.size()-1);
                    memory.add(a);
                }else{
                    memory.add(a);
                }
            }
            default -> System.out.println("not valid memory level");
                
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
    
    
    //picks a random card from the Ai's hand and returns it
    //random card = easy level, add more functionality for more difficulties
    public Card decideCardEasy(){
        int rand = new Random().nextInt(super.getHand().size());
        return super.getHand().get(rand);
    }




    
    //method for ai decision on who to target
    //need the player turn array. and returns a specific player
    
    //_______TODO: this is wrong, if 2 people needs to just select player 0 ______
    //also, might not work with more than 2, might need rework statments to be specific for each ai asking
    public Player decidePlayer(ArrayList<Player> playerlist){
        double rand = Math.random();
        for(int i= 0; i<playerlist.size(); i++){
            switch(playerlist.size()){
                case(2):
                    if(rand <=.5)
                        return playerlist.get(0);
                    else
                        return playerlist.get(1);  
                case(3):
                    if (rand <=.33)
                        return playerlist.get(0);
                    else if(rand<=.66)
                        return playerlist.get(1);
                    else
                        return playerlist.get(2);     
                case(4):
                    if (rand <=.25)
                        return playerlist.get(0);
                    else if (rand<=.50)
                        return playerlist.get(1);
                    else if (rand <=.75)
                        return playerlist.get(2);
                    else
                        return playerlist.get(3);
                default:
                    System.out.println("Wrong player size, out of bounds");
            }        
        }
    
    return playerlist.get(0);
    }
    
    //TODO:
    //need a AI turn function in here that does everything in one, make it look a bit cleaner on the button press
    
    
    
    @Override
    public String toString(){
        String a = super.toString()+" \n    Difficulty: "+difficulty;
        return a;
    
    }
    
    
    
    
    
}
