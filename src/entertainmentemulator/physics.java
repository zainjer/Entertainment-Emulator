
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


public class physics{
   
    JFrame phy;
    JButton next,back,tryagain;
    JLabel QuestionNo,Lphy,Question,Lscore,Lresult,Lattempts;
    JRadioButton a,b,c,d;
    ButtonGroup choices;
    public int n=1,counter=0,attempt=0,radiobuttonselection=0;
 

physics(){
    
    phy=new JFrame();
    next = new JButton("Next");
    back = new JButton("< Back");
    QuestionNo = new JLabel();
    Question = new JLabel();
    Lresult = new JLabel();
    Lattempts = new JLabel();
    Lscore = new JLabel();
    Lphy = new JLabel();
    a = new JRadioButton();
    b = new JRadioButton();
    c = new JRadioButton();
    d = new JRadioButton();
    tryagain = new JButton("Try Again");
    phy.add(Lphy);
     Lphy.setText("Physics");
        Lphy.setBounds(145, 20, 800, 60); 
            Lphy.setForeground(Color.blue);
            Lphy.setFont(new Font(Lphy.getFont().getName(),Lphy.getFont().getStyle(), 25 ));
    
    phy.add(Lresult);
        Lresult.setBounds(115, 100, 800, 60);
        Lresult.setForeground(Color.DARK_GRAY);
        Lresult.setFont(new Font(Lresult.getFont().getName(),Lresult.getFont().getStyle(), 20 ));
        Lresult.hide();
        
    phy.add(Lscore);
    Lscore.setBounds(255, 84, 90, 90);
    Lscore.setForeground(Color.red);
        Lscore.setFont(new Font(Lscore.getFont().getName(),Lscore.getFont().getStyle(), 35 ));
        Lscore.hide();
    
    phy.add(Lattempts);
        Lattempts.setBounds(130,130 , 150, 90);
        Lattempts.hide();
    
    phy.add(tryagain);
        tryagain.setBounds(145,200,100,30);
        tryagain.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent n){
            tryagain();
        }
        });
        tryagain.hide();
    phy.add(QuestionNo);
            QuestionNo.setBounds(140, 75, 800,50);
            QuestionNo.setFont(new Font(QuestionNo.getFont().getName(),QuestionNo.getFont().getStyle(), 14));            
    
    phy.add(Question);
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
        
    phy.add(a);
         a.setBounds(115,170, 300,13);
            a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q1){
                radiobuttonselection=1;
            }});
   
    phy.add(b);
        b.setBounds(115,190, 300,13);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q2){
                radiobuttonselection=2;    
            }});
    phy.add(c);
        c.setBounds(115,210, 300,13);
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent q3){
                radiobuttonselection=3;
            }});
    phy.add(d);
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
    phy.add(next);
   
    phy.add(back);
    back.setBounds(-1,345,400,20);
              back.addActionListener(new ActionListener(){
                 
                    public void actionPerformed(ActionEvent e){
                     GKQuiz b = new GKQuiz();
                     phy.hide();
                     b.GKQuiz.show();
                }});
  
phy.setSize(400,400);
phy.setTitle("Entertainment Emulator");
phy.setLayout(null);
phy.setDefaultCloseOperation(EXIT_ON_CLOSE);
phy.setResizable(false);
phy.setLocationRelativeTo(null);
phy.setVisible(true);
}
void questionchange(int f){
    switch(f){
        
        case 1:
        {QuestionNo.setText("Question no: "+n);
        Question.setText("Slope of work time graph is equal to");
        a.setText("displacement");
        b.setText("Acceleration");
        c.setText("power");
        d.setText("Energy");
    break;
        }
        case 2:{QuestionNo.setText("Question no: "+n);
     Question.setText("Work done on the body equals to the");
     a.setText("change in its K.E always");
     b.setText("change in its P.E always");
     c.setText("change in its K.E and change in its P.E");
     d.setText("neither K.E nor change P.E");
    break;
        }
        case 3:{QuestionNo.setText("Question no: "+n);
     Question.setText("Work done by the force of friction is");
     a.setText("always positive");
     c.setText("positive only for small frictional force");
     b.setText("always negative");
     d.setText("positive only for large frictional force");
    break;
        }
        case 4:{QuestionNo.setText("Question no: "+n);
     Question.setText("Which of the following is not conservative force");
     a.setText("friction");
     c.setText("gravitational");
     b.setText("Electric");
     d.setText("Magnetic");
    break;
        }
        case 5:{QuestionNo.setText("Question no: "+n);
     Question.setText("When body is in motion, It always changes it's");
     a.setText("its velocity");
     b.setText("its acceleration");
     c.setText("File Transfer Protocol");
     d.setText("File Transfer Possibility");
    break;
        }
        case 6:{QuestionNo.setText("Question no: "+n);
     Question.setText("A body is moving with uniform velocity. Its");
     a.setText("speed changes");
     b.setText("acceleration changes");
     c.setText("direction of motion changes");
     d.setText("displacement from origin changes");
    break;
        }
        case 7:{QuestionNo.setText("Question no: "+n);
     Question.setText("Area under velocity time graph represent");
     a.setText("force");
     b.setText("displacement");
     c.setText("distance");
     d.setText("acceleration");
    break;
        }
        case 8:{QuestionNo.setText("Question no: "+n);
     Question.setText("Which law of motion is also called law of inertia?");
     a.setText("1st law");
     b.setText("2st law");
     c.setText("3st law");
     d.setText("all three laws");
    break;
        }
        case 9:{QuestionNo.setText("Question no: "+n);
     Question.setText("3rd law of motion explains");
     a.setText("effect of force");
     b.setText("existence of a force");
     c.setText("existence of two forces");
     d.setText("existence of pair of forces in nature");
    break;
        }
        case 10:{QuestionNo.setText("Question no: "+n);
     Question.setText("The dimension of force is");
     a.setText("MLT-2");
     b.setText("ML2T-2");
     c.setText("ML2T2");
     d.setText("ML-2T-2");
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
         if (n==4||n==8|n==10){
                    ++counter;
                }
         attempt++;
     }
      if (radiobuttonselection==2){
          if(n==3){
                   ++counter;
          } 
          attempt++;   
      }
      if (radiobuttonselection==3){
          if (n==1||n==2||n==5||n==7){
                    ++counter;
                } 
          attempt++;
      }
      if (radiobuttonselection==4){
           if (n==6||n==9){
                    ++counter;
                }
           attempt++;
      }    
 }
}    

