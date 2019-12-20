class TestH
{
   public static void main(String[] ar)
   {
	char grade = 'A';
	switch(grade)
	{
	case 'A' : System.out.println("FCD");
		   break;
	
	case 'B' : System.out.println("FC");
		   break;
	
	case 'C' : System.out.println("SC");
		   break;
	
	case 'D' : System.out.println("Jest pass");
		   break;
	
	case 'E' : System.out.println("Fail");
		   break;
	
	default : System.out.println("Invalid grade");
		   
	}
   }
}