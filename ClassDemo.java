import java.util.*;
class Employee
{
   int empId=102;
   String empName;
   double basicSal;
   Scanner sc=new Scanner(System.in);
   public void getInfo()
   {
       System.out.println("Enter EmpId and Name");
       empId=sc.nextInt();
       empName=sc.nextLine();
       System.out.println("Enter your basic salary");
       basicSal=sc.nextDouble();
   }
  public void showInfo()
   {
       System.out.println("Verify your information:");
       System.out.println("Your empId:"+empId);
       System.out.println("Your empName:"+empName);
       System.out.println("Your Basic Salary:"+basicSal);
   }
}

public class ClassDemo
{
  public static void main(String args[])
  {
    Employee obj=new Employee();
    System.out.println("Information of empid"+obj.empId);
    obj.getInfo();
    obj.showInfo();
  }
}
    
