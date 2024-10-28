//import java.awt.FlowLayout;

//import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DialogExample {
    static JDialog d;
    DialogExample()
    {
    //private static JDialog d;
    //protected static Object d;

   // public static void main(String Args[])
   // {
        JFrame f = new JFrame("Dialog Example");
        d = new JDialog();
       // JDialog d = new DialogExample();
        d.setLayout(new FlowLayout());
        JButton b = new JButton("OK");
        b.addActionListener(new ActionListener()
        {
           

            
            public void actionPerformed(ActionEvent e) {
                 DialogExample.d.setVisible(false);
               
            }
        });
        d.add(new JLabel("Click Button to continue"));
        d.add(b);
        d.setSize(300,300);
        d.setLayout(null);
        d.setVisible(true);

    }
    
public static void main(String Args[])
{
    new DialogExample();
}
}
