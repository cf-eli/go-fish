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
     * Set player 0 (Eli) as winner and check if he won
     */
    @Test
    public void testGetWinner() {
        for(int i = 0; i<8;i++){
            game.getPlayer(0).increaseScore();
        }
        game.checkGameOver();
        assertEquals("Eli", game.getWinner());
    }

    /**
     * get current turn name of the player which in this case is Eli
     * since player always go first then set next turn and test to see if it's 
     * computer since Computer is next after Eli
     */
    @Test
    public void testGetCurrentTurnName() {
        assertEquals("Eli", game.getCurrentTurnName());
        game.setNextPlayerTurn();
        assertEquals("Computer", game.getCurrentTurnName());
    }

    /**
     * Make sure it return the correct turn number
     */
    @Test
    public void testGetCurrentTurn() {
        assertEquals(0, game.getCurrentTurn());
        game.setNextPlayerTurn();
        assertEquals(1, game.getCurrentTurn());
    }

    /**
     * Similar to getCurrentTurnName method, except it returns the player class
     * 
     */
    @Test
    public void testGetCurrentTurnPlayer() {
        assertEquals("Eli", game.getCurrentTurnPlayer().getName());
        game.setNextPlayerTurn();
        assertEquals("Computer", game.getCurrentTurnPlayer().getName());
    }

    /**
     * Similar to last few methods, set the next turn, set next turn 53 times 
     * and check to make sure it lands on ai
     */
    @Test
    public void testSetNextPlayerTurn() {
        assertEquals(0, game.getCurrentTurn());
        for(int i = 0; i<47;i++){
            game.setNextPlayerTurn();
        }
        assertEquals(1,game.getCurrentTurn());
    }

    /**
     * Test of getImg method, of class Game.
     */
    @Test
    public void testGetImg() {
        assertEquals(game.getPlayer(0).getImg(),game.getImg());
    }

    /**
     * Test of getFreq method, of class Game.
     */
    @Test
    public void testGetFreq() {
        assertEquals(game.getPlayer(0).getHandFreq(),game.getFreq());
    }

//    /**
//     * for test only
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
    /**
     * Return amount of current players and make sure it's 2 and then 3
     */
    @Test
    public void testGetCurrentPlayers() {
        assertEquals(2,game.getCurrentPlayers().size());
        String computer2 = "Computer";
        game.addAi(computer2, 1);
        assertEquals(3,game.getCurrentPlayers().size());
    }

    /**
     * Use url to create card and match it to expected
     */
    @Test
    public void testCreateCard() {
        String url = "/1c.png";
        Card card = game.createCard(url);
        Card trueCard = new Card(1,0);
        assertEquals(trueCard.getRank(), card.getRank());
        assertEquals(trueCard.getSuit(), card.getSuit());
    }

    /**
     * Get currentTurnName, same as previous
     */
    @Test
    public void testGetWhoAsked() {
        assertEquals("Eli",game.getWhoAsked());
        game.setNextPlayerTurn();
        assertEquals("Computer",game.getWhoAsked());
    }

    /**
     * If I wanted to 5head here, clone a card from player and check if it
    match
     */
    @Test
    public void testIsMatch() {
        game.setNextPlayerTurn();
        Card card = new Card(1,1);
        game.getPlayer(0).addCard(card);
        String match = game.isMatch(card, "Eli", game);
        assertEquals("Matched", match);
    }

    /**
     * Check hand and it should be false since game just started, clone 4 cards 
     * and add them to deck and check hand, should return true.
     */
    @Test
    public void testCheckHand() {
        assertEquals(0,game.checkHand());  
        Card card = new Card(1,1);
        game.getPlayer(0).addCard(card);
        game.getPlayer(0).addCard(card);
        game.getPlayer(0).addCard(card);
        game.getPlayer(0).addCard(card);
        assertEquals(1,game.checkHand());
    }

    /**
     * Check if there's 2 players which is given, then add another player and 
     * check for 3 players
     */
    @Test
    public void testGetPlayerCount() {
        assertEquals(2,game.getPlayerCount());
        game.addPlayer("Alex");
        assertEquals(3,game.getPlayerCount());
        
    }
    
}
