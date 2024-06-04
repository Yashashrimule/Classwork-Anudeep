import java.util.*;
class Vehicle
{
  void start()
  {
    System.out.println("Vehicle starting..");
  }
  void stop()
  {
    System.out.println("Vehicle stopping...");
  }
}
class Car extends Vehicle
{
  void drive()
  {
    System.out.println("Car is driving...");
  }
}
public class Main
{
  public static void main(String args[])
  {
    Car myCar=new Car();
    myCar.start();
    myCar.stop();
    myCar.drive();
  }
}