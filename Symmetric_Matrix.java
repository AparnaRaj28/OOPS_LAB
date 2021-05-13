import java.io.*;

public class Symmetric_Matrix
{

	public static void main(String[] args)throws IOException
	{
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		int m[][]=new int[10][10];
		int t[][]=new int[10][10];
		int flag=1;
		System.out.println("Enter the order of the matirx:");
		int n=Integer.parseInt(b.readLine());

		System.out.println("Enter the elements of the matrix:");
		for(int i=0;i<n;i++)
		{
             for(int j=0;j<n;j++)
             {
            	 m[i][j]=Integer.parseInt(b.readLine());
            	
             }
	    }
		for(int i=0;i<n;i++)
		{
             for(int j=0;j<n;j++)
             {
            	 t[j][i]=m[i][j];
            	
             }
	    }
	      System.out.println("Matrix:");
	       for(int i=0;i<n;i++)
	       {
	    	   for(int j=0;j<n;j++)
	    	   {
	    		   System.out.print(" "+m[i][j]);
	    		   
    	   }
	    	   System.out.println();
	       }
	 
	      System.out.println("Transpose:");
	       for(int i=0;i<n;i++)
	       {
	    	   for(int j=0;j<n;j++)
	    	   {
	    		   System.out.print(" "+t[i][j]);
	    		   
	    	   }
	    	   System.out.println();
	       }
	       for(int i=0;i<n;i++)
	       {
	    	   for(int j=0;j<n;j++)
	    	   {
	    		   if(m[i][j]!=t[i][j])
	    		   {
                      flag=0;
                      break;
                     
	    		   }
	    		 
	    	   }
	    	   if(flag==0)
	  	     {
	  	    	 System.out.println("Matrix is not symmetric");
	  	    	 break;
	  	     }
	  	     else
	  	     {
	  	    	 System.out.println("Matrix is  symmetric");
	  	    	 break;
	  	     }
	       }
	    
	     
	 
	}

}
