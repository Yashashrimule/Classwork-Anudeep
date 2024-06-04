import java.util.Scanner;
class Square
{
public static void main(String args[])
{
  
  double a,sq;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number : ");
  a=sc.nextDouble();
  
  sq=a*a;

  System.out.println("The square of  a number is : "+sq);
}
}