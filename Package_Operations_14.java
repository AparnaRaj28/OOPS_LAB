/*Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic operations. 
 * Test the package by implementing all operations on two given numbers.
*/
import ArithmeticPack.*;
import java.util.*;
public class Package_Operations_14 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter first number:");
	  int n1=sc.nextInt();
	  System.out.println();
	  System.out.print("Enter Second number:");
	  int n2=sc.nextInt();
	  Operations obj=new Operations();
	  System.out.println("The Sum is:"+obj.add(n1, n2));
	  System.out.println("The difference is:"+obj.difference(n1, n2));
	  System.out.println("After division:"+obj.division(n1, n2));
	  System.out.print("After multiplication:"+obj.multiplicate(n1,n2));
			  
  }
}
