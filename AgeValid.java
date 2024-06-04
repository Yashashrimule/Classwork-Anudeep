//WAP to ckeck whether user can vote or not
import java.util.*;
class AgeValid
{
 public static void main(String args[])
{
  int age;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your age :"); 
  age=sc.nextInt();
  if(age>=18)
  {
   System.out.println("You are eligible for voting as your age is"+" "+age); 
  }
   else
   {
    System.out.println("You are not eligible for voting as your age is"+" "+age); 
   }
 }
}
        
  
