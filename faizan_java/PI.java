class PI
{
      public static void main(String[] ar)
      {
	 float r = 5f;
	double e = circumferenceOfCircle(5);
	System.out.println(e);
	double b=res(5);
	System.out.println("Area is " + b);
	boolean t = oddEven(5);
	
	
      }
	static double res(double r)
	{
		double area  = 3.142*r*r; 
		return area;
	}
	static double circumferenceOfCircle(int r)
	{
		circumference = 2*3.14*r;
		return circumference;
	}
	static boolean oddEven(int number)
	{
		if(number%2 == 0)
		{
			return true;
		}else{
			return false;
		}	
	}
}