import java.util.*;
public class StringDemo1
{
  public static void main(String args[])
  {
     String s1,s2,Email;
     char g;
     s1="Yashashri";
     System.out.println("Your Name is "+s1);
     s2=new String("Mule");
     System.out.println("Your Surname is "+s2);
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your email address : ");
     Email=sc.nextLine();
     System.out.println("Confirm your Email : "+Email);
     sc.nextLine();
     System.out.println("Enter your gender");
     g=sc.next().charAt(0);
     System.out.println("Your gender is : "+g);
   }
}