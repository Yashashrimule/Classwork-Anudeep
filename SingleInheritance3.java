class Father
{
  public void house()
  {
      System.out.println("Have own 2BHK house..");
  }
}
class Son extends Father
{
   public void car()
   {
      System.out.println("Have own Audi car..");
   }
}
public class SingleInheritance3
{
  public static void main(String args[])
  {
    Son obj=new Son();
    obj.house();
    obj.car();
  }
}