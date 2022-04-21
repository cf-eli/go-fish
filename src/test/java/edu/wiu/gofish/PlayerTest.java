/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.wiu.gofish;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class PlayerTest {
    
    public PlayerTest() {
    }

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Player instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class Player.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        int a = 0;
        Player instance = null;
        int expResult = 0;
        int result = instance.getCard(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class Player.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card c = null;
        Player instance = null;
        Card expResult = null;
        Card result = instance.addCard(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCard method, of class Player.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        Card c = null;
        Player instance = null;
        instance.removeCard(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class Player.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Player instance = null;
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of increaseScore method, of class Player.
     */
    @Test
    public void testIncreaseScore() {
        System.out.println("increaseScore");
        Player instance = null;
        instance.increaseScore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayernumber method, of class Player.
     */
    @Test
    public void testGetPlayernumber() {
        System.out.println("getPlayernumber");
        Player instance = null;
        int expResult = 0;
        int result = instance.getPlayernumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerid method, of class Player.
     */
    @Test
    public void testSetPlayerid() {
        System.out.println("setPlayerid");
        int i = 0;
        Player instance = null;
        int expResult = 0;
        int result = instance.setPlayerid(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmountInHand method, of class Player.
     */
    @Test
    public void testGetAmountInHand() {
        System.out.println("getAmountInHand");
        Player instance = null;
        int expResult = 0;
        int result = instance.getAmountInHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast_Ai_Target method, of class Player.
     */
    @Test
    public void testGetLast_Ai_Target() {
        System.out.println("getLast_Ai_Target");
        Player instance = null;
        Ai expResult = null;
        Ai result = instance.getLast_Ai_Target();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setlast_Ai_tart method, of class Player.
     */
    @Test
    public void testSetlast_Ai_tart() {
        System.out.println("setlast_Ai_tart");
        Ai target = null;
        Player instance = null;
        instance.setlast_Ai_tart(target);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecently_Lost method, of class Player.
     */
    @Test
    public void testGetRecently_Lost() {
        System.out.println("getRecently_Lost");
        Player instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getRecently_Lost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecently_Scored method, of class Player.
     */
    @Test
    public void testGetRecently_Scored() {
        System.out.println("getRecently_Scored");
        Player instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getRecently_Scored();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkHand method, of class Player.
     */
    @Test
    public void testCheckHand() {
        System.out.println("checkHand");
        Player instance = null;
        int expResult = 0;
        int result = instance.checkHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImg method, of class Player.
     */
    @Test
    public void testGetImg() {
        System.out.println("getImg");
        Player instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getImg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHandFreq method, of class Player.
     */
    @Test
    public void testGetHandFreq() {
        System.out.println("getHandFreq");
        Player instance = null;
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.getHandFreq();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inHand method, of class Player.
     */
    @Test
    public void testInHand() {
        System.out.println("inHand");
        Card card = null;
        Player instance = null;
        instance.inHand(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMatch method, of class Player.
     */
    @Test
    public void testIsMatch() {
        System.out.println("isMatch");
        Card card = null;
        Player instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.isMatch(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
