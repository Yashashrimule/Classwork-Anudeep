import java.util.*;
class salary
{
  double Sal,res;
  Scanner sc=new Scanner(System.in);
  public void inputSal()
  {
    System.out.println("Enter your salary");
    Sal=sc.nextDouble();
    
  }
}
class Bonus extends salary
{
   public void display()
   {
       double bonus=0.0;
       if(Sal<50000)
       {
         bonus=Sal*0.10;
         double totalSal=Sal+bonus;
         System.out.println("Toral Salary with bonus you get is : "+totalSal);
      }
       else
       {
        System.out.println("Toral Salary remains same without bonus"); 
       }
     }
}
public class SingleInheritance2
{
  public static void main(String args[])
  {
    Bonus obj=new Bonus();
    obj.inputSal();
    obj.display();
  }
}

