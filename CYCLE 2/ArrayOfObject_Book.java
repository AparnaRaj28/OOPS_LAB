
/*Define a class named Book with details such as ISBN, title, author, price and publisher. 
 * Create an array of 5 book objects. Display the book details after sorting based on title.
*/
import java.util.*;
class Book
{
	int isbn,price;
	String title,author,publisher;
	Book(int isbn,String title,String author,String publisher,int price)
	{
		this.isbn=isbn;
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
		
	}
	public void display()
	{
		System.out.println(isbn+title+author+publisher+price);
	}
}
public class ArrayOfObject_Book 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Book b[]=new Book[5];
		System.out.println("------Enter book details------");
		for(int i=0;i<5;i++)
		{
			System.out.println("***Enter Book "+(i+1)+" details***");
			System.out.print("Enter ISBN:");
			int isbn=s.nextInt();
			System.out.print("Enter Title:");
			String title=s.next();
			System.out.print("Enter Author:");
			String author=s.next();
			System.out.print("Enter Price:");
			int price=s.nextInt();
			System.out.print("Enter Publisher:");
			String publisher=s.next();
			b[i]=new Book(isbn,title,author,publisher,price);
			//Arrays.sort(b);
			System.out.println("Book destails are:");
		}

	for(Book i:b)
	{
		i.display();
	
	}
	}
}
