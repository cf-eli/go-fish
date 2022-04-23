/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.wiu.gofish;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith; 
import org.junit.runners.Parameterized; 
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Alex
 */
//expected result, result
@RunWith(Parameterized.class)
public class CardTest {
    private int inputrank;
    private int inputsuit;
    private String expectedStringRank;
    private String expectedStringSuit;
    private int expectedintRank;
    private int expectedintSuit;
            
    
    public CardTest(int inputrank, int inputsuit, String expectedrank, String expectedsuit, int expectedintRank, int expectedintSuit) {
        this.inputrank = inputrank;
        this.inputsuit = inputsuit;
        this.expectedStringRank = expectedrank;
        this.expectedStringSuit = expectedsuit;
        this.expectedintRank = expectedintRank;
        this.expectedintSuit = expectedintSuit;
        
        
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> data = new ArrayList<>();      
        
        for(int i = 0; i < 4; i++){ //4 suits
            for(int j = 1; j < 14; j++) //13 cards per suit
            {
                //CardTest.decktest.add(new Card(j,i));
                Object[] test = new Object[]{j,i,Card.RANK[j],Card.SUIT[i], j, i};
                data.add(test);
                
            }     
        }
        return data;
    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        Card cardtest = new Card(inputrank,inputsuit);
        
        assertEquals("test",expectedintRank,cardtest.getRank());
        System.out.println(expectedintRank+" == "+cardtest.getRankString());
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card cardtest = new Card(inputrank,inputsuit);
        
        assertEquals(expectedintSuit,cardtest.getSuit());
    }

    /**
     * Test of getSuitString method, of class Card.
     */
    @Test
    public void testGetSuitString() {
        
        Card cardtest = new Card(inputrank,inputsuit);
        
        assertEquals(expectedStringSuit,cardtest.getSuitString());
    }

    /**
     * Test of getRankString method, of class Card.
     */
    @Test
    public void testGetRankString() {
        Card cardtest = new Card(inputrank,inputsuit);
        
        assertEquals(expectedStringRank,cardtest.getRankString());
    }

    /**
     * Test of getImg method, of class Card.
     */
    @Test
    public void testGetImg() {
        System.out.println("getImg");
        Card instance = null;
        String expResult = "";
        String result = instance.getImg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
