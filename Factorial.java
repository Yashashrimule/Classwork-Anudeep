public class Factorial
{
  public static void main(String args[])
  {
    int i=1,n=5,fact=1;
    do
    {
       fact=fact*i;
       System.out.println(fact);
       i++;
    }while(i<=5);
     System.out.println("The factorial is : "+fact);
  }
}