import java.util.*;
public class ArrayDemo2
{
  public static void main(String args[])
  {  
    int num[]=new int[5];
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter five numbers");
    
    for (i=0;i<5;i++)
    {
      num[i]=sc.nextInt();
      
    }
    System.out.println("You have entered:");
    for (i=0;i<5;i++)
    {
      System.out.println(num[i]);
    }
  }
}