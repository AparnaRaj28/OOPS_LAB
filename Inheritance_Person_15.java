package first;
/*15. 	Create a class ‘Person’ with data members Name, Gender, Address, Age 
 *and a constructor to initialize the data members and another class ‘Employee’ that inherits
 * the properties of class Person and also contains its own data members like Empid, Company_name,
 * Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits the properties of
 * class Employee and contains its own data members like Subject, Department, Teacherid and also contain 
 * constructors and methods to display the data members. Use array of objects to display details of N teachers.
*/

class Person
{
	String name,gender,address;
	int age;
	public Person(String name,String gender,String address,int age)
	{
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
		
	}
}

class Employee1 extends Person
{
	int empid,salary;
	String company_name,qualification;
	public Employee1(String name,String gender,String address,int age,int empid,String company_name,String qualification,int salary)
	{
		super(name,gender,address,age);
		this.empid=empid;
		this.salary=salary;
		this.company_name=company_name;
		this.qualification=qualification;
	}
	
}
class Teacher1 extends Employee1
{
	public Teacher1(String name,String gender,String address,int age,int empid,String company_name,String qualification,int salary)
	{
		super(name,gender,address,age,empid,company_name,qualification,salary);

	}
	public void dis()
	{
		System.out.println(name+" : "+gender+" : "+address+" : "+age+" : "+empid+" : "+company_name+" : "+qualification+" : "+salary);
	}
}

public class Inheritance_Person_15
{

	public static void main(String[] args) 
	{
	  
	  System.out.println("Enter the number of Teachers:");

	  Teacher1 t[]=new Teacher1[3];
	  System.out.println("-------Teacher details------");
      t[0]=new Teacher1("name1","female","Triv",32,101,"ddd","Mtech",30000);
      t[1]=new Teacher1("name2","male","kollam",28,101,"abc","Mphil",45000);
      t[2]=new Teacher1("name3","female","tvm",30,101,"xyz","Msc",50000);
	  for(Teacher1 i:t)
	  {
		  i.dis();
	  }

	}

}
