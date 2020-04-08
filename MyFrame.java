import javax.swing.*;
import java.awt.*;

public class MyFrame
{
    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame();// Create a empty Frame
        
       
        // Creating an object of our AnimatePanel Class
        BallPanel2 arena = new BallPanel2(Color.RED);
        // Setting the size of the panel
        arena.setPreferredSize(new Dimension(500,500));
        
        myFrame.add(arena);// adding the panel to the frame
        
        
        myFrame.pack();// making the frame fit around the panel
        myFrame.setVisible(true); // setting the frame to be visible
        
        
    }

}
