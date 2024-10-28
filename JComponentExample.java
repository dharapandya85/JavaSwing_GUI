import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;
 class MyJComponent extends JComponent{
    public void paint(Graphics g)
    {
        g.setColor(Color.green);
        g.fillRect(30,30,100,100);
    }
}
public class JComponentExample {
    public static void main(String Args[])
    {
        MyJComponent com= new MyJComponent();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        //frame.add();
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(com);
        frame.setVisible(true);

    }
}
