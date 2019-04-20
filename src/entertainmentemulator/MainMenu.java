/*
package Fames;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
public class MainMenu {
    JFrame mainmenu;
    JButton quiz,gamemenu;
    JTextField text;
    FlowLayout flayout;
    BorderLayout blayout;
    JLabel lmmenu;
     public static void main(String[] args) {
         MainMenu mmenu = new MainMenu();
         GameMenu gmenu = new GameMenu();     
     }
    MainMenu() {
        mainmenu = new JFrame();
        mainmenu.setTitle("Entertainment Emulator");
        mainmenu.setSize(300,250);
        mainmenu.setLocationRelativeTo(null);
        
        
        blayout = new BorderLayout();
        mainmenu.setLayout(flayout);
       lmmenu = new JLabel("Main Menu");
    
    

        quiz = new JButton();
        quiz.setText("G K Quiz");
        quiz.setSize(500,300);
        
        gamemenu = new JButton();
        gamemenu.setText("Game Menu");
        gamemenu.setSize(300,250);
        
        mainmenu.add(lmmenu);
        mainmenu.add(quiz);
        mainmenu.add(gamemenu);
        mainmenu.setVisible(true);
                
      
    }
    
}
*/