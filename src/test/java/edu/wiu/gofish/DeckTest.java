/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.wiu.gofish;

import org.junit.Test;
import static org.junit.Assert.*;

//import java.util.ArrayList;
//import java.util.Collection;
import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith; 
//import org.junit.runners.Parameterized; 
//import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Alex
 */
public class DeckTest {
    Deck testdeck;
    
    public DeckTest() {
    }
    @Before
    public void init(){
        testdeck = new Deck();
        //testdeck.reset();
    
    }
    /**
     * Test of getSize method, of class Deck.
     * 
     */
    
    //test the creation of a deck being size 0 and working correctly
    @Test
    public void testGetSize1() {
        System.out.println("getSize");
        //Deck instance = new Deck();
        
        int expResult = 0;
        int result = testdeck.getSize();
        assertEquals(expResult, result);
        
    }
    //testing that reset() has size of 52
    @Test
        public void testGetSize2() {
        System.out.println("getSize");
        //Deck instance = new Deck();
        testdeck.reset();
        int expResult = 52;
        int result = testdeck.getSize();
        assertEquals("wrong number of cards: ",expResult, result);
        
        
    }

    /**
     * Test of reset method, of class Deck.
     */
    //tests what happens after a reset happens when cards are already drawn
    @Test
    public void testReset() {
        System.out.println("reset");
        int expResult = 52;
        testdeck.reset();
        testdeck.draw();
        testdeck.draw();
        testdeck.reset();
   
        int result = testdeck.getSize();
        assertEquals("wrong size after reset: ",expResult, result);
    }

    /**
     * Test of shuffle method, of class Deck.
     * 
     * Tests to see if the same card is in the same place after shuffle
     */
    @Test
    public void testShuffle() {
        Card before_shuffle;
        Card after_shuffle;
        boolean result = false;
        
        testdeck.reset();
        before_shuffle = testdeck.draw();
        
        testdeck.reset();
        testdeck.shuffle();
        after_shuffle = testdeck.draw();
        
        if(!before_shuffle.equals(after_shuffle)) {
            result = true;
        } else {
        }
        assertTrue("same card came back",result);
        
    }

    /**
     * Test of draw method, of class Deck.
     */
    @Test
    public void testDraw() {
        testdeck.reset();
        boolean result = true;
        
        Card testcard = testdeck.draw();
        assertFalse("card is null",testcard.equals(null));
        testdeck.draw();
        testdeck.draw();
        testdeck.draw();
        testdeck.draw();
        testdeck.draw();
        if(testdeck.getSize() == 46)
            result = false;
        assertFalse("wrong number in deck: "+testdeck.getSize(), result);
                
    }

    /**
     * Test of toString method, of class Deck.
     */
    /*
    @Test
    public void testToString() {
        System.out.println("toString");
        Deck instance = new Deck();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
