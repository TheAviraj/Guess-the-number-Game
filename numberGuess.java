import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class numberGuess extends JFrame {
	 JTextField textfield1, textfield2,textfield3;
	    JLabel jLabel; 
	    GuessButton guessButton;
	    RetryButton retryButton;    
	    static int random=(int) (Math.random()*100); 
	    int count=0;
	    public numberGuess()
	    {
	        
	        Container c = getContentPane();
	        c.setLayout(null);   
	        c.setBackground(Color.orange); 
	        JLabel labelpic = new JLabel("");

			JLabel label = new JLabel();
			label.setIcon(new ImageIcon("oasis.jpg"));
			//Dimension size = label.getPreferredSize();
			label.setBounds(4, 4, 91, 137);

			JLabel j0=new JLabel("OASIS INFOBYTE");
	        j0.setForeground(Color.BLUE);
	        j0.setFont(new Font("Courier",Font.BOLD,25));
	        j0.setSize(370,35);
	        j0.setLocation(145,10); 
	        JLabel j=new JLabel("NUMBER GUESSING GAME");
	        j.setForeground(Color.BLACK);
	        j.setFont(new Font("Courier",Font.BOLD,22));
	        j.setSize(370,35);
	        j.setLocation(100,35); 
	        JLabel j1=new JLabel("Guess number between 1-100");
	        j1.setFont(new Font("tunga",Font.PLAIN,17));
	        j1.setSize(270,20);
	        j1.setLocation(120,80);
	        textfield1=new JTextField(10);
	        textfield1.setSize(50,30);
	        textfield1.setLocation(290,125);       
	        jLabel=new JLabel(" ");
	        jLabel.setFont(new Font("tunga",Font. ITALIC,16));
	        jLabel.setSize(370,20);
	        jLabel.setLocation(130,160);
	        textfield2=new JTextField(10);
	        textfield2.setSize(40,20);
	        textfield2.setLocation(260,250);
	        JLabel j2=new JLabel("Number of trials");
	        j2.setFont(new Font("tunga",Font.BOLD,12));
	        j2.setSize(270,20);
	        j2.setLocation(110,250);
	        JLabel j3=new JLabel("Enter number to Guess: ");
	        j3.setFont(new Font("tunga",Font.BOLD,13));
	        j3.setSize(350,20);
	        j3.setLocation(130,130);
	        JButton b1=new JButton("Guess");
	        b1.setSize(80,30);
	        b1.setLocation(160,200);
	        guessButton=new GuessButton();        
	        b1.addActionListener(guessButton);     
	        JButton b2=new JButton("Retry");    
	        b2.setSize(80,30);
	        b2.setLocation(260,200);

			JLabel j7=new JLabel("------------------------------------------------------------------------------------------");
	        j7.setForeground(Color.RED);
	        j7.setFont(new Font("ITALIC",Font.BOLD,18));
	        j7.setSize(600,35);
	        j7.setLocation(0,280); 
			
			JLabel j6=new JLabel("Project done by: JINKA THE AVIRAJ");
	        j6.setForeground(Color.WHITE);
	        j6.setFont(new Font("ITALIC",Font.BOLD,18));
	        j6.setSize(370,35);
	        j6.setLocation(100,300); 

	        retryButton=new RetryButton();        
	        b2.addActionListener(retryButton);    
	        c.add(jLabel);    
	        c.add(labelpic);
			c.add(j0);
			c.add(label);
	        c.add(j);    
	        c.add(j1);
	        c.add(j3);
	        c.add(textfield1);
	        c.add(textfield2);
	        c.add(b1);    
	        c.add(b2);        
	        c.add(j2);  
			c.add(j6);
			c.add(j7);
	        textfield2.setEditable(false);    
	        setTitle("GUESS MY NUMBER");        
	        setSize(550,550);
	        setVisible(true);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	    }

	    private class GuessButton implements ActionListener
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            int a = Integer.parseInt(textfield1.getText());
	            count=count+1;
	            if(count>5)
	            {
	            	jLabel.setText("Limit exceeds,Click on Retry to Start Over!!!");  
	                jLabel.setForeground(Color.MAGENTA);
	                count=0;
	            }
	            else {
	            if(a<random)
	            {
	                jLabel.setText("Oops Wrong Guess!!! "+a+" is Low, Try Again");
	                jLabel.setForeground(Color.red);
	            }    
	            else if(a>random)
	            {
	                jLabel.setText("Oops Wrong Guess!!! "+a+" is High, Try Again");
	                jLabel.setForeground(Color.red);
	            }
	            else
	            {
	                jLabel.setText("Wow.. Your Guess is Correct, You Win!!!!");  
	                jLabel.setForeground(Color.blue);
	            }
	            textfield1.requestFocus();
	            textfield1.selectAll();

	            textfield2.setText(count+"");
	            }
	        }
	    }

	    private class RetryButton implements ActionListener
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            random=(int) (Math.random()*100);
	            textfield1.setText("");
	            textfield2.setText("");
	            jLabel.setText("Try Again and Guess the Number.");
	            jLabel.setForeground(Color.black);
	            textfield2.setText("");
	            count=0;
	            textfield1.setEditable(true);    
	            textfield1.requestFocus();
	        }
	    }

	    public static void main(String[] args) {
	    	new numberGuess();
	    	}

		
}
