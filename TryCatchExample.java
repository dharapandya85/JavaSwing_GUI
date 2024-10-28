public class TryCatchExample {
    public static void main(String Args[])
    {
        try
        {
            int data=50/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
