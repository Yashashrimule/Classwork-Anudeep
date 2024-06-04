import java.util.Scanner;
class Area
{
public static void main(String args[])
{
  
  double pi=3.14,r,area;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the radius : ");
  r=sc.nextDouble();
  area=pi*r*r;

  System.out.println("The area of a number is : "+area);
}
}