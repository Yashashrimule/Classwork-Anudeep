public class Autoboxing
{
  public static void main(String args[])
  {
    int x=25,y;
    Integer val=new Integer(x);
    y=val;
    System.out.println("Value after autoboxing " +val);
    System.out.println("Value after unboxing " +y);
  }
}
