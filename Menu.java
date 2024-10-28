import javax.swing.*;
public class Menu {
    public static void main(String Args[])
    {
        JMenu menu,submenu;
        JMenuItem i1,i2,i3,i4;
        JFrame f = new JFrame("MenuExample");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Submenu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        menu.add(i1);
        menu.add(i2);
        submenu.add(i3);
        submenu.add(i4);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);




    }
}
