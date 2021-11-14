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
public class Game {
    private String currentplayerturn;
    private String lastplayerturn;
    private String nextplayerturn;
    private Boolean isgameover;
    private ArrayList<Player> players = new ArrayList<Player>();
    
    
    
    
    public Game(Player a, Ai b){//constructor for the game class, might need player ids or something
        players.add(a);
        players.add(b);
        isgameover = false;
        //need to designate who the current turn is here, either through a method or just choosing the first person in the list.
        
        
        
    }
    public void startGame(){//method to start the game
    
    }
    public void endGame(){}
    
    public void checkGameOver(){
        for(int i=0; i<=players.size(); i++){
            if (players.get(i).getScore()>=8){
                isgameover = true;
                //this.gameOver();//not functioning yet, not sure if it should go here yet
            }
        }
            
    }
    public String getPlayerTurn(){
        return this.currentplayerturn;
    }
    
    public void setPlayerTurn(){
        //need this to check the last player before setting the next person in the arrylist as the currentplayer turn. should always check to be sure its not doubleing up a turn or something.
        //this might be involed. we need to decide if we want to just move the arraylist of players around, and designateing the first slot as the "current" turn, or storeing the turns seporately in variables or something, not sure which is better. 
        
    }
    
    
    
}


