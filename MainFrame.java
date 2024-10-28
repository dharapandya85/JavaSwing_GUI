//import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
//import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
//void java.awt.Container.setLayout(LayoutManager mgr)


public class MainFrame extends JFrame{
    final private Font mainfont= new Font("Segoe print",Font.BOLD,18);
    JTextField tfFirstName,lbLastName;
    JLabel lbWelcome;
    private JTextField tfLastName;

    /**
     * @param mainFont 
     * 
     */
    public void initialize(Font mainFont)
    {

    JLabel lbFirstName= new JLabel("First Name");
    lbFirstName.setFont(mainfont);

    tfFirstName= new JTextField();
    tfFirstName.setFont(mainfont);

    JLabel lbLastName= new JLabel("Last Name");
    lbLastName.setFont(mainfont);

    tfLastName=new JTextField();
    tfLastName.setFont(mainfont);

    JPanel formPanel = new JPanel();
   // formPanel.setLayout(new GridLayout(4,1,5,5));
    formPanel.add(lbFirstName);
    formPanel.add(tfFirstName);
    formPanel.add(lbLastName);
    formPanel.add(tfLastName);

    lbWelcome = new JLabel();
    lbWelcome.setFont(mainfont);

    JButton btnOK = new JButton("OK");
    btnOK.setFont(mainfont);
    btnOK.addActionListener(new ActionListener()
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
           // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            String firstName= tfFirstName.getText();
            
            //AbstractButton lfLastName;
            String lastName= tfLastName.getText();
            lbWelcome.setText("Hello" + firstName + " " + lastName );
            
        }

    });

    
    JButton btnClear = new JButton("Clear");
    btnClear.setFont(mainFont);
    btnClear.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
           // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            tfFirstName.setText("");
            tfLastName.setText("");
            lbWelcome.setText("");
        }
        
    });

    JPanel buttonsPanel= new JPanel();
    //buttonsPanel.setLayout(new GridLayout(1,2,5,5));
    buttonsPanel.add(btnOK);
    buttonsPanel.add(btnClear);

    

    JPanel mainPanel= new JPanel();
    mainPanel.setLayout(new BorderLayout());
    mainPanel.setBackground(new Color(128,128,255));
    mainPanel.add(formPanel,BorderLayout.NORTH);
    mainPanel.add(lbWelcome,BorderLayout.CENTER);
    mainPanel.add(buttonsPanel,BorderLayout.SOUTH);
    
    setTitle("Welcome");
    setSize(500,600);
    setMinimumSize(new Dimension(300,400));
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    }
    public static void main(String Args[])
    {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
    private void initialize() {
        //statement
    }

}