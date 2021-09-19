/* Program to create a class for Employee having attributes eNo, eName, eSalary.

 *  Read n employ information and Search for an employee given eNo, using the concept of Array of Objects.*/
import java.util.*;
class Emp
{
 int eno,esalary;
 String ename;
 Emp(int no,String name,int salary)
 {
	 eno=no; 
	 ename=name;
	 esalary=salary;
 }
 public void display()
 {
	 System.out.println();
	System.out.println("Employee number:"+eno);
	System.out.println("Employee name:"+ename);
	System.out.println("Employee salary:"+esalary);
 }
 public boolean search(int num)
 {
	 if(num==eno)
	 {
		return true;
		
	 }
	 else
	 {
		return false;
	 }
 }
}
public class ArrayOfObjects_Employee 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of employees:");
		int n=s.nextInt();
		Emp e[]=new Emp[n];
		for(int i=0;i<n;i++)
		{
			System.out.println();
			System.out.print("Enter Employee "+(i+1)+" number:");
			int no=s.nextInt();
			System.out.print("Enter Employee "+(i+1)+" name:");
			String name=s.next();
			System.out.print("Enter Employee "+(i+1)+" Salary:");
			int salary=s.nextInt();
			e[i]=new Emp(no,name,salary);
		}

		System.out.println("Enter emp no to search for employee:");
		int num=s.nextInt();
		for(Emp i:e)
		{
			if(i.search(num))
			{
				i.display();
				break;
			}
			else
			{
				System.out.println("No employee with entered employee number");
			}

			
		}
		
        

	}

}
