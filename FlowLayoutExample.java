import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample
{
    JFrame frameObj;
     FlowLayoutExample(){
        frameObj = new JFrame(null);

        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");

        frameObj.add(null);
       // Object north;
        frameObj.add(b2); //north:null);
        frameObj.add(b3);
        frameObj.add(b4);
        frameObj.add(b5);

        frameObj.setLayout(new FlowLayout());
        frameObj.setSize(300,300);
        frameObj.setVisible(true);

     }
     public static void main(String Args[])
     {

        new FlowLayoutExample();
     }
}