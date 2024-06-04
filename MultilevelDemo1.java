import java.util.*;
class cylinder
{
  double pi=3.14,r,h;
  Scanner sc=new Scanner(System.in);
  public void inputvalue()
  {
     System.out.println("Enter the value of radius and height : ");
     r=sc.nextInt(); 
     h=sc.nextInt(); 
      
  }
}
class volume  extends cylinder
{
  double vol;
  public void calc()
  {
    vol=2*pi*r*h;
  }
}
class cylinderVol extends volume
{
   public void get()
   {
     System.out.println("The volume of cylinder is : " +vol);
   }
}
public class MultilevelDemo1
{
  public static void main(String args[])
  {
    cylinderVol obj=new cylinderVol();
    obj.inputvalue();
    obj.calc();
    obj.get();
  }
}