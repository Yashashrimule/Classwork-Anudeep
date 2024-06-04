import java.util.*;
public class  Palindrome
{
  public static void main(String args[])
  {
    int n,rev=0,rem;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number : ");
    n=sc.nextInt();
    int temp=n;
    while(n>0)
    {
      rem=n%10;
      rev=rev*10+rem;
      n=n/10;
    }        
      if(temp==rev)
      {
       System.out.println("The  given number is Palindrome ");

      }
      else
      {
       System.out.println("The  given number is not Palindrome ");
      }
     
  }
}