class BMI1
{
   public static void main(String[] ar)
	{
		int weight=55;
		double height=1.7;
		double BMI = weight/(height*height);
		if(BMI>40)
		{
		  System.out.println("above range");
		}
		if(BMI<=18.5)
		{
		  System.out.println("you're in the underweigt range");
		}
		else if(BMI>18.5 && BMI<=24.9)
		{
		  System.out.println("you're in the healthy range");
		}
		else if(BMI>=25 && BMI<29.9)
		{
		  System.out.println("you're in the overweight range");
		}
		else //if(BMI>=30 && BMI<39.9)
		{
		  System.out.println("you're in the obese range");
		}
	}
}