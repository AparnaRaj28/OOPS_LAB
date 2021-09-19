/*Find the average of N positive integers, raising a user defined exception for each negative input*/
import java.util.*;
public class Exception_AverageOf_15 
{
	public static void main(String args[])
	{
		int sum=0;
		double avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an interger:");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" positive integers");
		for(int i=0;i<n;i++)
		{
		    int a=sc.nextInt();
            try
            {
            	if(a<0)
            	{
            		n++;
            		throw new NegativeException();
            	}
            	else
            	{
            		sum=sum+a;
            	}
             }
            catch(NegativeException e)
    		{
    			System.err.println("Cannot Enter negative value");
    		}
    	
		}
		System.out.println(sum);
		avg=(double)sum/n;
		System.out.println("Average is:"+avg);
	
		
	}

}
