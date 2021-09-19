/*Create a class named CPU with attribute price.
 * Create inner class Processor (no. of cores, manufacturer) 
 * and static nested class RAM (memory, manufacturer).
 *  Create an object of CPU and print information of Processor and RAM.*/
public class CPU
{
	int price;
	class Processor
	{
		int no_cores=10;
		String manufacturer="abc";
		public void display()
		{
			System.out.println("Processor information:");
			System.out.println("Number of cores:"+no_cores );
			System.out.println("Manufacturer:"+ manufacturer);
		}
	}
	static class RAM
	{
		int memory=4;
	    String manufacturer="cd";
		public void display()
		{
			System.out.println();
			System.out.println("RAM information:");
			System.out.println("Memory:"+memory );
			System.out.println("Manufacturer:"+ manufacturer);
			
		}
	}

	public static void main(String[] args) 
	{
		CPU obj=new CPU();
	    CPU.Processor obj1=obj.new Processor();
	    obj1.display();
	    CPU.RAM obj2=new CPU.RAM();
	    obj2.display();

	}

}
