import javax.swing.*;
//import java.awt.*;
import java.text.*;
import java.util.*;
public class DigitalWatch implements  Runnable{
    JFrame f;
    Thread t= null;
    int hours=0,minutes=0,seconds=0;
    String timeString=" ";
    JButton b;
    DigitalWatch()
    {
        f = new JFrame(timeString);

        t = new Thread(this);
        t.start();


        b= new JButton();
        b.setBounds(100,100,100,50);

        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void run()
    {
        try{
            while(true)
            {
                Calender cal = Calender.getInstance();
                hours = cal.get(Calender.HOUR_OF_DAY);
                if(hours>12) hours-=12;
                minutes = cal.get(Calender.MINUTE);
                seconds= cal.get(Calender.SECOND);

                SimpleDateFormat formatter= new SimpleDateFormat("hh:mm:ss");
                Date date= cal.getTime();
                timeString = formatter.format(date);


                printTime();
                 
                t.sleep(1000);


            }
        }
        catch(Exception e){}

    }
    private void printTime() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printTime'");
    }
    public static void main(String Args[])
    {
        new DigitalWatch();
    }
}