import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class JScrollPaneExample
{
    private static final long  serialVersionUID =1L;

    private static void createAndshowGUI()
    {
        final JFrame frame = new JFrame("Scroll Pane Example");

        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(new FlowLayout());

        JTextArea textArea=new JTextArea();
        JScrollPane scrollableTextArea = new JScrollPane();

        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.getContentPane().add(scrollableTextArea);

    }
    public static void main(String Args[])
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                createAndshowGUI();
            }
        });
    }
}