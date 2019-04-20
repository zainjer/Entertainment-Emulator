package entertainmentemulator;

import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
        
public class SinglePlayer extends JFrame{
   JFrame SinglePlayer;
   JButton Go,back,again;
   JTextField Tgnumber;
   JLabel Lguessthenumber,instructions,Lresult,para,tries;
   String guessed,resultLabel;
   int randomnumber,answer,counter=0;
   
   SinglePlayer(){
       SinglePlayer = new JFrame();
       Go = new JButton("Go");
       back = new JButton("< Back");
       again = new JButton("New Game");
       Tgnumber = new JTextField();
       Lguessthenumber = new JLabel("Guess The Number!");
       instructions = new JLabel("Please enter a number from 1 to 100:");
       Lresult = new JLabel();
      // para = new JLabel("|");
       randomnumber = GenerateRandomNumber();
       
       
       SinglePlayer.add(Lguessthenumber);
        Lguessthenumber.setBounds(60,50, 800, 60);
            Lguessthenumber.setForeground(Color.blue);
                Lguessthenumber.setFont(new Font(Lguessthenumber.getFont().getName(),Lguessthenumber.getFont().getStyle(), 30 )); 
       
       SinglePlayer.add(instructions);
        instructions.setBounds(70,135,250,25);
       
       SinglePlayer.add(Tgnumber);
        Tgnumber.setBounds(290, 135,30, 25);
         
        SinglePlayer.add(Go);
            Go.setBounds(150,175,95,30);
                Go.addActionListener(new ActionListener(){          
                    public void actionPerformed(ActionEvent e){
                     guessed = Tgnumber.getText();
                     try{
                      answer = Integer.parseInt(guessed);
                     } 
                     catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null,"Please enter numeric values","Error!",2);
                         Lresult.setText("");
                     }
                     
                     if (answer<randomnumber){
                        counter++;
                         Lresult.setText("Your Guess is too Small");
                         again.hide();
                         Tgnumber.setText(null);
                     }
                     if (answer>randomnumber){
                         counter++;
                         Lresult.setText(" Your Guess is too big ");
                         again.hide();
                     Tgnumber.setText(null);
                     }
                     if (answer==randomnumber+3){
                         counter++;
                         Lresult.setText(" Your Guess is close but big ");
                         again.hide();
                     Tgnumber.setText(null);
                     }
                        if (answer==randomnumber+2){
                         counter++;
                         Lresult.setText(" Your Guess is close but big ");
                         again.hide();
                     Tgnumber.setText(null);
                     }
                           if (answer==randomnumber+1){
                         counter++;
                         Lresult.setText(" Your Guess is close but big ");
                         again.hide();
                     Tgnumber.setText(null);
                     }
                     if (answer==randomnumber-3){
                         counter++;
                         Lresult.setText(" Your Guess is close but small ");
                         again.hide();
                     Tgnumber.setText(null);
                     }
                     if (answer==randomnumber-2){
                         counter++;
                         Lresult.setText(" Your Guess is close but small ");
                         again.hide();
                     Tgnumber.setText(null);
                     }
                     if (answer==randomnumber-1){
                         counter++;
                         Lresult.setText(" Your Guess is close but small ");
                         again.hide();
                     Tgnumber.setText(null);
                     }
                  
                     if(answer==randomnumber){
                         String s =  Integer.toString(counter);
                         Lresult.setText("        No. of Tries: "+s);
                            JOptionPane.showMessageDialog(null,"Congratulations! You finally guessed the correct number!","Guess The Number", 1);
                            again.show();
                     }
                    }}); 
                again.hide();
                SinglePlayer.add(again);
                again.setBounds(150,280,95,20);
                     again.addActionListener(new ActionListener(){          
                    public void actionPerformed(ActionEvent e){
                        SinglePlayer.add(again);
                        Lresult.setText(" ");    
                        randomnumber = GenerateRandomNumber();
                        Tgnumber.setText("");
                        counter=0;
                        again.hide();
                    }});
        
               
                
       //SinglePlayer.add(para);
       // para.setBounds(128, 250, 3, 10);
       
       SinglePlayer.add(Lresult);
        Lresult.setBounds(136, 250, 200, 10);
        
       SinglePlayer.add(back);
        back.setBounds(-1,345,400,20);
              back.addActionListener(new ActionListener(){          
                    public void actionPerformed(ActionEvent e){
                     GameMenu b = new GameMenu();
                     b.FGameMenu.show();
                     SinglePlayer.hide();
                    }});

              
       SinglePlayer.setSize(400, 400);
       SinglePlayer.setTitle("Entertainment Emulator");
       SinglePlayer.setLayout(null);
       SinglePlayer.setDefaultCloseOperation(EXIT_ON_CLOSE);
       SinglePlayer.setResizable(false);
       SinglePlayer.hide();
       SinglePlayer.setLocationRelativeTo(null);
       SinglePlayer.setVisible(true);
   }
    int GenerateRandomNumber(){
       Random rand = new Random();
       int  n = rand.nextInt(100) + 1;
       return n;
    }
 }
