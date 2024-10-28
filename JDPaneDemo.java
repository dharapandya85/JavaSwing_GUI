import java.awt.Component;
import java.awt.Container;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.RootPaneContainer;
public class JDPaneDemo extends JFrame
{
    public JDPaneDemo()
    {
        CustomDesktopPane desktopPane = new CustomDesktopPane();
        Container contentPane= getContentPane();
        contentPane.add(desktopPane,BorderLayout.CENTER);
        desktopPane.display(desktopPane);

        setTitle("JDesktopPane Example");
        setSize(300,500);
        setVisible(true);

    }
    public static void main(String Args[])
    {
        new JDPaneDemo();
    }
    class CustomDesktopPane extends JDesktopPane
    {
        int numFrames=3, x=30,y=30;
        public void display(CustomDesktopPane dp)
        {
            for(int i=0;i<numFrames;++i)
            {
                Component jframe = new JInternalFrame("InternalFrame"+i,true,true,true,true);

                jframe.setBounds(x,y,250,80);
                Container c1=((RootPaneContainer) jframe).getContentPane();
                c1.add(new JLabel("I love my country"));
                dp.add(jframe);
                jframe.setVisible(true);
                y+=85;

            }
        }
    }
}

