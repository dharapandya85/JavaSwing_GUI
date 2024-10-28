import javax.swing.*;

public class ButtonExample {
    public static void main(String Args[])
    {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click Here");
        b.setBounds(100,100,75,56);
        f.add(b, null);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    
}
