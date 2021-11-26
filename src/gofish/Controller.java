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
            this.startview.addStartGameListener(new ButtonListener());
            this.startview.addHelpGameListener(new ButtonListener2());
            }
        
        
        
      //actions for ActionListoner, each class is a new button function, add a new one for each interactable button. they can be reused if they do the same thing
        class ButtonListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("test1");
            }
            
        }
        class ButtonListener2 implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Test2");
            }
            
            
        }
        
        
        
    
}
