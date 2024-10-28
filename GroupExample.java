import java.awt.*;
import javax.swing.*;
public class GroupExample
{
    public static void main(String Args[])
    {
        JFrame frame = new JFrame("GroupLayoutExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPanel =frame.getContentPane();
        GroupLayout grouplayout = new GroupLayout(contentPanel);

        contentPanel.setLayout(grouplayout);

        JLabel clickMe= new JLabel("Click Here");
        JButton button= new JButton("This Button");

        grouplayout.setHorizontalGroup(
        
            grouplayout.createSequentialGroup()
            .addComponent(clickMe)
            .addGap(10,20,100)
            .addComponent(button));
        grouplayout.setVerticalGroup(
            grouplayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(clickMe)
            .addComponent(button));
            frame.pack();
            frame.setVisible(true);


        

    }
}