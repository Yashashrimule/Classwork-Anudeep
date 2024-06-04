import java.util.*;
class one
{
  double a,b,c;
  Scanner sc=new Scanner(System.in);
  public void accept()
  {
     System.out.println("Enter three numbers : ");
     a=sc.nextInt(); 
     b=sc.nextInt(); 
     c=sc.nextInt(); 
  }
}
class second extends one
{
  double avg;
  public void calc()
  {
    avg=(a+b+c)/3;
  }
}
class third extends second
{
   public void display()
   {
     System.out.println("The average of three number is : " +avg);
   }
}
public class MultilevelDemo
{
  public static void main(String args[])
  {
    third obj=new third();
    obj.accept();
    obj.calc();
    obj.display();
  }
}
