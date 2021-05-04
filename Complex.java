/*Create a class to represent complex numbers.Create two objects of the class and add them.*/
public class Complex 
{
	int real,imaginary;
	int comple_sum=0,imag_sum=0;
	public Complex(int r,int i)
	{
		real=r;
		imaginary=i;	
	}
	public void display()
	{
       System.out.println(real+"+i "+imaginary); 
	}

	public static void main(String args[])
	{
		Complex obj1=new Complex(1,2);
		Complex obj2=new Complex(3,4);
		System.out.print("First Complex number: ");
		obj1.display();
		System.out.print("Second Complex number: ");
		obj2.display();
		
		System.out.println("Sum is:"+(obj1.real+obj2.real)+"+i "+(obj1.imaginary+obj2.imaginary));
		
		
	}

}
