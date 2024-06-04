import java.util.*;
class Divisible
{
  public static void main(String args[])
  {
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    num=sc.nextInt();
    
    if(num%5==0 && num%11==0)
    {
      System.out.println("Given Number "+num+" is divisible by 5 amd 11");
    }
     else
     {
      System.out.println("Number is not divisible");
     }
 }
}