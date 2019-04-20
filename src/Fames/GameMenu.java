/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fames;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
public class GameMenu {
   
   JFrame gamemenu; 
   JLabel lgmenu;
   JButton ticktacktoe, guessthenumber;
   FlowLayout flayout;
   BorderLayout blayout;
  
  
   

GameMenu(){
    gamemenu = new JFrame();
    ticktacktoe = new JButton();
    guessthenumber = new JButton();
    blayout = new BorderLayout();
    lgmenu = new JLabel("Game Menu");
    
    ticktacktoe.setText("Tick Tack Toe");
    guessthenumber.setText("Guess The Number");
    gamemenu.setTitle("Game Menu");
    gamemenu.setSize(300,250);
    gamemenu.setDefaultCloseOperation(3);
    gamemenu.setLayout(blayout);
    gamemenu.setLocationRelativeTo(null);
    gamemenu.add(lgmenu,BorderLayout.NORTH);
    gamemenu.add(ticktacktoe, BorderLayout.EAST);
    gamemenu.add(guessthenumber, BorderLayout.WEST);
    
    gamemenu.setVisible(true);

}
   
}
