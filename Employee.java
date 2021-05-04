/*Define a class called Employee that includes three datamembers-employeeid,name and a monthly salary.
 * Provide a read method and a display method.
 * Create two Employee objects and display each employees yearly salary.
 */
public class Employee
{
	int emp_id,salary;
	String name;
	public void read(int id,String nme,int sal)
	{
		emp_id=id;
		name=nme;
		salary=12*sal;
	}
   public void display()
   {
	   System.out.println("Id:"+emp_id+" ,"+"Name:"+name+" ,"+"Yearly Salary:"+salary);
	   System.out.println();
	   
   }
   public static void main(String args[])
   {
	  Employee obj1=new Employee();
	  Employee obj2=new Employee();
	  obj1.read(1,"Megha",10000 );
	  obj2.read(1,"Akhil",15000 );
	  obj1.display();
	  obj2.display();
   }
}
