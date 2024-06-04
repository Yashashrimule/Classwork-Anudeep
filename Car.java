public class Car
{
  private String color;
  private int maxSpeed;
  
  public void setMaxSpeed(int maxSpeed)
  {
    this.maxSpeed=maxSpeed;
  }

  public void setColor(String color)
  {
    this.color=color;
  }

  public void carInfo()
  {
    System.out.println("Car color= "+color+ "Max Speed= "+maxSpeed);
  }
   
  public static void main(String args[])
  {
    Car nano=new Car();
    nano.setColor("RED");
    nano.setMaxSpeed(330);
    nano.carInfo();
    Maserati quattroporte=new Meserati();
    quattrope.MeseratiStartDemo();
  }
}

class Meserati extends Car
{
  public void MeseratiStartDemo()
  {
     Engine MeseratiEngine=new Engine();
     MeseratiEngine.start();
     MeseratiEngine.stop();
  }
}
class Engine
{
  public void start()
  { 
    System.out.println("Started");
  }
 
    