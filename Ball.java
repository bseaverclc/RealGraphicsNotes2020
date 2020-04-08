import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Ball
{
    private int x,y,radius,xSpeed;
    private Color c;
    
    public Ball(int x,int y, int radius, int xSpeed, Color c)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xSpeed = xSpeed;
        this.c = c;
    }
    
    public Ball()
    {
        x = (int)(Math.random()*400 + 10);
        y = (int)(Math.random()*400 + 10);
        radius = (int)(Math.random()*40 + 5);
        xSpeed = (int)(Math.random()*4 + 1);
        c = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        
    }
    
    public void draw(Graphics gr)
    {
        gr.setColor(c);
        gr.fillOval(x,y,radius*2, radius*2);
    }
    
    public void move()
    {
        x+=xSpeed;
        
    }
    
    public void moveDown()
    {
        y+=3;
    }
    
    public void bounce(JPanel p)
    {
        if(x + 2*radius >= p.getWidth() || x <= 0)
        {
            xSpeed*=-1;
        }
    }
    
    public boolean contains(int inX, int inY)
    {
        if(inX > x && inX < x + 2*radius && inY > y && inY < y + 2*radius)
        return true;
        else
        return false;
    }
}