/*Define a class for performing string manipulations. Write a menu-driven program to
 *  perform the following operations (without using built-in functions):
1)Count the number of occurrences of each word in the given sentence.
2)Replace a particular word with another word.
3)Reverse each word in a sentence.
*/
import java.util.*;
public class String_Manipulation_13
{
	String sentence;
	String word;
	String_Manipulation_13(String sen)
	{
		sentence=sen;
		
	}
	public void no_occurence_word(String sen,String word)
	{
		String temp[] = sen.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++) 
		{
		if (word.equals(temp[i]))
		   count++;
		}
		System.out.println("The string is: " + sentence);
		System.out.println("The word " + word + " occurs " + count + " times in the above string");
		
	}
	public void replace(String sen,String old_word,String new_word)
	{
	
       String res = "";
		String words[]	=sen.split(" ");
		for(String word:words)
		{
			if(word.equals(old_word))
			{
				res += new_word+" ";
			}
			else
			{
				res += word+" ";
			}
		}
		System.out.println("New String is:"+res.trim());
	}
	public void reverse_word(String sen) 
	{
		String words[] = sen.split("\\s");
        String reversedString = "";
 
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
 
        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a sentence:");
		String sen=sc.nextLine();
		System.out.println("------Enter choice------");
		System.out.println("1.Count words in a string");
		System.out.println("2.Replace string");
		System.out.println("3.Reverse each word");
	
		String_Manipulation_13 obj=new String_Manipulation_13(sen);
		
	
		for(int i=0;i<=3;i++)
		{
			System.out.println();
			System.out.println("------Enter choice------");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter the word:");
			        String word=sc.next();
			        obj.no_occurence_word(sen, word);
			        break;
			case 2:System.out.println("Enter the word you want to replace with:");
			       String old_word=sc.next();
			       System.out.println("Enter the word to replace:");
			       String new_word=sc.next();
			       obj.replace(sen, old_word, new_word);
			       break;
			case 3:obj.reverse_word(sen);
			       break;
		    default: System.out.println("Incorrect choice!");
			         break;
			}
			
		}
			

	}

}
