class Pet
{
   int age;
   String name;
   Pet()
   {
     age=34;
     name="Rocky";
     System.out.println("Your pet name is : "+name+" he is "+age+" years old");
     System.out.println("Pet  is Rocky and he is 12 years old");
   }
}
public class ConstructorDemo
{
  public static void main(String args[])
  {
    Pet obj=new Pet();
  }
}