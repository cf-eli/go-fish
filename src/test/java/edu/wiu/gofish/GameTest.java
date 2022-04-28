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
public class GameTest {
    Game game = new Game();
    String eli = "Eli";
    String computer = "Computer";
    public GameTest() {
    }
    @Before
    public void testAddPlayer() {
        game.addPlayer(eli);
    }
    @Before
    public void testAddAi(){
        game.addAi(computer,1);
    }
    /**
     * Grab the first player and make sure the first player is Eli
     * Grab the second player and make sure it's the AI
     */
    @Test
    public void testGetPlayer() {
        assertEquals(game.getPlayer(0).getName(),eli);
        assertEquals(game.getPlayer(1).getName(), computer);
    }


    /**
     * Make sure the list of players is a size of 2, then add another and make 
     * sure it's a size of 3
     */
    @Test
    public void testGetPlayers() {
        assertEquals(game.getPlayers().size(),2);
        game.addPlayer("Alex");
        assertEquals(game.getPlayers().size(),3);
        
    }

    /**
     * Get the deck and make sure it's a size 52 since the game just started
     */
    @Test
    public void testGetDeck() {
        assertEquals(game.getDeck().getSize(),52);
    }
//
//    /**
//     * Test of setTurnOrder method, of class Game. (currently unused)
//     */
//    @Test
//    public void testSetTurnOrder() {
//        System.out.println("setTurnOrder");
//        Game instance = new Game();
//        instance.setTurnOrder();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSpecificTurnAI method, of class Game. /debug only
//     */
//    @Test
//    public void testSetSpecificTurnAI() {
//        System.out.println("setSpecificTurnAI");
//        Game instance = new Game();
//        instance.setSpecificTurnAI();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSpecificTurnplayer method, of class Game. //debug only
//     */
//    @Test
//    public void testSetSpecificTurnplayer() {
//        System.out.println("setSpecificTurnplayer");
//        Game instance = new Game();
//        instance.setSpecificTurnplayer();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
    /**
     * Check to make sure current turn is 0 and make sure the number
     * of cards in the player hand is 7
     */
    @Test
    public void testStartGame() {
        game.startGame();
        assertEquals(0,game.getCurrentTurn());
        assertEquals(7,game.getPlayer(0).getHand().size());
    }

    /**
     * Turn starts at on 0, make sure it increase by 1 after triggering go fish
     */
    @Test
    public void testGoFish() {
        assertEquals(0,game.getCurrentTurn());
        game.goFish();
        assertEquals(1,game.getCurrentTurn());
    }
//
//    /**
//     * Unused?
//     */
//    @Test
//    public void testPickCard() {
//        System.out.println("pickCard");
//        Card a = null;
//        Game instance = new Game();
//        Card expResult = null;
//        Card result = instance.pickCard(a);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Unused
//     */
//    @Test
//    public void testEndGame() {
//        System.out.println("endGame");
//        Game instance = new Game();
//        instance.endGame();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
    /**
     * Check 0 for no game over, 1 for score game over, and 2 for no cards in 
     * hand game over
     */
    @Test
    public void testCheckGameOver() {
        assertEquals(2, game.checkGameOver());
        game.startGame();
        assertEquals(0,game.checkGameOver());
        for(int i = 0; i<8;i++){
            game.getPlayer(0).increaseScore();
        }
        assertEquals(1,game.checkGameOver());

    }

    /**
     * Check if game is over in 2 ways, first way as game is created, and second
     * by removing all cards in deck and checking if game is over
     */
    @Test
    public void testGetGameOver() {
        assertEquals(false, game.getGameOver());
        Deck deck = game.getDeck();
        int size = deck.getSize();
        for(int i = 0;i<size;i++){
            deck.draw();
        }
        game.checkGameOver();
        assertEquals(true,game.getGameOver());
    }

    /**
     * Test of getWinner method, of class Game.
     */
    @Test
    public void testGetWinner() {
        for(int i = 0; i<8;i++){
            game.getPlayer(0).increaseScore();
        }
        game.checkGameOver();
        assertEquals("Eli", game.getWinner());
    }
//
//    /**
//     * Test of getCurrentTurnName method, of class Game.
//     */
//    @Test
//    public void testGetCurrentTurnName() {
//        System.out.println("getCurrentTurnName");
//        Game instance = new Game();
//        String expResult = "";
//        String result = instance.getCurrentTurnName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCurrentTurn method, of class Game.
//     */
//    @Test
//    public void testGetCurrentTurn() {
//        System.out.println("getCurrentTurn");
//        Game instance = new Game();
//        int expResult = 0;
//        int result = instance.getCurrentTurn();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCurrentTurnPlayer method, of class Game.
//     */
//    @Test
//    public void testGetCurrentTurnPlayer() {
//        System.out.println("getCurrentTurnPlayer");
//        Game instance = new Game();
//        Player expResult = null;
//        Player result = instance.getCurrentTurnPlayer();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setNextPlayerTurn method, of class Game.
//     */
//    @Test
//    public void testSetNextPlayerTurn() {
//        System.out.println("setNextPlayerTurn");
//        Game instance = new Game();
//        Card expResult = null;
//        Card result = instance.setNextPlayerTurn();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getImg method, of class Game.
//     */
//    @Test
//    public void testGetImg() {
//        System.out.println("getImg");
//        Game instance = new Game();
//        ArrayList<String> expResult = null;
//        ArrayList<String> result = instance.getImg();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFreq method, of class Game.
//     */
//    @Test
//    public void testGetFreq() {
//        System.out.println("getFreq");
//        Game instance = new Game();
//        ArrayList<Integer> expResult = null;
//        ArrayList<Integer> result = instance.getFreq();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of inHand method, of class Game.
//     */
//    @Test
//    public void testInHand() {
//        System.out.println("inHand");
//        Card card = null;
//        Game instance = new Game();
//        instance.inHand(card);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCurrentPlayers method, of class Game.
//     */
//    @Test
//    public void testGetCurrentPlayers() {
//        System.out.println("getCurrentPlayers");
//        Game instance = new Game();
//        ArrayList<String> expResult = null;
//        ArrayList<String> result = instance.getCurrentPlayers();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createCard method, of class Game.
//     */
//    @Test
//    public void testCreateCard() {
//        System.out.println("createCard");
//        String url = "";
//        Game instance = new Game();
//        Card expResult = null;
//        Card result = instance.createCard(url);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getWhoAsked method, of class Game.
//     */
//    @Test
//    public void testGetWhoAsked() {
//        System.out.println("getWhoAsked");
//        Game instance = new Game();
//        String expResult = "";
//        String result = instance.getWhoAsked();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isMatch method, of class Game.
//     */
//    @Test
//    public void testIsMatch() {
//        System.out.println("isMatch");
//        Card card = null;
//        String name = "";
//        Game instance = new Game();
//        String expResult = "";
//        String result = instance.isMatch(card, name);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkHand method, of class Game.
//     */
//    @Test
//    public void testCheckHand() {
//        System.out.println("checkHand");
//        Game instance = new Game();
//        int expResult = 0;
//        int result = instance.checkHand();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPlayerCount method, of class Game.
//     */
//    @Test
//    public void testGetPlayerCount() {
//        System.out.println("getPlayerCount");
//        Game instance = new Game();
//        int expResult = 0;
//        int result = instance.getPlayerCount();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
