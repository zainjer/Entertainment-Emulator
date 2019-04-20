
package entertainmentemulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EntertainmentEmulator extends JFrame {
   
    JFrame MainMenu;
    JButton Gmenu;
    JButton Quiz;
    JButton exit;
    JLabel LMain;
    
   EntertainmentEmulator(){
       
       MainMenu = new JFrame();
       Gmenu = new JButton("Game Menu");
       Quiz = new JButton("G.K. Quiz");
       LMain = new JLabel("Main Menu");
       exit = new JButton("Exit");
       
       MainMenu.add(LMain);
            LMain.setBounds(135, 80, 800, 60);
           // LMain.setOpaque(true);
            LMain.setBackground(Color.white);
            LMain.setForeground(Color.blue);
            LMain.setFont(new Font(LMain.getFont().getName(),LMain.getFont().getStyle(), 25 ));
       
       MainMenu.add(Quiz);
            Quiz.setBounds(75, 150, 120, 30);
            Quiz.addActionListener(new ActionListener(){
                 @Override
                    public void actionPerformed(ActionEvent e){
                     GKQuiz a = new GKQuiz();
                     a.GKQuiz.show();
                     MainMenu.hide();
                }});
       
       MainMenu.add(Gmenu);
            Gmenu.setBounds(200, 150, 120, 30);
                Gmenu.addActionListener(new ActionListener(){
                 @Override
                    public void actionPerformed(ActionEvent e){
                     GameMenu a = new GameMenu();
                     a.FGameMenu.show();
                     MainMenu.hide();
                }});
       MainMenu.add(exit);
            exit.setBounds(-1,345,400,20);
             exit.addActionListener(new ActionListener(){
                 @Override
                    public void actionPerformed(ActionEvent e){
                    System.exit(0); 
                    }});
      
       MainMenu.setTitle("Entertainment Emulator");
   
       MainMenu.setBackground(Color.white);
       MainMenu.setSize(400, 400);
       MainMenu.setLayout(null);
       MainMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
       MainMenu.setResizable(false);
       MainMenu.setLocationRelativeTo(null);
       MainMenu.setVisible(true);
   }
        public static void main(String[] args){
        
          // EntertainmentEmulator EEObj = new EntertainmentEmulator();
           Qsports obj = new Qsports();
        } 
       
   }
    

