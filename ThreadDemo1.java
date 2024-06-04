public class ThreadDemo1 extends Thread
{
  public void run()
  {
    int a=10,b=20;
    int c=a+b;
    System.out.println("thread is running");
    System.out.println("the addition is:"+c);
  }
   public static void main(String args[])
   {
      ThreadDemo1 obj=new ThreadDemo1();
      obj.start();
    }
}