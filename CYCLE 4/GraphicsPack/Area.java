/*Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle, Square and Circle.
 * Test the package by finding the area of these figures.*/
package GraphicsPack;


public class Area 
{
		public double RecArea(double l,double b)
		{
			double r_area=(l*b);
			return r_area;
		}

		public double TriArea(double b,double h)
		{
			double a=0.5;
			double t_area=a*(b*h);
			return t_area;
		}

       public double SqArea(double l)
		{
    	   double s_area=l*l;
			return s_area;
			
		}	


		public double CirArea(double r)
		{
			double b=3.14;
			double c_area=b*r*r;
			return c_area;
		}
	
}
