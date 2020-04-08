import javax.swing.*;
import java.awt.*;
public class AnimatePanel extends JPanel
{
 private Color c;
 private int x = 50;
 private int xAdd = 1;
 private int diameter = 20;
 // Constructor that accepts a background color
    public AnimatePanel(Color c)
    {
        this.c = c;// initializing the instance variable c
        
    }
    
    //overriding this inherited method from JPanel
    //automatically gets called when the screen shows
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);// must be the first line of code to paint a blank panel
        this.setBackground(c);// setting the background color of the panel
        g.setColor(Color.GREEN);// sets the color of the pen
        g.fillOval(x,100,diameter,diameter);// drawing the ball
        x+=xAdd; // Changing the x value of the ball
        
        // Checking to see if the ball hits the right side
        // or the left side of the screen and changing the 
        // xAdd variable
        if(x >= getWidth()-20 || x <=0)
        {
            xAdd *= -1;
        }
        
        // Delay loop that pauses the computer
        try{
        Thread.sleep(10);
    }
    catch(Exception e)
    {
        System.out.println("caught Thread Exception");
    }
        
        repaint();// this repaints the screen by calling paintComponent again
       
    }
}
