package entertainmentemulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GKQuiz extends JFrame{
    
JFrame GKQuiz;
JButton sports,ca,cs,gk,phy,back;
JLabel LQuiz,enter;

GKQuiz(){

    GKQuiz = new JFrame("Entertainment Emulator");
    sports = new JButton("Sports");
    ca = new JButton("Current Affairs");
    cs = new JButton("Computer Science");
    gk = new JButton("General Knowledge");
    phy= new JButton("Physics");
    enter = new JLabel("Select Your Desired Field");
    back = new JButton("< Back");
    LQuiz = new JLabel("G.K QUIZ");
    
    GKQuiz.add(ca);
    ca.setBounds(95, 110, 200, 35);
      ca.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                     currentaffairs a = new currentaffairs();
                     GKQuiz.hide();
                     a.caa.show();
                }});
    GKQuiz.add(cs);
    cs.setBounds(95, 150, 200, 35);
cs.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                     computerscience a = new computerscience();
                     GKQuiz.hide();
                     a.Fcs.show();
                }});     
    
    GKQuiz.add(sports);
    sports.setBounds(95, 190, 200, 35); 
     sports.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                     Qsports a = new Qsports();
                     GKQuiz.hide();
                     a.Qsports.show();
                }}); 
   
    GKQuiz.add(gk);
    gk.setBounds(95, 230, 200, 35); 
    gk.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                     generalknowledge a = new generalknowledge();
                     GKQuiz.hide();
                     a.FGK.show();
                }});
    
    GKQuiz.add(phy);
    phy.setBounds(95, 270, 200, 35);
     phy.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                     physics a = new physics();
                     GKQuiz.hide();
                     a.phy.show();
                }});
    
    GKQuiz.add(LQuiz);
     LQuiz.setBounds(137, 6, 800, 60);
            LQuiz.setForeground(Color.blue);
            LQuiz.setFont(new Font(LQuiz.getFont().getName(),LQuiz.getFont().getStyle(), 25 )); 
    
    GKQuiz.add(enter);
     enter.setBounds(124, 65, 800, 60);
        //    enter.setForeground(Color.black);
         //   enter.setFont(new Font(enter.getFont().getName(),enter.getFont().getStyle(), 15 )); 
    GKQuiz.add(back);
    back.setBounds(-1,345,400,20);
              back.addActionListener(new ActionListener(){
                 
                    public void actionPerformed(ActionEvent e){
                     EntertainmentEmulator b = new EntertainmentEmulator();
                     GKQuiz.hide();
                     b.MainMenu.show();
                }});

    GKQuiz.hide();
    GKQuiz.setLayout(null);
    GKQuiz.setDefaultCloseOperation(EXIT_ON_CLOSE);
    GKQuiz.setSize(400,400);
    GKQuiz.setResizable(false);
    GKQuiz.setLocationRelativeTo(null);
    GKQuiz.setVisible(true);
}

    
}
