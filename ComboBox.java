import javax.swing.*;
public class ComboBox {
    public static void main(String Args[])
    {
        JFrame f = new JFrame("ComboBox Example");
        String Country[] = {"India","Australia","USA","London"};
        JComboBox cb= new JComboBox(Country);
        cb.setBounds(50,50,90,20);
        f.add(cb);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
