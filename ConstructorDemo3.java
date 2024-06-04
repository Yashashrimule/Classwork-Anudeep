class Employee
{
   int Emp_id,Emp_sal;
   String Emp_name,Emp_dept;
   Employee(int Emp_id,String Emp_name,String Emp_dept,int Emp_sal)
   {
     System.out.println("Employee id is : "+Emp_id);
     System.out.println("Employee name is : "+Emp_name);
     System.out.println("Employee department is : "+Emp_dept);
     System.out.println("Employee salary is : "+Emp_sal);

   }
}
public class ConstructorDemo3
{
  public static void main(String args[])
  {
    Employee obj=new Employee(101,"Yashashri","Computer",65000);
  }
}