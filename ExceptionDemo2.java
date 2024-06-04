//multiple catch statement
public class ExceptionDemo2
{
  public static void main(String args[])
  {
    try
    {
     int a[]=new int[5];
     int c;
     a[5]=23;
     c=100/0;
     
    }
    catch(ArrayIndexOutOfBoundsException o)
    {
      System.out.println(o);
    }
    catch(ArithmeticException e)
    {
      System.out.println(e);
      System.out.println("You can not divide by zero");
    }
  }
}