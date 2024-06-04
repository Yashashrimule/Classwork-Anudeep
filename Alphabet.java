import java.util.*;

public class Alphabet
{
  public static  void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    char chr,chr1;
    System.out.println("Enter a character ");
    chr=sc.next().charAt(0);
    if(Character.isUpperCase(chr)==true)
    {
       chr1=Character.toLowerCase(chr);
       System.out.println("Lower case of " +chr+ " is "+chr1); 
       System.out.println("The ASCII value is: "+(int)chr1);     
    }
    else
    {
       chr1=Character.toUpperCase(chr);
       System.out.println("Lower case of "+chr+"is"+chr1); 
       System.out.println("The ASCII value is: "+(int)chr1);      
    }
  }
}