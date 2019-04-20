
package entertainmentemulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class computerscience {
    
    JFrame Fcs;
    JButton next,back,tryagain;
    JLabel QuestionNo,LCS,Question,Lscore,Lresult,Lattempts;
    JRadioButton a,b,c,d;
    ButtonGroup choices;
    public int n=1,counter=0,attempt=0,radiobuttonselection=0;
 

computerscience(){
    
    Fcs=new JFrame();
    next = new JButton("Next");
    back = new JButton("< Back");
    QuestionNo = new JLabel();
    Question = new JLabel();
    Lresult = new JLabel();
    Lattempts = new JLabel();
    Lscore = new JLabel();
    LCS = new JLabel();
    a = new JRadioButton();
    b = new JRadioButton();
    c = new JRadioButton();
    d = new JRadioButton();
    tryagain = new JButton("Try Again");
    Fcs.add(LCS);
     LCS.setText("COMPUTER SCIENCE");
        LCS.setBounds(65, 20, 800, 60); 
            LCS.setForeground(Color.blue);
            LCS.setFont(new Font(LCS.getFont().getName(),LCS.getFont().getStyle(), 25 ));
    
    Fcs.add(Lresult);
        Lresult.setBounds(115, 100, 800, 60);
        Lresult.setForeground(Color.DARK_GRAY);
        Lresult.setFont(new Font(Lresult.getFont().getName(),Lresult.getFont().getStyle(), 20 ));
        Lresult.hide();
        
    Fcs.add(Lscore);
    Lscore.setBounds(255, 84, 90, 90);
    Lscore.setForeground(Color.red);
        Lscore.setFont(new Font(Lscore.getFont().getName(),Lscore.getFont().getStyle(), 35 ));
        Lscore.hide();
    
    Fcs.add(Lattempts);
        Lattempts.setBounds(130,130 , 150, 90);
        Lattempts.hide();
    
    Fcs.add(tryagain);
        tryagain.setBounds(145,200,100,30);
        tryagain.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent n){
            tryagain();
        }
        });
        tryagain.hide();
    Fcs.add(QuestionNo);
            QuestionNo.setBounds(140, 75, 800,50);
            QuestionNo.setFont(new Font(QuestionNo.getFont().getName(),QuestionNo.getFont().getStyle(), 14));            
    
    Fcs.add(Question);
        Question.setBounds(70, 130, 350, 30);
     next.setBounds(157,280,80,30);
        next.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){  
                       radiobuttonselection();
                       radiobuttonselection=0;
                       n++;
                       questionchange(n);
                       choices.clearSelection();
                       
                    }});
        
    Fcs.add(a);
         a.setBounds(115,170, 300,13);
            a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q1){
                radiobuttonselection=1;
            }});
   
    Fcs.add(b);
        b.setBounds(115,190, 300,13);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q2){
                radiobuttonselection=2;    
            }});
    Fcs.add(c);
        c.setBounds(115,210, 300,13);
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q3){
                radiobuttonselection=3;
            }});
    Fcs.add(d);
        d.setBounds(115,230,300,13);
        d.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q4){
                radiobuttonselection=4;
            }});
    choices = new ButtonGroup();
    choices.add(a);
    choices.add(b);
    choices.add(c);
    choices.add(d);
    questionchange(n);        
    Fcs.add(next);
   
    Fcs.add(back);
    back.setBounds(-1,345,400,20);
              back.addActionListener(new ActionListener(){
                 
                    public void actionPerformed(ActionEvent e){
                     GKQuiz b = new GKQuiz();
                     Fcs.hide();
                     b.GKQuiz.show();
                }});
  
