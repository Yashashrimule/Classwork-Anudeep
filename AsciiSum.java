import java.util.*;

public class AsciiSum
{
  public static  void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 characters : ");
    char ch[]=new char[10];
    int sum=0;
    for(int i=0; i<10; i++)
    {
      ch[i]=sc.next().charAt(0);
      sum+=(int)ch[i]; 
    } 
     System.out.println("Sum of ASCII value is : "+sum);
   
  }
}