/*Read 2 matrices from the console and perform matrix addition.*/
import java.io.*;
public class MatrixAddition 
{


	public static void main(String[] args)throws IOException
	{
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int first[][]=new int[20][20];
        int second[][]=new int[20][20];
        int sum[][]=new int[20][20];
		System.out.println("Enter the order of the matirx(row,column):");
		int r=Integer.parseInt(b.readLine());
		int c=Integer.parseInt(b.readLine());
   
		System.out.println("Enter the elements of first matrix:");
		for(int i=0;i<r;i++)
		{
             for(int j=0;j<c;j++)
             {
            	 first[i][j]=Integer.parseInt(b.readLine());
             }
	    }
		
		System.out.println("Enter the elements of second matrix:");
		for(int i=0;i<r;i++)
		{
             for(int j=0;j<c;j++)
             {
            	 second[i][j]=Integer.parseInt(b.readLine());
             }
	    }
		for(int i=0;i<r;i++)
		{
             for(int j=0;j<c;j++)
             {
            	 sum[i][j]=first[i][j]+second[i][j];
             }
	    }
       System.out.println("First Array:");
       for(int i=0;i<r;i++)
       {
    	   for(int j=0;j<c;j++)
    	   {
    		   System.out.print(" "+first[i][j]);
    		   
    	   }
    	   System.out.println();
       }
       System.out.println("Second Array:");
       for(int i=0;i<r;i++)
       {
    	   for(int j=0;j<c;j++)
    	   {
    		   System.out.print(" "+second[i][j]);
    		   
    	   }
    	   System.out.println();
       }
       System.out.println("After matrix addition:");
       for(int i=0;i<r;i++)
       {
    	   for(int j=0;j<c;j++)
    	   {
    		   System.out.print(" "+sum[i][j]);
    		   
    	   }
    	   System.out.println();
       }
 }
 }
