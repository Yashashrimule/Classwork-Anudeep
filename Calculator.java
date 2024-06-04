public class Calculator
{
  public int add(int a, int b)
  {
  return a + b;
  }
  public int add(int a, int b, int c)
  {
  return a + b + c;
  }
  public double add(double a, double b)
  {
  return a + b;
  }
  public double add(double a, double b,double c)
  {
  return a + b + c;
  }
  public static void main(String args[])
  {
  Calculator calculator = new Calculator();
  int sum1 = calculator.add(5,10);
  System.out.println(sum1);
  int sum2 = calculator.add(5,10,15);
  System.out.println(sum2);
  double sum3 = calculator.add(5.5,10.5);
  System.out.println(sum3);
  double sum4 = calculator.add(5.5,10.5,15.5);
  System.out.println(sum4);
  }
}

  