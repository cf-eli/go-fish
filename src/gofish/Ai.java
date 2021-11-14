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
public class Ai extends Player{
    private int difficulty;//set this to 0-2, 0= easy, 1 = normal, 2 = hard
    
    Ai(){
        super("computer");
        //this just needs functions specific to the Ai player. so the function decideing what card to pick can go here. need to figure out how to handle difficulty. maybe a memory bank of the last cards you have or something
    
    
    }
    public void setDifficulty(){}
    
    
    
    
}
