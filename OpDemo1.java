import java.util.Scanner;
class OpDemo1
{
public static void main(String args[])
{
  int a,b,Add,Sub,Mul,Div,Rem;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter two numbers : ");
  a=sc.nextInt();
  b=sc.nextInt();
  
  Add=a+b;
  Sub=a-b;
  Mul=a*b;
  Div=a/b;
  Rem=a%b;

  System.out.println("The Addition is : "  +Add);
  System.out.println("The Substraction is : "  +Sub);
  System.out.println("The Multiplication is : "  +Mul);
  System.out.println("The Division is : "  +Div);
  System.out.println("The Reminder is : "  +Rem);
}
}