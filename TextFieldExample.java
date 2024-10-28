import javax.swing.*;
public class TextFieldExample {
 public static void main(String Args[]) 
 {
    JFrame f = new JFrame("Text  Field Example");
    JTextField t1;
   JTextField t2;
    t1 = new JTextField("Welcome to javatpoint");
    t1.setBounds(50,100,200,50);

    t2 = new JTextField("AWT Tutorial");
    t2.setBounds(50,100,200,50);

    f.add(t1);
    f.add(t2);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);


 }  
}
