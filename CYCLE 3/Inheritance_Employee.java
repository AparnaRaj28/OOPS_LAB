/*14. 	Create a class ‘Employee’ with data members Empid, Name, Salary, Address and constructors to initialize the data members.
 *  Create another class ‘Teacher’ that inherit the properties of class employee and
 *   contain its own data members department, Subjects taught and constructors to initialize these data members 
 *   and also include display function to display all the data members. Use array of objects to display details of N teachers.
*/

class Employee
{
 
  int Empid,Salary;
  String name,address;
  public Employee(int id,int sal,String nme,String add)
  {
	  Empid=id;
	  Salary=sal;
	  name=nme;
	  address=add;
	  
  }
}
 class Teacher extends Employee
{
	String dept,subject;
	
	public Teacher(String d,String sub)
	{
		
		dept=d;
		subject=sub;
	}
	public void display()
	{
		System.out.println(Empid,Salary);
	}
}

 class Inheritance_Employee_14 
{

	public static void main(String[] args) 
	{
	  	Teacher obj=new Teacher('mca','java');
	  			
      
	}

}
