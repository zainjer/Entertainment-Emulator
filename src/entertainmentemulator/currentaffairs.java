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




public class currentaffairs {
    
    JFrame caa;
    JButton next,back,tryagain;
    JLabel LCa,QuestionNo,Question,Lscore,Lresult,Lattempts;
    JRadioButton a,b,c,d;
    ButtonGroup choices;
    public int n=1,counter=0,attempt=0,radiobuttonselection=0;

    currentaffairs(){
    
    caa=new JFrame();
    next = new JButton("Next");
    back = new JButton("< Back");
    QuestionNo = new JLabel();
    Question = new JLabel();
    Lresult = new JLabel();
    Lattempts = new JLabel();
    Lscore = new JLabel();
    LCa = new JLabel();
    a = new JRadioButton();
    b = new JRadioButton();
    c = new JRadioButton();
    d = new JRadioButton();
    tryagain = new JButton("Try Again");

    caa.add(LCa);
     LCa.setText("CURRENT AFFAIRS");
        LCa.setBounds(75, 20, 800, 60);
            LCa.setForeground(Color.blue);
            LCa.setFont(new Font(LCa.getFont().getName(),LCa.getFont().getStyle(), 25 ));
    
    caa.add(Lresult);
        Lresult.setBounds(115, 100, 800, 60);
        Lresult.setForeground(Color.DARK_GRAY);
        Lresult.setFont(new Font(Lresult.getFont().getName(),Lresult.getFont().getStyle(), 20 ));
        Lresult.hide();
        
    caa.add(Lscore);
    Lscore.setBounds(255, 84, 90, 90);
    Lscore.setForeground(Color.red);
        Lscore.setFont(new Font(Lscore.getFont().getName(),Lscore.getFont().getStyle(), 35 ));
        Lscore.hide();
    
    caa.add(Lattempts);
        Lattempts.setBounds(130,130 , 150, 90);
        Lattempts.hide();
    
    caa.add(tryagain);
        tryagain.setBounds(145,200,100,30);
        tryagain.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent n){
            tryagain();
        }
        });
        tryagain.hide();
    caa.add(QuestionNo);
            QuestionNo.setBounds(140, 75, 800,50);
            QuestionNo.setFont(new Font(QuestionNo.getFont().getName(),QuestionNo.getFont().getStyle(), 14));            
    
    caa.add(Question);
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
        
    caa.add(a);
         a.setBounds(115,170, 300,13);
            a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q1){
                radiobuttonselection=1;
            }});
   
    caa.add(b);
        b.setBounds(115,190, 300,13);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q2){
                radiobuttonselection=2;    
            }});
    caa.add(c);
        c.setBounds(115,210, 300,13);
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q3){
                radiobuttonselection=3;
            }});
    caa.add(d);
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
    caa.add(next);
   
    caa.add(back);
    back.setBounds(-1,345,400,20);
              back.addActionListener(new ActionListener(){
                 
                    public void actionPerformed(ActionEvent e){
                     GKQuiz b = new GKQuiz();
                     caa.hide();
                     b.GKQuiz.show();
                }});
  
caa.setSize(400,400);
caa.setTitle("Entertainment Emulator");
caa.setLayout(null);
caa.setDefaultCloseOperation(EXIT_ON_CLOSE);
caa.setResizable(false);
caa.setLocationRelativeTo(null);
caa.setVisible(true);
}
void questionchange(int f){
    switch(f){
        
        case 1:
        {QuestionNo.setText("Question no: "+n);
        Question.setBounds(60, 130, 350, 30);
        Question.setText("Who is current secretary general of the United Nations?");
        a.setText("Javier Perez de Cuellar");
        b.setText("Kofi Annan");
        c.setText("Ban-Ki-Moon");
        d.setText("Antonio Guterres");
    break;
        }
        case 2:{QuestionNo.setText("Question no: "+n);
     Question.setBounds(30, 130, 350, 30);
        Question.setText("Antonio Guterres became secretary of the United Nations on");
     a.setText("1 January 2017");
     b.setText("3 January 2017");
     c.setText("5 January 2017");
     d.setText("7 January 2017");
    break;
        }
        case 3:{QuestionNo.setText("Question no: "+n);
     Question.setBounds(30, 130, 350, 30);
        Question.setText("Secretary general United Nations Antonio Guterres belongs to");
     a.setText("United States");
     b.setText("Portugal");
     c.setText("Czech Republic");
     d.setText("Germany");
    break;
        }
        case 4:{QuestionNo.setText("Question no: "+n);
     Question.setBounds(40, 130, 350, 30);
        Question.setText("The United States presidential elections were held on");
     a.setText("November 5, 2016");
     b.setText("November 6, 2016");
     c.setText("November 7, 2016");
     d.setText("November 8, 2016");
    break;
        }
        case 5:{QuestionNo.setText("Question no: "+n);
     Question.setBounds(30, 130, 350, 30);
        Question.setText("Barack Obama, the ex-president of the United States belongs to");
     a.setText("File Transfer Position");
     b.setText("File Transfer Protection");
     c.setText("File Transfer Protocol");
     d.setText("File Transfer Possibility");
    break;
        }
        case 6:{QuestionNo.setText("Question no: "+n);
     Question.setBounds(30, 130, 350, 30);
        Question.setText(" President Donald Trump was the presidential nominee of the");
     a.setText("Democratic Party");
     b.setText("Republican Party");
     c.setText("Libertarian Party");
     d.setText("Green Party");
    break;
        }
        case 7:{QuestionNo.setText("Question no: "+n);
     Question.setBounds(30, 130, 350, 30);
        Question.setText("President Donald Trump took office of the presidency on");
     a.setText("18 January 2017");
     b.setText("20 January 2017");
     c.setText("22 January 2017");
     d.setText("24 January 2017");
    break;
        }
        case 8:{QuestionNo.setText("Question no: "+n);
      Question.setBounds(30, 130, 350, 30);
        Question.setText("Hillary Clinton has also served US from 2009 to 2013 as ");
     a.setText("Vice President");
     b.setText("Foreign Minister");
     c.setText("Secretary of States");
     d.setText("Interior Minister");
    break;
        }
        
        case 9:{QuestionNo.setText("Question no: "+n);
      Question.setBounds(70, 130, 350, 30);
        Question.setText("The largest museum in the world is");
     a.setText("Vatican Museum");
     b.setText("State Hermitage Museum");
     c.setText("Louvre Museum");
     d.setText("National Museum of China");
    break;
        }
        case 10:{QuestionNo.setText("Question no: "+n);
     Question.setText("The Louvre Museum is located in");
     a.setText("France");
     b.setText("Italy");
     c.setText("United States");
     d.setText("United Kingdom");
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
         if (n==2||n==5||n==10){
                    ++counter;
                }
         attempt++;
     }
      if (radiobuttonselection==2){
          if(n==3||n==6||n==7){
                   ++counter;
          } 
          attempt++;
          
      }
      if (radiobuttonselection==3){
          if (n==8||n==9){
                    ++counter;
                } 
          attempt++;
      }
      if (radiobuttonselection==4){
           if (n==1||n==4){
                    ++counter;
                }
           attempt++;
      }
      
 }
}
