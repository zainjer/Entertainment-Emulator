package entertainmentemulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MultiPlayer {
    JFrame MultiPlayer;
    JButton a1,a2,a3,a4,a5,a6,a7,a8,a9,back,again;
    JLabel Ltictactoe,p1,p2,X,O,p1win,p2win,draw;
    int A1=0,A2=0,A3=0,A4=0,A5=0,A6=0,A7=0,A8=0,A9=0,w1=0;
    public int player=1; //1 for player 1, 2 for player 2
    
    MultiPlayer(){
        
        MultiPlayer = new JFrame();
        a1 = new JButton();
        a2 = new JButton();
        a3 = new JButton();
        a4 = new JButton();
        a5 = new JButton();
        a6 = new JButton();
        a7 = new JButton();
        a8 = new JButton();
        a9 = new JButton();
        back = new JButton("< Back");
        again = new JButton("New Game");
        Ltictactoe = new JLabel("Tic Tac Toe");
        p1 = new JLabel("Player 1");
        p2 = new JLabel("Player 2");
        X = new JLabel("X");
        O = new JLabel("O");
        p1win = new JLabel("Player 1 WINS!");
        p2win = new JLabel("Player 2 WINS!");
        draw = new JLabel ("Game Draw");
        
          MultiPlayer.add(Ltictactoe);
            Ltictactoe.setBounds(125, 20, 800, 60);
            Ltictactoe.setForeground(Color.blue);
            Ltictactoe.setFont(new Font(Ltictactoe.getFont().getName(),Ltictactoe.getFont().getStyle(), 25 ));
        
        MultiPlayer.add(a1);
            a1.setBounds(120, 100, 50, 40);
            a1.addActionListener(new ActionListener(){          
                    public void actionPerformed(ActionEvent e){
                      
                        switch(player){
                            case 1:{
                            a1.setText("X");
                            A1=1;
                            player=2;
                            O.show();
                            X.hide();
                            break;}
                            case 2:{
                                a1.setText("O");
                                A1=2;
                                player=1;
                                O.hide();
                                X.show();
                                break;}
                            
                        }
                        wincheck();
                        drawcheck();
                        a1.setEnabled(false);
                        
                     }}); 
      
        MultiPlayer.add(a2);
            a2.setBounds(170, 100, 50, 40);
            a2.addActionListener(new ActionListener(){          
                    public void actionPerformed(ActionEvent e){
                         
                         switch(player){
                            case 1:{
                            a2.setText("X");
                            A2=1;
                            player=2;
                            O.show();
                            X.hide();
                            break;}
                            case 2:{
                                a2.setText("O");
                                A2=2;
                                player=1;
                                O.hide();
                                X.show();
                                break;}
                        }
                        a2.setEnabled(false);
                        wincheck();
                        drawcheck();
                     }}); 
        
        MultiPlayer.add(a3);
        a3.setBounds(220, 100, 50, 40);
       a3.addActionListener(new ActionListener(){          
                    public void actionPerformed(ActionEvent e){
                      
                         switch(player){
                            case 1:{
                            a3.setText("X");
                            A3=1;
                            player=2;
                            O.show();
                            X.hide();
                            break;}
                            case 2:{
                                a3.setText("O");
                                A3=2;
                                player=1;
                                O.hide();
                                X.show();
                                break;}
                        }
                        a3.setEnabled(false); 
                        wincheck();
                        drawcheck();
                     }}); 
        
        MultiPlayer.add(a4);
        a4.setBounds(120, 140, 50, 40);
       a4.addActionListener(new ActionListener(){          
                    public void actionPerformed(ActionEvent e){
                        
                         switch(player){
                            case 1:{
                            a4.setText("X");
                            A4=1;
                            player=2;
                            O.show();
                            X.hide();
                            break;}
                            case 2:{
                                a4.setText("O");
                                A4=2;
                                player=1;
                                O.hide();
                                X.show();
                                break;}
                        }
                        a4.setEnabled(false); 
                        wincheck();
                        drawcheck();
                     }}); 
        
        MultiPlayer.add(a5);
        a5.setBounds(170, 140, 50, 40);
       a5.addActionListener(new ActionListener(){          
                    public void actionPerformed(ActionEvent e){
                         
                        switch(player){
                            case 1:{
                            a5.setText("X");
                            A5=1;
                            player=2;
                            O.show();
                            X.hide();
                            break;}
                            case 2:{
                                a5.setText("O");
                                A5=2;
                                player=1;
                                O.hide();
                                X.show();
                                break;}
                        }
                        a5.setEnabled(false);
                        wincheck();
                        drawcheck();
                     }}); 
        
        MultiPlayer.add(a6);
        a6.setBounds(220, 140, 50, 40);
       a6.addActionListener(new ActionListener(){          
                    public void actionPerformed(ActionEvent e){
                         
                        switch(player){
                            case 1:{
                            a6.setText("X");
                            A6=1;
                            player=2;
                            O.show();
                            X.hide();
                            break;}
                            case 2:{
                                a6.setText("O");
                                A6=2;
                                player=1;
                                O.hide();
                                X.show();
                                break;}
                        }
                        a6.setEnabled(false);
                        wincheck();
                        drawcheck();
                     }}); 
        
        MultiPlayer.add(a7);
        a7.setBounds(120, 180, 50, 40);
       a7.addActionListener(new ActionListener(){          
                    public void actionPerformed(ActionEvent e){
                         
                         switch(player){
                            case 1:{
                            a7.setText("X");
                            A7=1;
                            player=2;
                            O.show();
                            X.hide();
                            break;}
                            case 2:{
                                a7.setText("O");
                                A7=2;
                                player=1;
                                O.hide();
                                X.show();
                                break;}
                        }
                        a7.setEnabled(false);
                        wincheck();
                        drawcheck();
                     }}); 
        
        MultiPlayer.add(a8);
        a8.setBounds(170, 180, 50, 40);
       a8.addActionListener(new ActionListener(){          
                    public void actionPerformed(ActionEvent e){
                         
                        switch(player){
                            case 1:{
                            a8.setText("X");
                            A8=1;
                            player=2;
                            O.show();
                            X.hide();
                            break;}
                            case 2:{
                                a8.setText("O");
                                A8=2;
                                player=1;
                                O.hide();
                                X.show();
                                break;}
                        }
                        a8.setEnabled(false);
                        wincheck();
                        drawcheck();
                     }}); 
        
        MultiPlayer.add(a9);
        a9.setBounds(220, 180, 50, 40);
       a9.addActionListener(new ActionListener(){          
                    public void actionPerformed(ActionEvent e){
                         
                        switch(player){
                            case 1:{
                                a9.setText("X");
                                A9=1;
                                player=2;
                                O.show();
                                X.hide();
                                break;
                            }
                            case 2:{
                                a9.setText("O");
                                A9=2;
                                player=1;
                                O.hide();
                                X.show();
                                break;}
                        }
                        a9.setEnabled(false);
                        wincheck();
                        drawcheck();
                     }}); 
        
        MultiPlayer.add(p1);
        p1.setBounds(37, 100, 80, 80);
        p1.setForeground(Color.red);
        p1.setFont(new Font(p1.getFont().getName(),p1.getFont().getStyle(), 15 ));
        
        MultiPlayer.add(p2);
        p2.setBounds(300, 100, 80, 80);
        p2.setForeground(Color.red);
        p2.setFont(new Font(p2.getFont().getName(),p2.getFont().getStyle(), 15 ));
        
        MultiPlayer.add(X);
        X.setBounds(48, 130, 80, 80);
        X.setForeground(Color.black);
        X.setFont(new Font(X.getFont().getName(),X.getFont().getStyle(), 35 ));
        
        MultiPlayer.add(O);
        O.hide();
        O.setBounds(315, 130, 80, 80);
        O.setForeground(Color.black);
        O.setFont(new Font(O.getFont().getName(),O.getFont().getStyle(), 35 ));
        
        MultiPlayer.add(again);
            again.setBounds(147,225, 95,20);
            again.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    reseter();
            }});
        
        MultiPlayer.add(p1win);
            p1win.setBounds(75,235,300,100);
              p1win.setFont(new Font(p1win.getFont().getName(),p1win.getFont().getStyle(), 35 ));
              p1win.setForeground(Color.DARK_GRAY);
              p1win.hide();
        MultiPlayer.add(p2win);
            p2win.setBounds(75,235,300,100);
              p2win.setFont(new Font(p2win.getFont().getName(),p2win.getFont().getStyle(), 35 ));
              p2win.setForeground(Color.DARK_GRAY);
              p2win.hide();
        
         MultiPlayer.add(draw);
            draw.setBounds(100,235,300,100);
              draw.setFont(new Font(draw.getFont().getName(),draw.getFont().getStyle(), 35 ));
              draw.setForeground(Color.DARK_GRAY);  
              draw.hide();
              
        MultiPlayer.add(back);
            back.setBounds(-1, 345, 400, 20);
            back.addActionListener(new ActionListener(){
   
                    public void actionPerformed(ActionEvent e){
                     GameMenu b = new GameMenu();
                     MultiPlayer.hide();
                     b.FGameMenu.show();
                }});

        MultiPlayer.setSize(400,400);
        MultiPlayer.setTitle("Entertainment Emulator");
        MultiPlayer.setDefaultCloseOperation(3);
        MultiPlayer.setLayout(null);
        MultiPlayer.setResizable(false);
        MultiPlayer.setLocationRelativeTo(null);
        MultiPlayer.setVisible(true);
        
    }
    void drawcheck(){
        
        if (A1 != 0 && A2 != 0 && A3 != 0 && A4 != 0 && A5 != 0 && A6 != 0 && A7 != 0 && A8 != 0 && A9 != 0 && w1==0)
        {draw.show();
        O.hide();
        X.hide();}
    }
    void wincheck(){
        if ((A1==1 && A2==1 && A3==1)||
            (A4==1 && A5==1 && A6==1)||
            (A7==1 && A8==1 && A9==1)||
            (A1==1 && A4==1 && A7==1)||
            (A2==1 && A5==1 && A8==1)||
            (A3==1 && A6==1 && A9==1)||
            (A7==1 && A5==1 && A3==1)||
            (A1==1 && A5==1 && A9==1)){
            p1win.show();
                    a1.setEnabled(false);
                    a2.setEnabled(false);
                    a3.setEnabled(false);
                    a4.setEnabled(false);
                    a5.setEnabled(false);
                    a6.setEnabled(false);
                    a7.setEnabled(false);
                    a8.setEnabled(false);
                    a9.setEnabled(false);
                    w1=1;
                    O.hide();
                    draw.hide();
           
        }
        if ((A1==2 && A2==2 && A3==2)||
            (A4==2 && A5==2 && A6==2)||
            (A7==2 && A8==2 && A9==2)||
            (A1==2 && A4==2 && A7==2)||
            (A2==2 && A5==2 && A8==2)||
            (A3==2 && A6==2 && A9==2)||
            (A7==2 && A5==2 && A3==2)||
            (A1==2 && A5==2 && A9==2)){
            p2win.show();
                    a1.setEnabled(false);
                    a2.setEnabled(false);
                    a3.setEnabled(false);
                    a4.setEnabled(false);
                    a5.setEnabled(false);
                    a6.setEnabled(false);
                    a7.setEnabled(false);
                    a8.setEnabled(false);
                    a9.setEnabled(false);
                    w1=2;
                    X.hide(); 
                    draw.hide();
        }
    }
    void reseter(){
                    a1.setEnabled(true);
                    a2.setEnabled(true);
                    a3.setEnabled(true);
                    a4.setEnabled(true);
                    a5.setEnabled(true);
                    a6.setEnabled(true);
                    a7.setEnabled(true);
                    a8.setEnabled(true);
                    a9.setEnabled(true);
                    a1.setText("");
                    a2.setText("");
                    a3.setText("");
                    a4.setText("");
                    a5.setText("");
                    a6.setText("");
                    a7.setText("");
                    a8.setText("");
                    a9.setText("");
                    A1=0;
                    A2=0;
                    A3=0;
                    A4=0;
                    A5=0;
                    A6=0;
                    A7=0;
                    A8=0;
                    A9=0;
                    w1=0;
                    player=1;
                    X.show();
                    O.hide();
                    p1win.hide();
                    p2win.hide();
                    draw.hide();
    }
}
