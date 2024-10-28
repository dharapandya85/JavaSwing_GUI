//Component java.awt.Container.add;

import javax.swing.*;
public class JSpinner {
    public JSpinner(SpinnerModel value) {
    }

    public static void main(String Args[])
    {
        JFrame f = new JFrame("JSpinner");
        SpinnerModel value = new SpinnerNumberModel(5,0,10,1);
         JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100,100,50,30);
        spinner.add(spinner);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    private void add(JSpinner spinner) {
    }

    private void setBounds(int i, int j, int k, int l) {
    }
}
