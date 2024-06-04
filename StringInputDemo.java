import java.util.*;

class StringInputDemo
{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    String myname;
    System.out.println("Enter your name");
    myname=sc.nextLine();
    System.out.println("You have entered"+""+myname);
    System.out.println("Enter your name");
    myname=sc.next();
    System.out.println("You have entered"+""+myname);
    System.out.println("first character is");
    System.out.println(myname.charAt(0));
 }
}
    
    
    