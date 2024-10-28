import javax.swing.*;
public class List {
  public static void main(String Args[])
  {
    JFrame  f = new JFrame("ListExample");
    DefaultListModel<String>l1 = new DefaultListModel<>();
    l1.addElement("Item 1"); 
    l1.addElement("Item 2");
    l1.addElement("Item 3");
    l1.addElement("Item 4");
    JList <String> list = new JList<>(l1);
    list.setBounds(100,100,75,75);
    f.add(list);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }  
}
