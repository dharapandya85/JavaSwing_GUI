import javax.swing.*;
import java.awt.*;

import java.awt.Container;
import java.awt.event.*;
public class CardLayoutExample extends JFrame implements ActionListener
{
    public CardLayoutExample(String string) {
      super(string);
      //TODO Auto-generated constructor stub
   }
   CardLayout crd;
     JButton btn1,btn2,btn3;
     Container cPane;

      CardLayoutExample CardLayoutExample()
     {
        cPane = getContentPane();
        crd= new CardLayout();
        cPane.setLayout(crd);

        btn1 = new JButton("Apple");
        btn2 = new JButton("Boy");
        btn3 = new JButton("Cat");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        cPane.add("a",btn1);
        cPane.add("b",btn2);
        cPane.add("c",btn3);
      return null;
     }
     public Container getContentPane() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getContentPane'");
   }
   public void actionPerformed(ActionEvent e)
     {
        crd.next(cPane);
     }
     public static void main(String Args[])
     {
        CardLayoutExample  crdl= new CardLayoutExample(null);
       // crdl.setLayout(300,300);
        crdl.setSize(300,300);
        crdl.setVisible(true);
        crdl.setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
}