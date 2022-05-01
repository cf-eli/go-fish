/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.wiu.gofish;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

//import java.util.ArrayList;
import java.util.Collection;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.runner.RunWith; 
//import org.junit.runners.Parameterized; 
//import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Alex
 */
public class AiTest {
    Game testgame;
    Ai testai;
    Player testplayer;
    
    
    public AiTest() {
    }
    /*@BeforeClass
    public static void init(){

        //Controller testcontrol = new Controller(false);
        
        //testcontrol.setPlayer("testplayer");
        //testcontrol.setAi("testai", 1);
        //testcontrol.setAiDifficulty("Easy", 1);
        Game testgame = new Game();
        testgame.addPlayer("testplayer");
        testgame.addAi("testAI", 1); 
        
    
        
    }*/
    @Before
    public void before(){
        testgame = new Game();
        testplayer = new Player("testplayer");
        testai = new Ai("testai", 1);
        
        testgame.addPlayer(testplayer);
        testgame.addAi(testai);
    
    }
    /**
     * Test of getAi method, of class Ai.
     */
    @Test
    public void testGetAi() {
        System.out.println("getAi");
        testgame.addAi(testai);

        assertTrue(testai.equals(testgame.getPlayer(1)));
        
        
    }

    /**
     * Test of getCurrentCard method, of class Ai.
     */
    @Test
    public void testGetCurrentCard() {
        Card testcard = new Card(0,0);
        testai.setCurrentCard(testcard);
        assertTrue(testcard.equals(testai.getCurrentCard()));
        
    }
    @Test
    public void testsetCurrentCard() {
        Card testcard = new Card(0,0);
        Card returnedcard = testai.setCurrentCard(testcard);
        assertTrue(testcard.equals(returnedcard));
        
    }

    /**
     * Test of getCurrent_Target method, of class Ai.
     */
    @Test
    public void testGetCurrent_Target() {
        testai.setCurrent_Target(testplayer);
        assertTrue(testai.getCurrent_Target().equals(testplayer));
    }
    
    @Test
    public void testsetCurrent_Target() {
        Player returnedplayer = testai.setCurrent_Target(testplayer);
        assertTrue(testai.getCurrent_Target().equals(returnedplayer));
    }

    /**
     * Test of setMemory method, of class Ai.
     * not currently in use
     */
    /*
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
     * Not currently in use
     */
    /*
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
    public void testSetDifficulty0() {
        int testreturn = testai.setDifficulty("Easy");
        assertTrue(testreturn == 0);
        
    }
    
    @Test
    public void testSetDifficulty1() {
        int testreturn = testai.setDifficulty("Normal");
        assertTrue(testreturn == 1);
        
    }
    
    @Test
    public void testSetDifficulty2() {
        int testreturn = testai.setDifficulty("Hard");
        assertTrue(testreturn == 2);
        
    }
    

    /**
     * Test of getDifficulty method, of class Ai.
     */
    @Test
    public void testGetDifficulty() {
        int testreturn = testai.setDifficulty("Easy");
        assertTrue(testai.getDifficulty() == testreturn);
    }

    /**
     * Test of decideCardEasy method, of class Ai.
     */
    @Test
    public void testDecideCardEasy() {
        testgame.startGame();
        
        Card randomcard = testai.decideCardEasy();
        assertTrue(testgame.getPlayers().get(1).getHand().contains(randomcard));
        
        //assertEquals(,randomcard);
    }

    /**
     * Test of decidePlayer method, of class Ai.
     * 
     */
    @Test
    public void testDecidePlayer() {
        String result = testai.decidePlayer(testgame.getPlayers());
        assertEquals(result,testgame.getPlayer(0).getName()); 
    }

    /**
     * Test of runAi method, of class Ai.
     * 
     */
    /*
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
     *//*
    @Test
    public void testToString() {
        System.out.println("toString");
        Ai instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
