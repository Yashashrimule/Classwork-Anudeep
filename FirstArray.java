import java.util.*;
public class FirstArray
{
  public static void main(String args[])
  {
    int i;
    int a[]=new int[5];
    int b[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter five elements : ");
    for(i=0;i<5;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("Copied element to the array : ");
    for(i=0;i<5;i++)
    {
       System.out.println("Copied element to the array : "+a[i]);
 
    }
       
   }
} 