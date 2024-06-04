class Pet
{
   int age;
   String name;
   Pet(String name,int age)
   {
     
     System.out.println("Your pet name is : "+name+" he is "+age+" years old");
     System.out.println("Pet  is Rocky and he is 12 years old");
   }
}
public class ConstructorDemo2
{
  public static void main(String args[])
  {
    Pet obj=new Pet("Yoyo",45);
  }
}