public class TryCatchExample2
{
    public static void main(String Args[])
    {
        try{
            int data=50/0;
            System.out.println("rest of the code");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}