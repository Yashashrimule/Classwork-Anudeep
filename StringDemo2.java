import java.util.*;

public class StringDemo2
{
  public static void main(String args[])
  {
    String str,str1,str2,str3,Res;
    int len;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your favourite movie");
    str=sc.nextLine();
   
    len=str.length();
    
    System.out.println("The length of the string is : "+len);

    System.out.println("MOVIE IN CAPITAL LETTERS");
    str1=str.toUpperCase();
    System.out.println(str1);
    
    System.out.println("Enter name of hero in capital letter");
    str2=sc.next();
    str3=str2.toLowerCase();
    System.out.println(str3);
    Res=str1.concat(str3);
    
    System.out.println("The concatenation of two string is : "+Res);
    len=Res.length();
    System.out.println("The length of the string is : "+len);

    
   }
}