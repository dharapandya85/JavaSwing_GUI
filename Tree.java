import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class Tree {
    public static void main(String Args[])
    {
        JFrame f = new JFrame("Tree Example");
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red= new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue= new  DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode black= new DefaultMutableTreeNode("Black");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        color.add(red);
        color.add(blue);
        color.add(green);
        color.add(black);
        JTree jt= new JTree(style);
        f.add(jt);
        f.setSize(200,200);
        f.setVisible(true);


        

    }
}
