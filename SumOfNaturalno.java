import java.util.*;
public class SumOfNaturalno
{
  public static void main(String args[])
  {
    int a[]=new int[5];
    int i,j,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter five values:");
    for(i=0;i<5;i++)
    {
     a[i]=sc.nextInt();
    }
    System.out.println("Ascending order of numbers are:");
    for(i=0;i<5;i++)
    {
      for(j=i+1;j<5;j++)
      {
        if(a[i]<a[j]) 
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
       System.out.println(a[i]);
     }
   }
}  