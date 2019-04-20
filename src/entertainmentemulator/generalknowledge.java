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

public class generalknowledge {
    
    JFrame FGK;
    JButton next,back,tryagain;
    JLabel QuestionNo,LGK,Question,Lscore,Lresult,Lattempts;
    JRadioButton a,b,c,d;
    ButtonGroup choices;
    public int n=1,counter=0,attempt=0,radiobuttonselection=0;
 

generalknowledge(){
    FGK=new JFrame();
    next = new JButton("Next");
    back = new JButton("< Back");
    QuestionNo = new JLabel();
    Question = new JLabel();
    Lresult = new JLabel();
    Lattempts = new JLabel();
    Lscore = new JLabel();
    LGK = new JLabel();
    a = new JRadioButton();
    b = new JRadioButton();
    c = new JRadioButton();
    d = new JRadioButton();
    tryagain = new JButton("Try Again");
    FGK.add(LGK);
     LGK.setText("General Knowldge");
        LGK.setBounds(78, 20, 800, 60); 
            LGK.setForeground(Color.blue);
            LGK.setFont(new Font(LGK.getFont().getName(),LGK.getFont().getStyle(), 25 ));
    
    FGK.add(Lresult);
        Lresult.setBounds(115, 100, 800, 60);
        Lresult.setForeground(Color.DARK_GRAY);
        Lresult.setFont(new Font(Lresult.getFont().getName(),Lresult.getFont().getStyle(), 20 ));
        Lresult.hide();
        
    FGK.add(Lscore);
    Lscore.setBounds(255, 84, 90, 90);
    Lscore.setForeground(Color.red);
        Lscore.setFont(new Font(Lscore.getFont().getName(),Lscore.getFont().getStyle(), 35 ));
        Lscore.hide();
    
    FGK.add(Lattempts);
        Lattempts.setBounds(130,130 , 150, 90);
        Lattempts.hide();
    
    FGK.add(tryagain);
        tryagain.setBounds(145,200,100,30);
        tryagain.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent n){
            tryagain();
        }
        });
        tryagain.hide();
    FGK.add(QuestionNo);
            QuestionNo.setBounds(140, 75, 800,50);
            QuestionNo.setFont(new Font(QuestionNo.getFont().getName(),QuestionNo.getFont().getStyle(), 14));            
    
    FGK.add(Question);
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
        
    FGK.add(a);
         a.setBounds(115,170, 300,13);
            a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q1){
                radiobuttonselection=1;
            }});
   
    FGK.add(b);
        b.setBounds(115,190, 300,13);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q2){
                radiobuttonselection=2;    
            }});
    FGK.add(c);
        c.setBounds(115,210, 300,13);
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q3){
                radiobuttonselection=3;
            }});
    FGK.add(d);
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
    FGK.add(next);
   
    FGK.add(back);
    back.setBounds(-1,345,400,20);
              back.addActionListener(new ActionListener(){
                 
                    public void actionPerformed(ActionEvent e){
                     GKQuiz b = new GKQuiz();
                     FGK.hide();
                     b.GKQuiz.show();
                }});
  
FGK.setSize(400,400);
FGK.setTitle("Entertainment Emulator");
FGK.setLayout(null);
FGK.setDefaultCloseOperation(EXIT_ON_CLOSE);
FGK.setResizable(false);
FGK.setLocationRelativeTo(null);
FGK.setVisible(true);
}
void questionchange(int f){
    switch(f){
        
        case 1:
        {QuestionNo.setText("Question no: "+n);
        Question.setText("About ___% of Antarctica is covered by ice.");
        a.setText("97");
        b.setText("98");
        c.setText("99");
        d.setText("100");
    break;
        }
        case 2:{QuestionNo.setText("Question no: "+n);
     Question.setText("The World Wide Web was invented by");
     a.setText("Tim Berners-Lee");
     b.setText("Bob Kahn");
     c.setText("Steve Jobs");
     d.setText("Bill Gates");
    break;
        }
        case 3:{QuestionNo.setText("Question no: "+n);
     Question.setText("The birthplace of the World Wide Web was");
     a.setText("NASA");
     b.setText("Pentagon");
     c.setText("CERN");
     d.setText("Microsoft");
    break;
        }
        case 4:{QuestionNo.setText("Question no: "+n);
     Question.setBounds(50, 130, 350, 30);
        Question.setText("he longest land border between two countries is between");
     a.setText("US and Canada");
     b.setText("US and Mexico");
     c.setText("India and Pakistan");
     d.setText("South Korea and North Korea");
    break;
        }
        case 5:{QuestionNo.setText("Question no: "+n);
     Question.setBounds(70, 130, 350, 30);
        Question.setText("The world’s largest island is");
     a.setText("Greenland");
     b.setText("Finland");
     c.setText("Indonesia");
     d.setText("United Kingdom");
    break;
        }
        case 6:{QuestionNo.setText("Question no: "+n);
     Question.setText("The most dispersed country in the world is");
     a.setText("Maldives");
     b.setText("Indonesia");
     c.setText("Malaysia");
     d.setText("Philippines");
    break;
        }
        case 7:{QuestionNo.setText("Question no: "+n);
     Question.setText("Which country is also called “Rainbow Nation”?");
     a.setText("Japan");
     b.setText("Norway");
     c.setText("Netherlands");
     d.setText("South Africa");
    break;
        }
        case 8:{QuestionNo.setText("Question no: "+n);
     Question.setText("“Netherlands” literally means");
     a.setText("ideal location");
     b.setText("lower countries");
     c.setText("mouth of land");
     d.setText("land of sun set");
    break;
        }
        case 9:{QuestionNo.setText("Question no: "+n);
     Question.setText("Which country contains the most volcanoes in the world?");
     a.setText("character input output");
     b.setText("console input output");
     c.setText("common input output");
     d.setText("complex input output");
    break;
        }
        case 10:{QuestionNo.setText("Question no: "+n);
     Question.setText("Which country is the lowest in the world?");
     a.setText("Indonesia");
     b.setText("Maldives");
     c.setText("South Africa");
     d.setText("Netherlands");
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
         if (n==1||n==4||n==5||n==6||n==9){
                    ++counter;
                }
         attempt++;
     }
      if (radiobuttonselection==2){
          if(n==1||n==8||n==10){
                   ++counter;
          } 
          attempt++;
          
      }
      if (radiobuttonselection==3){
          if (n==3){
                    ++counter;
                } 
          attempt++;
      }
      if (radiobuttonselection==4){
           if (n==7){
                    ++counter;
                }
           attempt++;
      }
      
 }
}