import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
 class HelloWorld {
    public static void main(String Args[])
    {
        JFileChooser jf = new JFileChooser();
        jf.showSaveDialog(null);
    }
}
