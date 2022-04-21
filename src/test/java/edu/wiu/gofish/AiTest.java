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
public class AiTest {
    
    public AiTest() {
    }

    /**
     * Test of getAi method, of class Ai.
     */
    @Test
    public void testGetAi() {
        System.out.println("getAi");
        Ai instance = null;
        Ai expResult = null;
        Ai result = instance.getAi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentCard method, of class Ai.
     */
    @Test
    public void testGetCurrentCard() {
        System.out.println("getCurrentCard");
        Ai instance = null;
        Card expResult = null;
        Card result = instance.getCurrentCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrent_Target method, of class Ai.
     */
    @Test
    public void testGetCurrent_Target() {
        System.out.println("getCurrent_Target");
        Ai instance = null;
        Player expResult = null;
        Player result = instance.getCurrent_Target();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMemory method, of class Ai.
     */
    @Test
    public void testSetMemory() {
        System.out.println("setMemory");
        int i = 0;
        Card a = null;
        Ai instance = null;
        instance.setMemory(i, a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMemory method, of class Ai.
     */
    @Test
    public void testGetMemory() {
        System.out.println("getMemory");
        Ai instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getMemory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDifficulty method, of class Ai.
     */
    @Test
    public void testSetDifficulty() {
        System.out.println("setDifficulty");
        String a = "";
        Ai instance = null;
        instance.setDifficulty(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDifficulty method, of class Ai.
     */
    @Test
    public void testGetDifficulty() {
        System.out.println("getDifficulty");
        Ai instance = null;
        int expResult = 0;
        int result = instance.getDifficulty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decideCardEasy method, of class Ai.
     */
    @Test
    public void testDecideCardEasy() {
        System.out.println("decideCardEasy");
        Ai instance = null;
        Card expResult = null;
        Card result = instance.decideCardEasy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decidePlayer method, of class Ai.
     */
    @Test
    public void testDecidePlayer() {
        System.out.println("decidePlayer");
        ArrayList<Player> playerlist = null;
        Ai instance = null;
        String expResult = "";
        String result = instance.decidePlayer(playerlist);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of runAi method, of class Ai.
     */
    @Test
    public void testRunAi() {
        System.out.println("runAi");
        Game game = null;
        Ai instance = null;
        String expResult = "";
        String result = instance.runAi(game);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Ai.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ai instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
