
import javax.swing.*;
import java.util.*;
import java.awt.*;
public class StickFigure
{
    private int x,y,height;
    private Color c;
    
    public StickFigure(int x, int y, int height, Color c)
    {
        this.x = x;
        this.y = y;
        this.height = height;
        this.c = c;
    }
    
    public StickFigure()
    {
        x = (int)(Math.random()*400+10);
        y = (int)(Math.random()*300+10);
        height = (int)(Math.random()*30+10);
        c = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
    }
    
    public void draw(Graphics gr)
    {
        gr.setColor(c);
        gr.drawLine(x,y,x,y-height);
        gr.drawOval(x-5, y-height-10,10,10);
        gr.drawLine(x,y,x-4,y+height/2);
        gr.drawLine(x,y,x+4,y+height/2);
        gr.drawLine(x,y-height/2,x-7,y-height);
        gr.drawLine(x,y-height/2,x+7,y-height);
    }
    
    public void move()
    {
        x++;
    }
    
}