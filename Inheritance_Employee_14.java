package first;
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
	
	public Teacher(int id,int sal,String nme,String add,String d,String sub)
	{
		super(id,sal,nme,add);
		dept=d;
		subject=sub;
	}
	public void display()
	{
   
        System.out.println();
		System.out.println(Empid+" : "+Salary+" : "+name+" : "+address+" : "+dept+" : "+subject);
	}
}

 class Inheritance_Employee_14 
{

	public static void main(String[] args) 
	{
		 Teacher[] t=new Teacher[5];
		 t[0]=new Teacher(101,30000,"Name1","Trivandrum","MCA","java");
		 t[1]=new Teacher(102,25000,"Name2","Kollam","CS","dbms");
		 t[2]=new Teacher(103,35000,"Name3","Kesavadaspuram","Mtech","java");
		 t[3]=new Teacher(104,15000,"Name4","Attingal","Btech","java");
		 t[4]=new Teacher(105,30000,"Name5","Mangalapuram","MCA","java");

		 System.out.println("-------The details are------");
	     System.out.println("Empid|Salary|Name|Address|Department|Subject");
	  	for(Teacher i:t)
	  	{
	  		i.display();
	  	}
      
	}

}
