import java.util.*;
public class StringPalindrome
{
  public static void main(String args[])
  {
    String s1,s2;
    s2="";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string : ");
    s1=sc.nextLine();
    for(int i=0;i<s1.length();i++)
    {
      s2=s1.charAt(i)+s2;      
    }
     if(s1==s2)
      {
       System.out.println("String is Palindrome");
      }
      else
      { 
       System.out.println("String is not Palindrome");
      }
   }
}