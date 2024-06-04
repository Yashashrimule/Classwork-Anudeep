import java.util.*;
class Add
{
  int a,b,sum;
  Scanner sc=new Scanner(System.in);
  public void inputNum()
  {
    System.out.println("Enter two number");
    a=sc.nextInt();
    b=sc.nextInt();
  }
}
class Result extends Add
{
   public void display()
   {
      sum=a+b;
      System.out.println("The sum is"+sum);
   }
}
public class SingleInheritance
{
  public static void main(String args[])
  {
    Result obj=new Result();
    obj.inputNum();
    obj.display();
  }
}

