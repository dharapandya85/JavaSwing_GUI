import javax.swing.*;

//import java.awt.Component;
import java.awt.event.*;
public class PopMenu {
    public static void main(String Args[])
    {
        final JFrame f = new JFrame("PopMenuExample");
        final JPopupMenu popupmenu= new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);
        f.addMouseListener(new MouseAdapter() {
            public void MouseClicked(MouseEvent e)
            {
                popupmenu.show(f,e.getX(),e.getY());
            }
            
        });

    }
}
