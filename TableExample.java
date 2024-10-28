import javax.swing.*;
public class TableExample {
    public static void main(String Args[])
    {
        JFrame f = new JFrame("TableExample");
        String data[][]={{"101","Amit","670000"},
                        {"102","Jay","750000"},
                        {"104","Tarun","450000"}};
        String column[]={"ID","NAME","SALARY"};
        JTable jt = new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp= new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
