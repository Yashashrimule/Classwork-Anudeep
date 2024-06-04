import java.util.*;
class LeapYear
{
  public static void main(String args[])
  {
    int year;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an Year:");
    year=sc.nextInt();
    
    if(year%4==0 && year%100!=0 )
    {
      System.out.println("Year "+year+" is Leap Year");
    }
     else
     {
      System.out.println("Year "+year+" is not Leap Year");
     }
 }
}