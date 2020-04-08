


import javax.swing.*;
public class MetricToMile{
public static void main (String[] args){
JOptionPane sb = new JOptionPane();
int tf = 0;
while(tf == 0){
String xb = sb.showInputDialog(null, "Please enter an amount of meters.");
double x = 0;
try{
x = Double.parseDouble(xb);
if(x<0){
while(x<0){
sb.showMessageDialog(null, "That was a negative number. The number must be positive.");
String xtwo = sb.showInputDialog(null,"Please enter a positive number.");
x = Double.parseDouble(xtwo);
}
double y = x * 0.000621371;
sb.showMessageDialog(null, x+" meters is "+y+" miles.");
}else{
sb.showMessageDialog(null, "You entered a valid number. Converting to miles.");
double y = x * 0.000621371;
sb.showMessageDialog(null, x+" meters is "+y+" miles.");
}
}
catch(NumberFormatException m){
sb.showMessageDialog(null, "That wasn't a valid input.");
}
catch(NullPointerException gc){
sb.showMessageDialog(null, "You clicked cancel or didn't put in anything.");
}
tf = sb.showConfirmDialog(null, "Do you want to play again?");
}
sb.showMessageDialog(null, "Thanks for playing!");
}
}

 