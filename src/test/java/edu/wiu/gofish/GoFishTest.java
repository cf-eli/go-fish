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
    
    private String ai_match_result;
    private ArrayList<Integer> ai_checkgameover_result0 = new ArrayList<>();
    private ArrayList<Integer> ai_checkgameover_result1 = new ArrayList<>();
    private ArrayList<Card> ai_cardpick = new ArrayList<>();
    
    int turncounter = 0;
    String cpuresult;
    
    
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
                testgame.setNextPlayerTurn();
                checkgameover_result1.add(testgame.checkGameOver());
                turncounter = 0;

            }else{
                turncounter++;
                if(turncounter >= testgame.getCurrentTurnPlayer().getHand().size())
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
            //pick card
            cpuresult = ((Ai)testgame.getCurrentTurnPlayer()).runAi(testgame);
            ai_cardpick.add(((Ai)testgame.getCurrentTurnPlayer()).getCurrentCard());
            ai_checkgameover_result0.add(testgame.checkGameOver());
            
            if(cpuresult.equals("matched")){
                turncounter++;
                taketurn_ai(); 
                
            }else{
                testgame.goFish();
                ai_checkgameover_result1.add(testgame.checkGameOver());
                if(turncounter >= testgame.getCurrentTurnPlayer().getHand().size())
                    turncounter = 0;
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
     */
    @Test
    public void testRoundAA() {
        
        this.taketurn_player();
        //add asserts here
        
        clearArrayPlayer();

    }
    @Test
    public void testRoundAB() {
        
        this.taketurn_ai();
        //add asserts here
        clearArrayAi();

    }
    
    @Test
    public void testRoundBA() {
        this.taketurn_player();
        //add asserts here
        
        clearArrayPlayer();

    }
    @Test
    public void testRoundBB() {
        
        this.taketurn_ai();
        //add asserts here
        
        clearArrayAi();

    }
    @Test
    public void testRoundCA() {
        
        this.taketurn_player();
        //add asserts here
        
        clearArrayPlayer();

    }
    @Test
    public void testRoundCB() {
        
        this.taketurn_ai();
        //add asserts here
        
        clearArrayAi();

    }
    
    @Test
    public void testRoundDA() {
        
        this.taketurn_player();
        
        //add asserts here
        
        clearArrayPlayer();

    }
    
    //make this one the "winning" game
    @Test
    public void testRoundDB() {
        
        this.taketurn_ai();
        //add asserts here
        
        clearArrayAi();

    }
    
}
