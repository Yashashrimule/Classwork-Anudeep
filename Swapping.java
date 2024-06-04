import java.util.*;
class Swapping
{
  public static void main(String args[])
  { 

    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("Before Swapping : a="+a+" b="+b);
    c=a;
    a=b;
    b=c;
    System.out.println("After Swapping : a="+a+" b="+b);
   }
}
  