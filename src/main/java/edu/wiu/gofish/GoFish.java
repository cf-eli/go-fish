/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wiu.gofish;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Vuilk
 */




//main class
public class GoFish {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //changed this a bit to be easier to test with, pass true if you want the GUI to show
       //pass false if you do not want it to show
       Controller control = new Controller(true);














       //StartPage s = new StartPage();
       //s.setVisible(true);
       
       
       
       
       
       
       /*
       Player player1 = new Player("Player1");
       Ai ai = new Ai();
       Game game = new Game(player1, ai);
       game.startGame();
       */
       
       
       /*
       //testing for the game methods
       
       //Card test = new Card(12,0); //test for card class
       Deck test2 = new Deck();
       test2.reset();
       //System.out.println(test2.toString());
       test2.shuffle();
       //System.out.println(test2.toString());
       
       
       
       Player testp = new Player("player1");
       Player testd = new Player("player2");
       testp.addCard(test2.draw());
       System.out.println(test2.toString());
       System.out.println(testp.toString());
       ArrayList<Player> test = new ArrayList<Player>();
       test.add(testp);
       test.add(testd);
       System.out.println(testp.getName());
       System.out.println(test.toString());
       System.out.println(test.get(test.size()-1));
       test.add(test.remove(0));
       System.out.println(test.get(test.size()-1));
       double rand = Math.random();
       
       System.out.println(rand);
       */
       
       
 
    }
    
}
