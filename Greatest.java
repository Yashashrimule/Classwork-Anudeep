import java.util.*;
class Greatest
{
  public static void main(String args[])
  {
    int A,B;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values of A and B:");
    A=sc.nextInt();
    B=sc.nextInt();
    if(A>B)
    {
      System.out.println("A is greatest");
    }
     else
     {
      System.out.println("B is greatest");
     }
 }
}