/* 
 * Five Steps to create a basic frame
 * 1)  Create a JFrame
 * 2)  Set the size of the Frame
 * 3)  Create a JPanel
 * 4)  add the panel the frame
 * 5)  Make the frame visible
 * 
 * icon.setImage(icon.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));
 */
import javax.swing.*;
import java.awt.*;
public class FirstFrameNotes
{
    public static void main(String[] args)
    {
        //1
        JFrame myFrame = new JFrame("Hello World");
        //2
        myFrame.setSize(300,300);
        //3
        JPanel myPanel = new JPanel();
        //myPanel.setLayout(new GridLayout(2,2,20,50));
       // myPanel.setLayout(new BorderLayout());
        myPanel.setLayout(null);
        myPanel.setBackground(new Color(255,0,0));
        // Creating components and adding them to the panel
        JButton button1 = new JButton("Click Me!");
        button1.setBounds(20,200, 70,70);
        myPanel.add(button1);
        
        JButton button2 = new JButton("Hello");
        button2.setBounds(200,200,70,70);
        myPanel.add(button2);
        JTextField field1 = new JTextField(10);
        myPanel.add(field1);
        JLabel labely = new JLabel("Does this work?");
        labely.setForeground(Color.YELLOW);
        myPanel.add(labely);
        
        ImageIcon blah = new ImageIcon("pony.jpg");
        blah.setImage(blah.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));
        JLabel pic = new JLabel(blah);
        myPanel.add(pic);
        
        
        
   
        
        //4
        myFrame.add(myPanel);
        //5
        myFrame.setVisible(true);
        
        
    }
}