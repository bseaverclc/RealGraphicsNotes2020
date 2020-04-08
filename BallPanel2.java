import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class BallPanel2 extends JPanel
{
    JButton button;
    int x = 30;
    int xAdd = 1;
    Ball b1;
    ArrayList<Ball> balls = new ArrayList<Ball>();
    
    public BallPanel2(Color col)
    {
        setBackground(col);
   
        b1 = new Ball(100,100,20,1,Color.MAGENTA);
        for(int i = 0 ; i<10; i++)
        {
            balls.add(new Ball());
        }
        
        button = new JButton("Click to Add");
        button.addActionListener(new MyActionListener());
        
        setFocusable(true);
        addKeyListener(new MyKeyListener());
       
}
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        b1.draw(g);
       // b1.move();
       // b1.bounce(this);
       
        
        for(Ball b: balls)
        {
            b.draw(g);
            b.move();
            b.bounce(this);
        }
        
        add(button);
         
         
       // Delay 
        try
        {
        Thread.sleep(30);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
        
        repaint();
    }
 
   public class MyActionListener implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
           balls.add(new Ball());
        }
    }
    
    public class MyKeyListener extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {
            //System.out.println(e.getKeyCode());
            if(e.getKeyCode() == 83)
            {
                b1.moveDown();
            }
        }
    }
    
}