import java.util.*;
class SQ
{
  public static void main(String args[])
  {
    int l,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the  length:");
    l=sc.nextInt();
    System.out.println("Enter the breadth:");
    b=sc.nextInt();
    if(l==b)
    {
      System.out.println("It is a Square");
    }
     else
     {
       System.out.println("It is not a Square");
     }
 }
}