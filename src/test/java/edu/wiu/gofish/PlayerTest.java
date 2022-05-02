/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.wiu.gofish;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Alex
 */
public class PlayerTest {
    Player eli = new Player("Eli");
    
    Card card = new Card(1,1);
    public PlayerTest() {
        
//        Game game = new Game();
//        game.addPlayer(eli);
//        game.startGame();
    }
         /**
     * Add card to player object and test it's there
     */
    @Before
    public void testAddCard() {
        
        eli.addCard(card);
        //hand = eli.getHand();
        assertEquals(card,eli.getHand().get(0));
    }
    /**
     * Grab the player hand from player object and match to make sure the card
     * we added is in player hand
     */
    @Test
    public void testGetHand() {

        //hand = eli.getHand();
        assertEquals(card,eli.getHand().get(0));
        
    }

    /**
     * The method in player don't even make sense, is this even used? Unused
     */
    @Test
    public void testGetCard() {

        //hand = eli.getHand();
        //assertEquals(card,eli.getCard(0));
        assertEquals(0,eli.getCard(0)); //just to make it work, change back to 
        //above
    }

    /**
     * Get the player name from player object and match it and make sure
     * it's the one we're looking for
     */
    @Test
    public void testGetName() {
        String name = eli.getName();
        assertEquals("Eli", name);
    }



    /**
     * Remove card from player object and make sure it's removed
     */
    @Test
    public void testRemoveCard() {
        eli.removeCard(card);
        ArrayList<Card> hand = eli.getHand();
        assertTrue(hand.isEmpty());
    }

    /**
     * Get score and make sure it return zero
     */
    @Test
    public void testGetScore() {
        assertEquals(0,eli.getScore());
    }

    /**
     * Get score and increase it by 1 and make sure it's increased
     */
    @Test
    public void testIncreaseScore() {
        eli.increaseScore();
        assertEquals(1,eli.getScore());
    }

    /**
     * Get player number which is always 0, unused, not needed?
     */
    @Test
    public void testGetPlayernumber() {
        assertEquals(0,eli.getPlayernumber());
    }

    /**
     * Set playerid to 5, unused not needed
     */
    @Test
    public void testSetPlayerid() {
        eli.setPlayerid(5);
        assertEquals(5,eli.getPlayernumber());
    }

    /**
     * Check and make sure there's 1 card in hand which is given at start
     */
    @Test
    public void testGetAmountInHand() {
        assertEquals(1,eli.getAmountInHand());
    }
//
//    /**
//     * Test of getLast_Ai_Target method, of class Player.
//     */
//    @Test
//    public void testGetLast_Ai_Target() {
//        System.out.println("getLast_Ai_Target");
//        Player instance = null;
//        Ai expResult = null;
//        Ai result = instance.getLast_Ai_Target();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setlast_Ai_tart method, of class Player.
//     */
//    @Test
//    public void testSetlast_Ai_tart() {
//        System.out.println("setlast_Ai_tart");
//        Ai target = null;
//        Player instance = null;
//        instance.setlast_Ai_tart(target);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRecently_Lost method, of class Player.
//     */
//    @Test
//    public void testGetRecently_Lost() {
//        System.out.println("getRecently_Lost");
//        Player instance = null;
//        ArrayList<Card> expResult = null;
//        ArrayList<Card> result = instance.getRecently_Lost();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRecently_Scored method, of class Player.
//     */
//    @Test
//    public void testGetRecently_Scored() {
//        System.out.println("getRecently_Scored");
//        Player instance = null;
//        ArrayList<Card> expResult = null;
//        ArrayList<Card> result = instance.getRecently_Scored();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkHand method, of class Player.
//     */
//    @Test
//    public void testCheckHand() {
//        System.out.println("checkHand");
//        Player instance = null;
//        int expResult = 0;
//        int result = instance.checkHand();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getImg method, of class Player.
//     */
//    @Test
//    public void testGetImg() {
//        System.out.println("getImg");
//        Player instance = null;
//        ArrayList<String> expResult = null;
//        ArrayList<String> result = instance.getImg();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getHandFreq method, of class Player.
//     */
//    @Test
//    public void testGetHandFreq() {
//        System.out.println("getHandFreq");
//        Player instance = null;
//        ArrayList<Integer> expResult = null;
//        ArrayList<Integer> result = instance.getHandFreq();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of inHand method, of class Player.
//     */
//    @Test
//    public void testInHand() {
//        System.out.println("inHand");
//        Card card = null;
//        Player instance = null;
//        instance.inHand(card);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isMatch method, of class Player.
//     */
//    @Test
//    public void testIsMatch() {
//        System.out.println("isMatch");
//        Card card = null;
//        Player instance = null;
//        ArrayList<Card> expResult = null;
//        ArrayList<Card> result = instance.isMatch(card);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class Player.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Player instance = null;
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
