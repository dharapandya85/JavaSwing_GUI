import javax.swing.*;
import java.awt.*;
public class Form
{
    public static void main(String Args[])
    {   
        JFrame frame = new JFrame("Form");
        frame.setPreferredSize(new Dimension(800,700));

        javax.swing.JPanel east= new JPanel();
        east.setPreferredSize(new Dimension(140,500));

        javax.swing.JPanel center= new JPanel();
        center.setPreferredSize(new Dimension(730,500));

        JPanel south= new JPanel();
        south.setPreferredSize(new Dimension(800,70));

        JTextField cNorth= new JPanel();
        cNorth.setPreferredSize(new Dimension(600,150));

        JTextField cCenter = new JPanel();
        cCenter.setPreferredSize(new Dimension(700,370));

        Component cSouth = new JPanel();
        cSouth.setPreferredSize(new Dimension(700,50));

        cNorth.setLayout(new GridLayout(5,1, 0, 0));
        cSouth.setLayout(new FlowLayout());
        east.setLayout(new GridLayout(9,1, 0, 0));
        south.setLayout(new FlowLayout());

        
        JTextField name = new JLabel("Name");
        JTextField tName = new JTextField();
        JTextField email = new JLabel("e-mail");
        JTextField tEmail= new JTextField();
        JTextField address = new JLabel("Address");
        JTextField tAddress = new JTextField();
       // tAddress.setPreferredSize(new Dimension());
        tAddress.setPreferredSize(new Dimension(600, 300));

        PopupMenu g = new JLabel("Gender");
        PopupMenu male= new JRadioButton("male");
        PopupMenu female= new JRadioButton("female");
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

       JTextField sports= new JLabel("sports");
       JTextField tennis = new JCheckBox("Tennis");
       JTextField baseball= new JCheckBox("Baseball");
       JTextField chess = new JCheckBox("chess");
       JTextField badminton = new JCheckBox("badminton");
       JTextField football = new JCheckBox("football");
       JTextField basketball = new JCheckBox("basketball");

       JButton ok = new JButton("ok");
       JButton submit= new JButton("submit");
       ButtonGroup group2= new ButtonGroup();
       group2.add(ok);
       group.add(submit);
       
       



       frame.add(center, BorderLayout.CENTER);
       center.add(cNorth);
       cNorth.add(name);
       cNorth.add(tName);
        cNorth.add(email);
        cNorth.add(tEmail);
        cNorth.add(address);

        center.add(cCenter);
        cCenter.add(tAddress);


        


        center.add(cSouth);
       cSouth.add(g);
       cSouth.add(male);
       cSouth.add(female);

       frame.add(east,BorderLayout.EAST);
       east.add(sports);
       east.add(tennis);
       east.add(baseball);
      east.add(chess);
      east.add(badminton);
      east.add(football);
       east.add(basketball);
       //east.add();
       //east.add();
        //cNorth.setSize(400,400);

        
        
       frame.add(south,BorderLayout.SOUTH);
        south.add(ok);
        south.add(submit);

        //f.setLayout(null);
        frame.pack();
        frame.setVisible(true);
       // f.setLayout(null);
        
    }
}