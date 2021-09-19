/*19. Write a program to remove all the elements from a linked list.*/
import java.util.*;
public class Remove_LinkedList_19 {
	public static void main(String args[])
	{
		LinkedList<Integer> l=new LinkedList<Integer>();
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("----Linked list operation----");
		System.out.println("1.Add item");
		System.out.println("2.Remove all elements");
		System.out.println("3.Display list items");
		System.out.println("4.Quit");
		do 
		{	
		System.out.println("   Enter your choice:");	
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter the item to add:");
		       int item=sc.nextInt();
		       l.add(item);
		       System.out.println("     Item added");
		       break;
		case 2: l.clear();
				System.out.println("  List is cleared");
				break;
		case 3: System.out.println(l);
				break;
		case 4: System.out.println("   Quiting..");		
        		break;
		default: System.out.println("Invalid choice..");
				break;	
		
		}
		}while(choice!=4);
	}

}
