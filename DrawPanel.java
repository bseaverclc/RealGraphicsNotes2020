import javax.swing.*;
import java.awt.*;
public class DrawPanel extends JPanel
{
 private Color c;
    public DrawPanel(Color c)
    {
        this.c = c;
        
    }
    
    //overriding this inherited method from JPanel
    //automatically gets called when the screen shows
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(c);
        g.setColor(Color.GREEN);// sets the color of the pen
        g.fillOval(50,100,20,20);
        g.setColor(Color.BLUE);
        g.fillRect(200,30,80,10);
    }
}
