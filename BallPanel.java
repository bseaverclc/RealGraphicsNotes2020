import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class BallPanel extends JPanel
{
    JButton button;
    int x = 30;
    int xAdd = 1;
    Ball b1;
    ArrayList<Ball> balls = new ArrayList<Ball>();
    StickFigure stick = new StickFigure(50,200,30,Color.RED);
    ArrayList<StickFigure> dudes = new ArrayList<StickFigure>();
    public BallPanel(Color col)
    {
        setBackground(col);
        
        button = new JButton("Click Me");
        button.addActionListener(new MyClickListener());
        
        addMouseListener(new myMouseListener());
        
        isFocusable();
        setFocusable(true);
        
        addKeyListener(new myKeyListener());
        
        // button.addActionListener(new ActionListener(){
            // public void actionPerformed(ActionEvent e)
            // {
                // balls.add(new Ball());
            // }
        // });
        b1 = new Ball(100,100,20,1,Color.MAGENTA);
        for(int i = 0 ; i<10; i++)
        {
            balls.add(new Ball());
        }
        
        for(int i = 0 ; i<10; i++)
        {
            dudes.add(new StickFigure());
        }
        
        // addMouseListener(new MouseAdapter(){
            // public void mousePressed(MouseEvent e){
                // System.out.println(e.getX());
                // for(Ball b: balls)
                // {
                    // if(b.contains(e.getX(), e.getY()))
                    // {
                        // balls.remove(b);
                    // }
                // }
    //}
//});
}
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        b1.draw(g);
        b1.move();
        b1.bounce(this);
        stick.draw(g);
        stick.move();
        
        for(Ball b: balls)
        {
            b.draw(g);
            b.move();
            b.bounce(this);
        }
        
         for(StickFigure s: dudes)
        {
            s.draw(g);
            s.move();
            //s.bounce(this);
        }
        
        
        g.setColor(Color.RED);
        g.fillOval(x,50,20,20);
        g.setColor(Color.GREEN);
        g.fillRect(20,400,50,10);
        g.drawString("This is the best", 300,20);
        
        add(button);
        x+=xAdd;
        if(x == this.getWidth() || x == 0)
        xAdd *= -1;
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
 
    // inner class for button listener
    public class MyClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            balls.add(new Ball());
        }
    }
    
    // inner class for mouse listener
    public class myMouseListener extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e)
        {
            System.out.println(e.getX() + "," + e.getY());
        }
    }
    
    public class myKeyListener extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {
            int code = (e.getKeyCode());
            System.out.println(code);
            if(code == 83)
            b1.moveDown();
        }
    }
    
}