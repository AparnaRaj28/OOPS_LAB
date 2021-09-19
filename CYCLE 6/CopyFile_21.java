/*21. Write a program to copy one file to another.
*/
import java.io.*;
import java.util.*;
public class CopyFile_21 
{
	public static void main(String args[]) throws Exception
	{
		try
		{
		FileReader fr=new FileReader("file1.txt");
		BufferedReader br=new BufferedReader(fr);
		String s=" ";
		FileWriter fw=new FileWriter("File2.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
	catch(Exception e)
	{
		
	}
	}

}
