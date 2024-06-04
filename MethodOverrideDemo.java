class Parent
{
   public void show()
   {
    System.out.println("It is parent class show");
   }
}
class Child extends Parent
{
  public void show()
  {
   System.out.println("It is child class show");
  }
}
public class MethodOverrideDemo
{

  public static void main(String args[])
  {
    Child obj=new Child();
    obj.show();
    Parent obj1=new Parent();
    obj1.show();
  }
}

  