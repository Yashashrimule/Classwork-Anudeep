import java.util.Scanner;
class interest
{
public static void main(String args[])
{
  
  double P=4500,N,R,SI;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the values of N and R : ");
  N=sc.nextDouble();
  R=sc.nextDouble();
  
  SI=(P*N*R)/100;
  
  System.out.println("The simple interest is : "+SI);
}
}