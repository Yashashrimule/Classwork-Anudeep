import java.util.Scanner;
class Average
{
public static void main(String args[])
{
  
  double a,b,c,sum,Avg;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Three Numbers : ");
  a=sc.nextDouble();
  b=sc.nextDouble();
  c=sc.nextDouble();
 
  sum=a+b+c;
  Avg=sum/3;

  System.out.println("The average of three numbers is : "+Avg);
}
}
 
  

  
  
