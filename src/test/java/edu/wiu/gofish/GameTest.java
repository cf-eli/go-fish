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
public class GameTest {
    
    public GameTest() {
    }

    /**
     * Test of getPlayer method, of class Game.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        int a = 0;
        Game instance = new Game();
        Player expResult = null;
        Player result = instance.getPlayer(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        Game instance = new Game();
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeck method, of class Game.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        Game instance = new Game();
        Deck expResult = null;
        Deck result = instance.getDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPlayer method, of class Game.
     */
    @Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        String a = "";
        Game instance = new Game();
        instance.addPlayer(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAi method, of class Game.
     */
    @Test
    public void testAddAi() {
        System.out.println("addAi");
        String a = "";
        int i = 0;
        Game instance = new Game();
        instance.addAi(a, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTurnOrder method, of class Game.
     */
    @Test
    public void testSetTurnOrder() {
        System.out.println("setTurnOrder");
        Game instance = new Game();
        instance.setTurnOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecificTurnAI method, of class Game.
     */
    @Test
    public void testSetSpecificTurnAI() {
        System.out.println("setSpecificTurnAI");
        Game instance = new Game();
        instance.setSpecificTurnAI();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecificTurnplayer method, of class Game.
     */
    @Test
    public void testSetSpecificTurnplayer() {
        System.out.println("setSpecificTurnplayer");
        Game instance = new Game();
        instance.setSpecificTurnplayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startGame method, of class Game.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        Game instance = new Game();
        instance.startGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of goFish method, of class Game.
     */
    @Test
    public void testGoFish() {
        System.out.println("goFish");
        Game instance = new Game();
        instance.goFish();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pickCard method, of class Game.
     */
    @Test
    public void testPickCard() {
        System.out.println("pickCard");
        Card a = null;
        Game instance = new Game();
        Card expResult = null;
        Card result = instance.pickCard(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endGame method, of class Game.
     */
    @Test
    public void testEndGame() {
        System.out.println("endGame");
        Game instance = new Game();
        instance.endGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkGameOver method, of class Game.
     */
    @Test
    public void testCheckGameOver() {
        System.out.println("checkGameOver");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.checkGameOver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameOver method, of class Game.
     */
    @Test
    public void testGetGameOver() {
        System.out.println("getGameOver");
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.getGameOver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWinner method, of class Game.
     */
    @Test
    public void testGetWinner() {
        System.out.println("getWinner");
        Game instance = new Game();
        String expResult = "";
        String result = instance.getWinner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentTurnName method, of class Game.
     */
    @Test
    public void testGetCurrentTurnName() {
        System.out.println("getCurrentTurnName");
        Game instance = new Game();
        String expResult = "";
        String result = instance.getCurrentTurnName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentTurn method, of class Game.
     */
    @Test
    public void testGetCurrentTurn() {
        System.out.println("getCurrentTurn");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getCurrentTurn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentTurnPlayer method, of class Game.
     */
    @Test
    public void testGetCurrentTurnPlayer() {
        System.out.println("getCurrentTurnPlayer");
        Game instance = new Game();
        Player expResult = null;
        Player result = instance.getCurrentTurnPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNextPlayerTurn method, of class Game.
     */
    @Test
    public void testSetNextPlayerTurn() {
        System.out.println("setNextPlayerTurn");
        Game instance = new Game();
        Card expResult = null;
        Card result = instance.setNextPlayerTurn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImg method, of class Game.
     */
    @Test
    public void testGetImg() {
        System.out.println("getImg");
        Game instance = new Game();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getImg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFreq method, of class Game.
     */
    @Test
    public void testGetFreq() {
        System.out.println("getFreq");
        Game instance = new Game();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.getFreq();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inHand method, of class Game.
     */
    @Test
    public void testInHand() {
        System.out.println("inHand");
        Card card = null;
        Game instance = new Game();
        instance.inHand(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayers method, of class Game.
     */
    @Test
    public void testGetCurrentPlayers() {
        System.out.println("getCurrentPlayers");
        Game instance = new Game();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getCurrentPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createCard method, of class Game.
     */
    @Test
    public void testCreateCard() {
        System.out.println("createCard");
        String url = "";
        Game instance = new Game();
        Card expResult = null;
        Card result = instance.createCard(url);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWhoAsked method, of class Game.
     */
    @Test
    public void testGetWhoAsked() {
        System.out.println("getWhoAsked");
        Game instance = new Game();
        String expResult = "";
        String result = instance.getWhoAsked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMatch method, of class Game.
     */
    @Test
    public void testIsMatch() {
        System.out.println("isMatch");
        Card card = null;
        String name = "";
        Game instance = new Game();
        String expResult = "";
        String result = instance.isMatch(card, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkHand method, of class Game.
     */
    @Test
    public void testCheckHand() {
        System.out.println("checkHand");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.checkHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerCount method, of class Game.
     */
    @Test
    public void testGetPlayerCount() {
        System.out.println("getPlayerCount");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getPlayerCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
