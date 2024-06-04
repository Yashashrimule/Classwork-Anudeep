public class MyAbstraction
{
  public void calculate()
   {
    System.out.println("hello");
   }
   public static void display()
   {
    System.out.println("Hi this is me !!!");
   }
   public static void main(String args[])
   {
     display();
     MyAbstraction obj=new MyAbstraction();
     obj.calculate();
   }
 }