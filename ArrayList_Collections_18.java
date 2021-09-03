/* Maintain a list of Strings using ArrayList from the collection framework, perform built-in operations.
*/
import java.util.*;
public class ArrayList_Collections_18
{
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<String>();	
		Scanner sc=new Scanner(System.in);
		System.out.println("------STRING OPERATIONS------");
		System.out.println("1.Add String");
		System.out.println("2.Add String in Position");
		System.out.println("3.Replace String");
		System.out.println("4.Remove String");
		System.out.println("5.Size of String");
		System.out.println("6.Search String:");
		System.out.println("7.Sort String");
		System.out.println("8.Display String Array");
		System.out.println("9.Exit");
		int choice;
       do
	   {
		System.out.println("Enter choice:");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:System.out.print("Enter the string to add:");
				   String str=sc.next();
				   	a.add(str);
				   	break;
			case 2:System.out.print("Enter the position in which you want to add the item:");
			       int pos=sc.nextInt();
			       if(pos<0 || pos>a.size())
			       {
			    	   System.out.println("Invalid position");
			       }
			       else
			       {
			       System.out.print("Enter the string to insert:");
			       String pos_str=sc.next();
			       a.add(pos,pos_str);
			       }
			       break;
			case 3:System.out.print("Enter the position of the item to replace:");
				   int re_pos=sc.nextInt();
				   if(re_pos<0 || re_pos>a.size())
			       {
			    	   System.out.println("Invalid position");
			       }
			       else
			       {
				   System.out.print("Enter the string to be replaced:");
				   String re_str=sc.next();
				   a.set(re_pos, re_str);
			       }
				   break;
			case 4:System.out.print("Enter the string to be removed from array:");
				   String rem_str=sc.next();
				   a.remove(rem_str);
				   break;
			case 5:System.out.print("Size of the array is:"+a.size());
				   break;
			case 6:System.out.println("Enter the index number:");
			       int index=sc.nextInt();
			        if(index<0 || index>a.size())
		           {
		    	   System.out.println("Invalid position");
		           }
		          else
		          {
			       System.out.print("The value of array at index "+index+" is:"+a.get(index));
		          }
			       break;
			case 7:System.out.println("The sorted array is:");
			       Collections.sort(a);
			       System.out.println(a);
			       break;
			case 8:System.out.println(a);
			       break;
			case 9:System.out.println("Exiting...");
			       break;
			
			default:System.out.println("Invalid choice!");
			       break;
			
		}
	   }
       while(choice!=9);
			
	}
}
