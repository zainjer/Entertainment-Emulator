package entertainmentemulator;

import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameMenu extends JFrame{
    
    JFrame FGameMenu;
    JLabel LGame;
    JButton single,multi,backtomain;
    
    GameMenu(){
       
        FGameMenu = new JFrame();
        FGameMenu.hide();
        LGame = new JLabel("Game Menu");
        single = new JButton("Single Player");   
        multi = new JButton("Multi Player");
        backtomain = new JButton("< Back");    
       
        
        FGameMenu.add(LGame);
            LGame.setBounds(130, 80, 800, 60);
            LGame.setForeground(Color.blue);
            LGame.setFont(new Font(LGame.getFont().getName(),LGame.getFont().getStyle(), 25 ));
        
        FGameMenu.add(single);
             single.setBounds(75, 150, 120, 30);
             single.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                     SinglePlayer b = new SinglePlayer();
                     FGameMenu.hide();
                     b.SinglePlayer.show();
                }});   
             
             
             
        FGameMenu.add(multi);
            multi.setBounds(200, 150, 120, 30);
            multi.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            MultiPlayer m = new MultiPlayer();
            FGameMenu.hide();
            m.MultiPlayer.show(rootPaneCheckingEnabled);
            
            
        }
    });
        
        FGameMenu.add(backtomain);
           
            backtomain.setBounds(-1,345,400,20);
              backtomain.addActionListener(new ActionListener(){
                 
                    public void actionPerformed(ActionEvent e){
                     EntertainmentEmulator b = new EntertainmentEmulator();
                     FGameMenu.hide();
                     b.MainMenu.show();
                }});
       
            
        FGameMenu.setSize(400, 400);
        FGameMenu.setTitle("Entertainment Emulator");
        FGameMenu.setLayout(null);
        FGameMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FGameMenu.setResizable(false);
        FGameMenu.setLocationRelativeTo(null);
        FGameMenu.setVisible(true);
        
        
    }
    
}
