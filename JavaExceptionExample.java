//import java.util.*;
public class JavaExceptionExample
{
    public static void main(String Args[])
    {
        try{
        int data=100/0;

    }catch(ArithmeticException e){System.out.println(e);}
    System.out.println("Rest of the code");
    }
}