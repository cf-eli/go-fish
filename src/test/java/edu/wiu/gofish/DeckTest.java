/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.wiu.gofish;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class DeckTest {
    
    public DeckTest() {
    }

    /**
     * Test of getSize method, of class Deck.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class Deck.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Deck instance = new Deck();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class Deck.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Deck instance = new Deck();
        Card expResult = null;
        Card result = instance.draw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Deck.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Deck instance = new Deck();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
