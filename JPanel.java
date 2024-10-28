import java.awt.*;
import javax.swing.*;
//Component java awt.Container.add(Component comp)
public class JPanel {
    JPanel()
    {
    JFrame f = new JFrame("JPanel Example");
    JPanel panel = new JPanel();
    panel.setBounds(40,80,200,200);
    panel.setBackground(Color.gray);
    JButton b1 = new JButton("Button 1");
    b1.setBounds(50,100,80,30);
    b1.setBackground(Color.yellow);
    JButton b2 = new JButton("Buttton 2");
    b2.setBounds(100,100,80,30);
    b2.setBackground(Color.green);
    panel.add(b1);
    panel.add(b2);
    //f.add(panel);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    }
    private void setBackground(Color gray) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBackground'");
    }
    private void setBounds(int i, int j, int k, int l) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBounds'");
    }
    //private void add(JButton b2) {
   // }
    //private void setBackground(Color gray) {
    //}
    //private void setBounds(int i, int j, int k, int l) {
   // }
    public static void main(String Args[])
    {
        new JPanel();
    }
    public void setPreferredSize(Dimension dimension) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPreferredSize'");
    }
    public void setLayout(GridLayout gridLayout) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setLayout'");
    }
    public void setLayout(FlowLayout flowLayout) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setLayout'");
    }
    public void add(JTextArea ta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    public void add(JButton ok) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}
