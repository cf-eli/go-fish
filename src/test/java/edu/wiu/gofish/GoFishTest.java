/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.wiu.gofish;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Before;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Alex
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GoFishTest {
    static Game testgame;
    static Ai testai;
    static Player testplayer;
    
    private String match_result;
    private ArrayList<Integer> checkgameover_result0 = new ArrayList<>();
    private ArrayList<Integer> checkgameover_result1 = new ArrayList<>();
    private ArrayList<Card> cardpick = new ArrayList<>();
    private ArrayList<Card> player_draw = new ArrayList<>();
    
    private String ai_match_result;
    private ArrayList<Integer> ai_checkgameover_result0 = new ArrayList<>();
    private ArrayList<Integer> ai_checkgameover_result1 = new ArrayList<>();
    private ArrayList<Card> ai_cardpick = new ArrayList<>();
    private ArrayList<Card> ai_draw = new ArrayList<>();
    
    int turncounter = 0;
    String cpuresult;
    int turncountfinal = 0;
    
    
    //each round, test the:
    
    //current player
    //turn order
    //match result
    //checkgameover result 0 cards
    //checkgameover result 1 cards
    //card pick cards
    //game over condition
    //deck count
    //hand count
    
    
    public GoFishTest() {
    }
    
    @BeforeClass
    public static void beforeclass(){
        testgame = new Game();
        testplayer = new Player("testplayer");
        testai = new Ai("testai", 1);
        
        testgame.addPlayer(testplayer);
        testgame.addAi(testai);
        testgame.startGame();
        
        
    }
    
    //recursive method, simulating a turn for player
    public void taketurn_player(){
        if(testgame.getCurrentTurnPlayer().equals(testplayer)){
            //pick card button
            //cardpick.add(testgame.getPlayer(0).getHand().get(0));
            cardpick.add(testgame.getCurrentTurnPlayer().getHand().get(turncounter));

            //ask button
            match_result = testgame.isMatch(cardpick.get(turncounter), "testai", testgame);
            checkgameover_result0.add(testgame.checkGameOver());


            if(match_result.equals("Go Fish")){
                //draw  button
                player_draw.add(testgame.setNextPlayerTurn());
                checkgameover_result1.add(testgame.checkGameOver());
                turncountfinal = turncounter;
                turncounter = 0;

            }else{
                turncounter++;
                if(turncounter >= testgame.getCurrentTurnPlayer().getHand().size()-1)
                    turncounter = 0;
                taketurn_player();

            }
        }else{
            System.out.println("Something went wrong with player");
        
        }
    
    }
    //recursive method simulating a ai turn
    public void taketurn_ai(){
        if(testgame.getCurrentTurnPlayer() != testplayer){
            //picks a card and sets it in cpuresult
            cpuresult = ((Ai)testgame.getCurrentTurnPlayer()).runAi(testgame);
            
            //adds what card the ai chose and placed it in the array
            ai_cardpick.add(((Ai)testgame.getCurrentTurnPlayer()).getCurrentCard());
            //checks if game over and adds it to the gameover result arry
            ai_checkgameover_result0.add(testgame.checkGameOver());
            
            //if the result from runai() = matched:
            if(cpuresult.equals("Matched")){
                //increment counter and go through method again
                turncounter++;
                taketurn_ai(); 
                
            }else{
                //run the goFish() method, and store the checkgameover in a different array
                ai_draw.add(testgame.goFish());
                ai_checkgameover_result1.add(testgame.checkGameOver());
                if(turncounter >= testgame.getCurrentTurnPlayer().getHand().size()){
                    turncountfinal += turncounter;
                    turncounter = 0;
                }
                turncountfinal += turncounter;
                turncounter = 0;
                        
            }
        }else{
            System.out.println("something went wrong with ai");
        
        }
     
    }
    public void clearArrayPlayer(){
        this.cardpick.clear();
        this.checkgameover_result0.clear();
        this.checkgameover_result1.clear();
    }
    public void clearArrayAi(){
    
        this.ai_cardpick.clear();
        this.ai_checkgameover_result0.clear();
        this.ai_checkgameover_result1.clear();
        
    }

    /**
     * Test of main method, of class GoFish.
     * 
     */
    @Test
    public void testRoundAA() {
        clearArrayPlayer();
        this.taketurn_player();
        //add asserts here
        

        //check if it ends on "Go Fish"
        assertTrue(match_result.equals("Go Fish"));
        
        //loop through each checkgameover, should all be 0
        for(int i = 0; i <= checkgameover_result0.size()-1; i++){
            assertTrue(this.checkgameover_result0.get(i) == 0);
            
        }
        for(int i = 0; i <= checkgameover_result1.size()-1; i++){
            assertTrue(this.checkgameover_result1.get(i) == 0);
            
        }
        
        for (int i =0; i<= this.cardpick.size()-1; i++){
            assertTrue(testplayer.getHand().contains(cardpick.get(i)));
            
        }
        for (int i =0; i<= this.player_draw.size()-1; i++){
            assertTrue(testplayer.getHand().contains(this.player_draw.get(0)));
        }
        
        
    }
    
    @Test
    public void testRoundAAAdeckcount() {
        assertTrue(testgame.getDeck().getSize() == 37);
        
    }
    
    @Test
    public void testRoundAACgetcurrentplayer() {
        assertTrue(testgame.getCurrentTurnName().equals("testai"));
        
    }

        
    
    
    @Test
    public void testRoundAB() {

        this.taketurn_ai();
        //add asserts here

        //check if it ends on "Go Fish"
        assertEquals(this.cpuresult,"Go Fish");
        
        //loop through each checkgameover, should all be 0
        for(int i = 0; i <= ai_checkgameover_result0.size()-1; i++){
            assertTrue(this.ai_checkgameover_result0.get(i) == 0);
            
        }
        for(int i = 0; i <= ai_checkgameover_result1.size()-1; i++){
            assertTrue(this.ai_checkgameover_result1.get(i) == 0);
            
        }
        
        for (int i =0; i<= this.ai_cardpick.size()-1; i++){
            assertTrue(testai.getHand().contains(ai_cardpick.get(i)));
            
        }
        for (int i =0; i<= this.ai_draw.size()-1; i++){
            assertTrue(testai.getHand().contains(this.ai_draw.get(0)));
        }

    }
    
    @Test
    public void testRoundABAdeckcount() {
        assertTrue(testgame.getDeck().getSize() == 36);
        
    }
    
    @Test
    public void testRoundABCgetcurrentplayer() {
        assertTrue(testgame.getCurrentTurnName().equals("testplayer"));
        
    }
    
    @Test
    public void testRoundBA() {
        this.taketurn_player();
        //add asserts here
        
        //check if it ends on "Go Fish"
        assertTrue(match_result.equals("Go Fish"));
        
        //loop through each checkgameover, should all be 0
        for(int i = 0; i <= checkgameover_result0.size()-1; i++){
            assertTrue(this.checkgameover_result0.get(i) == 0);
            
        }
        for(int i = 0; i <= checkgameover_result1.size()-1; i++){
            assertTrue(this.checkgameover_result1.get(i) == 0);
            
        }
        
        for (int i =0; i<= this.cardpick.size()-1; i++){
            assertTrue(testplayer.getHand().contains(cardpick.get(i)));
            
        }
        for (int i =0; i<= this.player_draw.size()-1; i++){
            assertTrue(testplayer.getHand().contains(this.player_draw.get(0)));
        }

    }
    @Test
    public void testRoundBAAdeckcount() {
        assertTrue(testgame.getDeck().getSize() == 35);
        
    }
    
    @Test
    public void testRoundBABgetcurrentplayer() {
        assertTrue(testgame.getCurrentTurnName().equals("testai"));
        
    }
    @Test
    public void testRoundBB() {
        
        this.taketurn_ai();
        //add asserts here
        //check if it ends on "Go Fish"
        assertEquals(this.cpuresult,"Go Fish");
        
        //loop through each checkgameover, should all be 0
        for(int i = 0; i <= ai_checkgameover_result0.size()-1; i++){
            assertTrue(this.ai_checkgameover_result0.get(i) == 0);
            
        }
        for(int i = 0; i <= ai_checkgameover_result1.size()-1; i++){
            assertTrue(this.ai_checkgameover_result1.get(i) == 0);
            
        }
        
        for (int i =0; i<= this.ai_cardpick.size()-1; i++){
            assertTrue(testai.getHand().contains(ai_cardpick.get(i)));
            
        }
        for (int i =0; i<= this.ai_draw.size()-1; i++){
            assertTrue(testai.getHand().contains(this.ai_draw.get(0)));
        }

    }
    @Test
    public void testRoundBBAdeckcount() {
        assertEquals(testgame.getDeck().getSize(), 34);
        
    }
    
    @Test
    public void testRoundBBCgetcurrentplayer() {
        assertTrue(testgame.getCurrentTurnName().equals("testplayer"));
        
    }
    @Test
    public void testRoundCA() {
        
        this.taketurn_player();
        //add asserts here
        
        //check if it ends on "Go Fish"
        assertTrue(match_result.equals("Go Fish"));
        
        //loop through each checkgameover, should all be 0
        for(int i = 0; i <= checkgameover_result0.size()-1; i++){
            assertTrue(this.checkgameover_result0.get(i) == 0);
            
        }
        for(int i = 0; i <= checkgameover_result1.size()-1; i++){
            assertTrue(this.checkgameover_result1.get(i) == 0);
            
        }
        
        for (int i =0; i<= this.cardpick.size()-1; i++){
            assertTrue(testplayer.getHand().contains(cardpick.get(i)));
            
        }
        for (int i =0; i<= this.player_draw.size()-1; i++){
            assertTrue(testplayer.getHand().contains(this.player_draw.get(0)));
        }

    }
    @Test
    public void testRoundCAAdeckcount() {
        assertTrue(testgame.getDeck().getSize() == 33);
        
    }
    
    @Test
    public void testRoundCABgetcurrentplayer() {
        assertTrue(testgame.getCurrentTurnName().equals("testai"));
        
    }
    @Test
    public void testRoundCB() {
        
        this.taketurn_ai();
        //add asserts here
        
        //check if it ends on "Go Fish"
        assertEquals(this.cpuresult,"Go Fish");
        
        //loop through each checkgameover, should all be 0
        for(int i = 0; i <= ai_checkgameover_result0.size()-1; i++){
            assertTrue(this.ai_checkgameover_result0.get(i) == 0);
            
        }
        for(int i = 0; i <= ai_checkgameover_result1.size()-1; i++){
            assertTrue(this.ai_checkgameover_result1.get(i) == 0);
            
        }
        
        for (int i =0; i<= this.ai_cardpick.size()-1; i++){
            assertTrue(testai.getHand().contains(ai_cardpick.get(i)));
            
        }
        for (int i =0; i<= this.ai_draw.size()-1; i++){
            assertTrue(testai.getHand().contains(this.ai_draw.get(0)));
        }

    }
    @Test
    public void testRoundCBAdeckcount() {
        assertEquals(32, testgame.getDeck().getSize());
        
    }
    
    @Test
    public void testRoundCBCgetcurrentplayer() {
        assertTrue(testgame.getCurrentTurnName().equals("testplayer"));
        
    }
    
    @Test
    public void testRoundDA() {
        this.testgame.getPlayer(0).setPlayerscore(8);
        this.taketurn_player();
        assertEquals(true, testgame.getGameOver());
        //add asserts here
        
        clearArrayPlayer();

    }
    /*
    //make this one the "winning" game
    @Test
    public void testRoundDB() {
        
        this.taketurn_ai();
        //add asserts here
        
        clearArrayAi();

    }*/
    
}
