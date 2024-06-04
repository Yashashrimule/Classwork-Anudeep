public class ExceptionDemo1
{
  public static void main(String args[])
  {
    try
    {
     int a,b,c;
     c=100/0;
    }
    catch(ArithmeticException e)
    {
      System.out.println(e);
      System.out.println("You can not divide by zero");
    }
    finally
    {
      System.out.println("This is compulsory executable block");
    }
  }
}
     