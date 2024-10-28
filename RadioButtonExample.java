import javax.swing.*;
public class RadioButtonExample {
    public static void main(String Args[])
    {
        JFrame f = new JFrame("RadioButtonExample");
        JRadioButton r1;
        JRadioButton r2;
        r1 = new JRadioButton("A) Male");
        r2 = new JRadioButton("B) Female");
        r1.setBounds(75,50,100,30);
        r2.setBounds(75,100,100,30);
        ButtonGroup bg = new ButtonGroup();
        //bg.setBounds();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);
        //f.add(bg);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
}
