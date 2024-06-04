class AccountThread extends Thread
{
  static int balance=1000;
  public void run()
  {
    synchronized(AccountThread.class)
    {
     if(balance>=800)
     {
       System.out.println(Thread.currentThread().getName() + "your balance is" +balance+ "so you can withdraw the amount");
       try
       {
        Thread.sleep(1000);
       }
       catch(InterruptedException e)
       {
          e.printStackTrace();
       }
       balance=200;
       System.out.println(Thread.currentThread().getName() + "After withdrawl your balance is "+ balance);
    }
    else
    {
      System.out.println(Thread.currentThread().getName() + "your balance is"  +balance+ "so you cant withdraw amount");
    }
   }
 }
}
public class Threadsync
{
 public static void main(String args[])
 {
   AccountThread ac1=new AccountThread();
   ac1.setName