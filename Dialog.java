//import java.awt.FlowLayout;

//import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Dialog {
    public static void main(String Args[])
    {
        JFrame f = new JFrame("Dialog Example");
        JDialog d = new JDialog();
        d.setLayout(new FlowLayout());
        JButton b = new JButton("OK");
        b.addActionListener (new ActionListener()){
        
            public void ActionPerformed(ActionEvent e)
            {
                DialogExample.d.setVisible(false);
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
    }
        d.add(new JLabel("Click Button to continue"));
        d.add(b);
        d.setSize(300,300);
        d.setLayout(null);
        d.setVisible(true);


    }
}
