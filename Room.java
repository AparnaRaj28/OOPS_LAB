/*Write a program to create a room class,the attributes of this class are roomno,roomtype and roomarea.
 * Create two objects of this class using default and parameterized constructor.
 * Display the details of each room.*/
public class Room
{   
	int room_no;
	String room_type;
	double room_area;
	public Room()
	{
		room_no=1;
		room_type="Living room";
		room_area=150;
    }
	public Room(int n,String t,double a)
	{
		room_no=n;
		room_type=t;
		room_area=a;
	}
	public void display()
	{ 
		System.out.println();
		System.out.println("Room number:"+room_no);
		System.out.println("Room type:"+room_type);
		System.out.println("Room area:"+room_area+" m sq");
	}

	public static void main(String[] args) 
	{
	  Room obj1=new Room();
	  Room obj2=new Room(2,"Kitchen",50);
	  obj1.display();
	  obj2.display();
	  
      
	}

}
