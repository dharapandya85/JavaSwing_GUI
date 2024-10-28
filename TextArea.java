import javax.swing.*;
public class TextArea {
    public static void main(String Args[])
    {
        JFrame f = new JFrame("TextAreaExample");
        JTextArea area= new JTextArea("Welcome to javatpoint");
        area.setBounds(10,30,200,200);
        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
}
