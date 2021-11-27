/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gofish;
import java.awt.event.ActionEvent;
import java.awt.event.*;

/**
 *
 * @author Alex
 */

public class Controller{
        private StartPage startview = new StartPage();
        private MainGui mainview = new MainGui();
        private HelpScreen helpview = new HelpScreen();
        private Win_LossScreen Win_lossview = new Win_LossScreen();
        
        private Game maingame = new Game();
        
        public Controller(StartPage view, Game model){
            this.startview = view;
            this.maingame = model;
            
            //these are are calling the methods in the ui file with the actionlistioner class from below, whatever is passed is the function that button will be assigned
            this.startview.addStartGameListener(new StartButtonListener());
            this.startview.addHelpGameListener(new HelpButtonListener());
            }
        
        
        
      //actions for ActionListoner, each class is a new button function, add a new one for each interactable button. they can be reused if they do the same thing
        //startgame buttons
        class StartButtonListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                //start button functions here
                //this should start start the game, add players, and set difficulty, then take away the start page and pull up the main page
                
                //gonna keep this at 2, add more later if needed
                if(startview.getPlayerNumbers() == "2"){
                    maingame.addPlayer(startview.getPlayerName());
                    maingame.addAi("computer1");
                    ((Ai)maingame.getPlayer(1)).setDifficulty(startview.getDifficulty());
                }
                maingame.startGame();
                maingame.setTurnOrder();
                //set the main view as visible and dispose of the startview
                mainview.setVisible(true);
                startview.dispose();
                
                //add game listeners here
                mainview.addHelpGameListener(new HelpButtonListener());
                mainview.addCloseGameListener(new CloseButtonListener());
                mainview.addResetGameListener(new ResetButtonListener());
                mainview.addDeckListener(new DeckButtonListener());
                mainview.addHandListener1(new HandButtonListener());
                mainview.addHandListener2(new HandButtonListener());
                mainview.addHandListener3(new HandButtonListener());
                mainview.addHandListener4(new HandButtonListener());
                mainview.addHandListener5(new HandButtonListener());
                mainview.addHandListener6(new HandButtonListener());
                mainview.addHandListener7(new HandButtonListener());
                mainview.addHandListener8(new HandButtonListener());
                mainview.addHandListener9(new HandButtonListener());
                mainview.addHandListener10(new HandButtonListener());
                mainview.addHandListener11(new HandButtonListener());
                mainview.addHandListener12(new HandButtonListener());
                mainview.addHandListener13(new HandButtonListener());
                
                
                
                //System.out.println(maingame.getPlayer(0));               
                //System.out.println(maingame.getPlayer(1));
                
                System.out.println("startbutton click");
            }
        }
        class HelpButtonListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                //help button functions here
                
                helpview.setVisible(true);
                helpview.addHelpCloseListener(new HelpCloseButtonListener());
                
                System.out.println("helpbutton click");
            } 
        }
        
        //help screen
       class HelpCloseButtonListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                //functions here
                helpview.dispose();              

            }
        }
       
        //game buttons
        class CloseButtonListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                //functions here
                System.exit(0);
                
            } 
        }
        class ResetButtonListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                //functions here
                mainview.dispose();
                StartPage start = new StartPage();
                Game game = new Game();
                Controller control = new Controller(start, game);
                start.setVisible(true);                

            } 
        }
        class DeckButtonListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                //functions here

            } 
        }
        class HandButtonListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                //functions here
                System.out.println("hand button click");

            } 
        }
        
        //button template
        class Listener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                //functions here

            } 
        }
        
        
    
}
