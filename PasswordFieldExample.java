import javax.swing.*;
public class PasswordFieldExample {
    public static void main(String Args[])
    {
        JFrame f = new JFrame("Password Field Example");
        JRadioButton l1;
        l1 = new JRadioButton("Welcome to javatpoint");
        l1.setBounds(20,100,80,10);
        JPasswordField value;
        value = new JPasswordField("Enter Password");
        value.setBounds(100,100,100,30);
        f.add(l1);
        f.add(value);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        


    }
}
