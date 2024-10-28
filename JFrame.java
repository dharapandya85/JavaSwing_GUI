import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.JLabel;
public class JFrame {
    static final String EXIT_ON_CLOSE = null;

    public JFrame(String string) {
    }

    public static void main(String Args[])
    {
        JFrame frame = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label= new JLabel("JFrame by Example");
        JButton button = new JButton();
        button.setText("Button");
        panel.add(label);
        panel.add(button);
        panel.add(panel);
        frame.add(panel);
        frame.setSize(200,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    void add(JPanel panel) {
    }

    protected void setVisible(boolean b) {
    }

    void setDefaultCloseOperation(String exitOnClose) {
    }

    private void setLocationRelativeTo(Object object) {
    }

    void setSize(int i, int j) {
    }

    public void add(JButton b1, String north) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public void setLayout(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setLayout'");
    }

    public void add(JCheckBox checkbox2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public void setPreferredSize(Dimension dimension) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPreferredSize'");
    }

    public void pack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pack'");
    }

    public void add(JTree jt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public void add(JTextField t1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public void add(JScrollPane sp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public Container getContentPane() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getContentPane'");
    }

  // private void add(JPanel panel) {
   // }
}
