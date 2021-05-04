

/*Define a class named student with data members such  as name,roll num,marks of three subjects.
 * Create three objects and find out the student who scored the highest marks.*/
public class Student
 {
	int roll_no,mark1,mark2,mark3;
	String name;
    public Student(String nme,int r,int m1,int m2,int m3)
    {
    	roll_no=r;
        name=nme;
        mark1=m1;
        mark2=m2;
        mark3=m3;
        
    }
    public int total_mark()
    {
    	int total=0;
    	total=mark1+mark2+mark3;
    	return total;
    }
 
	public static void main(String[] args) {
		Student obj1=new Student("Malavika",01,6,7,8);
		Student obj2=new Student("Parvathy",02,10,9,6);
		Student obj3=new Student("Graze",03,7,8,10);
        if(obj1.total_mark()>obj2.total_mark())
        {
        	System.out.println(obj1.name+" has the highest score with the total score "+obj1.total_mark());
        }
        else if(obj2.total_mark()>obj3.total_mark())
        {
        	System.out.println(obj2.name+" has the highest score with the total score "+obj2.total_mark());
        }
        else
        {
        	System.out.println(obj3.name+" has the highest score with the total score "+obj3.total_mark());
        }
        
	

	}


}
