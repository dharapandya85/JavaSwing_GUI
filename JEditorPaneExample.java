  
import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class JEditorPaneExample {
    JFrame myFrame= null;

    public void test() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'test'");
    }

}
public static void main(String args[])
{
    (new JEditorPaneExample()).test();
}
private void test()
{
    JFrame myFrame = new JFrame("JEditorPane Test");
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.setSize(400,200);
    JEditorPane myPane= new JEditorPane();
    myPane.setContentType("text/plain");
    myPane.setText("Sleeping is necessary for health body." + "But sleeping is unnecessary time may spoil our health,wealth and studies" + " Doctors advise that the sleeping at improper timings may lead for obesity during students days.");
    myFrame.setContentPane(myPane);
    myFrame.setVisible(true);
}
