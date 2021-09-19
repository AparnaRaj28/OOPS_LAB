package first;
/*17. Create an interface having prototypes of functions area() and perimeter().
 *  Create two classes Circle and Rectangle which implement the above interface. 
 * Create a menu driven program to find the area and perimeter of objects.*/
import java.util.*;
interface AP
{
	void area();
	void perimeter();
}
class Circle implements AP
{

	public void area(int r)
	{
		double area_circle=3.14*r*r;
	
		System.out.println("The area of circle is:"+area_circle);
	}
	public void perimeter(int r)
	{
		double perimeter_circle=2*3.14*r;
		System.out.println("Perimeter of circle is:"+perimeter_circle);
	}
}
class Rectangle implements AP
{
	public void area(int l,int b)
	{
		double area_rec=l*b;
		System.out.println("Area of rectangle is:"+area_rec);
	}
	public void perimeter(int l,int b)
	{
		double per_rec=2*(l+b);
		System.out.println("Perimeter of rectangle is:"+per_rec);
	}
	
}
public class Area_Perimeter
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   Rectangle r=new Rectangle();
	   Circle c=new Circle();
	   System.out.println("Enter the radius of the circle:");
	   int radius=sc.nextInt();
	   System.out.println("Enter the length of the rectangle:");
	   int length=sc.nextInt();
	   System.out.println("Enter the breadth of the rectangle:");
	   int breadth=sc.nextInt();
	   System.out.println("---------------------------");
	   System.out.println("1.Area of circle");
	   System.out.println("2.Area of Rectangle");
	   System.out.println("3.Perimeter of circle");
	   System.out.println("4.Perimeter of rectangle");
	   System.out.println("---------------------------");

      for(int i=0;i<8;i++)
      {
   	   System.out.println("Enter choice:");
   	   int choice=sc.nextInt();
	   switch(choice)
	   {
	   case 1:c.area(radius);
	          break;
	   case 2:r.area(length,breadth);
              break;
	   case 3:c.perimeter(radius);
	          break;
	   case 4:r.perimeter(length,breadth);
	          break;
	   default:System.out.println("Invalid choice!");
	           break;
	   }
      }
   }
}