Fcs.setSize(400,400);
Fcs.setTitle("Entertainment Emulator");
Fcs.setLayout(null);
Fcs.setDefaultCloseOperation(EXIT_ON_CLOSE);
Fcs.setResizable(false);
Fcs.setLocationRelativeTo(null);
Fcs.setVisible(true);
}
void questionchange(int f){
    switch(f){
        
        case 1:
        {QuestionNo.setText("Question no: "+n);
        Question.setText("The major language of World Wide Web is");
        a.setText("HTML");
        b.setText("PHP");
        c.setText("ASP.NET");
        d.setText("Java");
    break;
        }
        case 2:{QuestionNo.setText("Question no: "+n);
     Question.setText("HTML is an abbreviation for?");
     a.setText("HiTech Meaningful Language");
     b.setText("HyperText Meaningful Language");
     c.setText("HiTech Markup Language");
     d.setText("HyperText Markup Language");
    break;
        }
        case 3:{QuestionNo.setText("Question no: "+n);
     Question.setText("LAN is an abbreviation for?");
     a.setText("Large Access Network");
     b.setText("Local Access Network");
     c.setText("Large Area Network");
     d.setText("Local Area Network");
    break;
        }
        case 4:{QuestionNo.setText("Question no: "+n);
     Question.setText("URL is an abbreviation for?");
     a.setText("Universal Resource Locator");
     b.setText("Uniform Resource Locator");
     c.setText("Universal Resource Location");
     d.setText("Uniform Resource Location");
    break;
        }
        case 5:{QuestionNo.setText("Question no: "+n);
     Question.setText("FTP is an abbreviation for?");
     a.setText("File Transfer Position");
     b.setText("File Transfer Protection");
     c.setText("File Transfer Protocol");
     d.setText("File Transfer Possibility");
    break;
        }
        case 6:{QuestionNo.setText("Question no: "+n);
     Question.setText("IDE stands for?");
     a.setText("Integrated Dual Environment");
     b.setText("Inter Development Environment");
     c.setText("Integrated Development Environment");
     d.setText("Inter Dual Environment");
    break;
        }
        case 7:{QuestionNo.setText("Question no: "+n);
     Question.setText("A language that is close to human language is called");
     a.setText("Low-Level language");
     b.setText("High-Level language");
     c.setText("Programming language");
     d.setText("Machine language");
    break;
        }
        case 8:{QuestionNo.setText("Question no: "+n);
     Question.setText("A virus that replicates itself is called");
     a.setText("Bug");
     b.setText("Worm");
     c.setText("Bomb");
     d.setText("Hoax");
    break;
        }
        case 9:{QuestionNo.setText("Question no: "+n);
     Question.setText("conio.h stands for?");
     a.setText("character input output");
     b.setText("console input output");
     c.setText("common input output");
     d.setText("complex input output");
    break;
        }
        case 10:{QuestionNo.setText("Question no: "+n);
     Question.setText("SQL stands for?");
     a.setText("Structured Query Language");
     b.setText("Sequential Query Language");
     c.setText("Simple Query Language");
     d.setText("None Of These");
    break;
        }
        case 11:{
            result();
        break;
        }
    }
}
  void result(){
      Question.hide();
      QuestionNo.hide();
      a.hide();
      b.hide();
      c.hide();
      d.hide();
      next.hide();
      Lresult.setText("Your Score is");
      Lresult.show();
      Lscore.setText(""+counter);
      Lscore.show();
      Lattempts.setText("Number of Attempts: "+attempt);
      Lattempts.show();
      tryagain.show();
  } 
  void tryagain(){
      Lscore.hide();
      Lattempts.hide();
      Lresult.hide();
      n=1;
      counter=0;
      attempt=0;
      questionchange(n);
      Question.show();
      QuestionNo.show();
      a.show();
      b.show();
      c.show();
      d.show();
      next.show();
      tryagain.hide();
      n=1;
      questionchange(n);
  }
 void radiobuttonselection(){
     if (radiobuttonselection==1){
         if (n==1||n==10){
                    ++counter;
                }
         attempt++;
     }
      if (radiobuttonselection==2){
          if(n==4||n==7||n==8||n==9){
                   ++counter;
          } 
          attempt++;
          
      }
      if (radiobuttonselection==3){
          if (n==6||n==5){
                    ++counter;
                } 
          attempt++;
      }
      if (radiobuttonselection==4){
           if (n==2||n==3){
                    ++counter;
                }
           attempt++;
      }
      
 }
}
