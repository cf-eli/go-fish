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





public class GoFish {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Card test = new Card(12,0); //test for card class
        Deck test2 = new Deck();
        test2.reset();
        test2.shuffle();

       // System.out.println(test.toString());
    }
    
}
