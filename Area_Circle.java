/*WAP for taking the string "yes " from the user till the user wants to find the area of a circle. here, the radius you have to take as input from the user.*/
 
import java.util.*;

class Area_Circle
{ 
  public static void main(String args[])
  {
      
     
     Scanner sc=new Scanner(System.in);
     while(true)
     {
          System.out.println("Enter radius of circle");
          int r=sc.nextInt();
          double area=3.14*r*r;
          System.out.println("Area of circle is:"+area);
          System.out.println("Do you want to continue Yes/No");
          String str=sc.next();
          if(!(str.equals("Yes")))
          {
              break;
          }
     }
  }
}
          
           