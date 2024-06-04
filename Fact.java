import java.util.*;
public class Fact
{
  public static void main(String args[])
  { 
   
    int i,n;
    long fact=1;
    for(i=1;i<=7;i++)
    {
       fact=fact*i;
       System.out.println(fact);
       
    }
     System.out.println("The factorial is : "+fact);
  }
}