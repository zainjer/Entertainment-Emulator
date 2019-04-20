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
public class Qsports {
    
    JFrame Qsports;
    JButton next,back,tryagain;
    JLabel QuestionNo,Ls,Question,Lscore,Lresult,Lattempts;
    JRadioButton a,b,c,d;
    ButtonGroup choices;
    public int n=1,counter=0,attempt=0,radiobuttonselection=0;
 

Qsports(){
    
    Qsports=new JFrame();
    next = new JButton("Next");
    back = new JButton("< Back");
    QuestionNo = new JLabel();
    Question = new JLabel();
    Lresult = new JLabel();
    Lattempts = new JLabel();
    Lscore = new JLabel();
    Ls = new JLabel();
    a = new JRadioButton();
    b = new JRadioButton();
    c = new JRadioButton();
    d = new JRadioButton();
    tryagain = new JButton("Try Again");
    Qsports.add(Ls);
     Ls.setText("Sports");
        Ls.setBounds(150, 20, 800, 60); 
            Ls.setForeground(Color.blue);
            Ls.setFont(new Font(Ls.getFont().getName(),Ls.getFont().getStyle(), 25 ));
    
    Qsports.add(Lresult);
        Lresult.setBounds(115, 100, 800, 60);
        Lresult.setForeground(Color.DARK_GRAY);
        Lresult.setFont(new Font(Lresult.getFont().getName(),Lresult.getFont().getStyle(), 20 ));
        Lresult.hide();
        
    Qsports.add(Lscore);
    Lscore.setBounds(255, 84, 90, 90);
    Lscore.setForeground(Color.red);
        Lscore.setFont(new Font(Lscore.getFont().getName(),Lscore.getFont().getStyle(), 35 ));
        Lscore.hide();
    
    Qsports.add(Lattempts);
        Lattempts.setBounds(130,130 , 150, 90);
        Lattempts.hide();
    
    Qsports.add(tryagain);
        tryagain.setBounds(145,200,100,30);
        tryagain.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent n){
            tryagain();
        }
        });
        tryagain.hide();
    Qsports.add(QuestionNo);
            QuestionNo.setBounds(140, 75, 800,50);
            QuestionNo.setFont(new Font(QuestionNo.getFont().getName(),QuestionNo.getFont().getStyle(), 14));            
    
    Qsports.add(Question);
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
        
    Qsports.add(a);
         a.setBounds(115,170, 300,13);
            a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q1){
                radiobuttonselection=1;
            }});
   
    Qsports.add(b);
        b.setBounds(115,190, 300,13);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q2){
                radiobuttonselection=2;    
            }});
    Qsports.add(c);
        c.setBounds(115,210, 300,13);
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q3){
                radiobuttonselection=3;
            }});
    Qsports.add(d);
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
    Qsports.add(next);
   
    Qsports.add(back);
    back.setBounds(-1,345,400,20);
              back.addActionListener(new ActionListener(){
                 
                    public void actionPerformed(ActionEvent e){
                     GKQuiz b = new GKQuiz();
                     Qsports.hide();
                     b.GKQuiz.show();
                }});
  
Qsports.setSize(400,400);
Qsports.setTitle("Entertainment Emulator");
Qsports.setLayout(null);
Qsports.setDefaultCloseOperation(EXIT_ON_CLOSE);
Qsports.setResizable(false);
Qsports.setLocationRelativeTo(null);
Qsports.setVisible(true);
}
void questionchange(int f){
    switch(f){
        
        case 1:
        {QuestionNo.setText("Question no: "+n);
        Question.setBounds(5, 130, 400, 30);
            Question.setText("Pakistan became world champion of cricket, hokey and snooker in?");
        a.setText("1996");
        b.setText("1994");
        c.setText("1990");
        d.setText("1992");
    break;
        }
        case 2:{QuestionNo.setText("Question no: "+n);
        Question.setBounds(70, 130, 350, 30);
     Question.setText("The shape of basketball court is?");
     a.setText("hexagonal");
     b.setText("square");
     c.setText("circle");
     d.setText("rectangular");
    break;
        }
        case 4:{QuestionNo.setText("Question no: "+n);
     Question.setBounds(20, 130, 390, 30);
        Question.setText("Which country was the runner up of ICC T20 tournament 2007?");
     a.setText("England");
     b.setText("India");
     c.setText("China");
     d.setText("Pakistan");
    break;
        }
        case 3:{QuestionNo.setText("Question no: "+n);
     Question.setBounds(30, 130, 350, 30);
        Question.setText("First cricket world cup was played in England in the year of?");
     a.setText("1975");
     b.setText("1978");
     c.setText("1972");
     d.setText("1976");
    break;
        }
        case 5:{QuestionNo.setText("Question no: "+n);
    Question.setBounds(70, 130, 350, 30);
        Question.setText("The traditional folk game of Punjab is?");
     a.setText("football");
     b.setText("ice hockey");
     c.setText("kabadi");
     d.setText("hockey");
    break;
        }
        case 6:{QuestionNo.setText("Question no: "+n);
     Question.setBounds(40, 130, 350, 30);
        Question.setText("highest wicket taker Pakistani bowler in test cricket is ?");
     a.setText("Waqar Younus");
     b.setText("Aqib Javaid");
     c.setText("Wasim Akram");
     d.setText("Imran Khan");
    break;
        }
        case 7:{QuestionNo.setText("Question no: "+n);
        Question.setBounds(70, 130, 350, 30);
     Question.setText("In cricket istance between the wickets is?");
     a.setText("24 yards");
     b.setText("25 yards");
     c.setText("20 yards");
     d.setText("22 yards");
    break;
        }
        case 8:{QuestionNo.setText("Question no: "+n);
        Question.setBounds(60, 130, 350, 30);
     Question.setText("Ground of which sport has the shape of diamond?");
     a.setText("hokey ");
     b.setText("baseball ");
     c.setText("square      ");
     d.setText("table tennis ");
    break;
        }
        case 9:{QuestionNo.setText("Question no: "+n);
     Question.setBounds(70, 130, 350, 30);
        Question.setText("boxing is called noble art of?");
     a.setText("fight      ");
     b.setText("self defence      ");
     c.setText("hate       ");
     d.setText("love   ");
    break;
        }
        case 10:{QuestionNo.setText("Question no: "+n);
     Question.setBounds(30, 130, 350, 30);
        Question.setText("the winner of the first world cup hockey tournament was?");
     a.setText("Pakistan  ");
     b.setText("Spain        ");
     c.setText("England      ");
     d.setText("India       ");
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
         if (n==3){
                    ++counter;
                }
         attempt++;
     }
      if (radiobuttonselection==2){
          if(n==1||n==8||n==9){
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
           if (n==2||n==4||n==7||n==10){
                    ++counter;
                }
           attempt++;
      }
      
 }
}