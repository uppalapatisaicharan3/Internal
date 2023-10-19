package Internal;

		class AreaDemo
		{
		    void area(int x,int y)
		    {
		        System.out.println("the area of the triangle  is "+0.5*x*y+" sq units");
		    }
		    void area(float x, float y)
		    {
		        System.out.println("the area of the rectangle is "+x*y+" sq units");
		    }
		    void area(double x)
		    {
		        double z = 3.14 * x * x;
		        System.out.println("the area of the circle is "+z+" sq units");
		    }
		}
		public class Area
		{
		     public static void main(String args[]) 
			{
			   AreaDemo ob = new  AreaDemo();
			   ob.area(5,5);
			   ob.area(11,12);
			   ob.area(2.5);
		        }

	}

