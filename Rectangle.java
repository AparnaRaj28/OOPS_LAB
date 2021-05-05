/*Write a program in Java with class Rectangle with the data fields width, length, area and color .
 * The length, width and area are of double type and color is of string type.
 *Use constructors and the method to find the area. Create two objects of Rectangle and compare their area and color.
 * If area and color both are the same for the objects then display “Matching Rectangles” otherwise display “Non matching Rectangle”.*/
public class Rectangle
{
     double length,width,area;
     String color;
		public Rectangle(double l,double w,String c)
		{
			length=l;
			width=w;
			color=c;	
		}
		public double area()
		{
			area=length*width;
			return area;
		}

	public static void main(String[] args) 
	{
        Rectangle obj1=new Rectangle(3,4,"Red");
        Rectangle obj2=new Rectangle(4,2,"Red");
        if(obj1.color==obj2.color && obj1.area()==obj2.area())
        {
        	System.out.println("Matching rectangles");
        }
        else
        {
        	System.out.println("Non Matching rectangles");
        }

	}

}
