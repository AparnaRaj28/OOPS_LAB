package first;
/*16. Create classes Student and Sports. Create another class Result inherited from Student and Sports.
Display the academic and sports score of a student.
*/
interface Student
{
	String name="Aparna";
	String branch="MCA";
	void display();
}
interface Sports
{
	int score=30;
	String sp="Volleyball";
	void display();
}
class Result implements Student,Sports
{
	public void display()
	{
		System.out.println("Name:"+Student.name);
		System.out.println("Branch:"+branch);
		System.out.println("Sport:"+sp);
		System.out.println("Score:"+score);
	}

}
public class Academic_16
{
	public static void main(String args[])
	{
		Result obj=new Result();
		obj.display();
	
	}

}
