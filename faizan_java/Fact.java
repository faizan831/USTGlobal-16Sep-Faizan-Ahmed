class Fact
{
     public static void main(String[] ar)
     {
     	 int factRes = factN(4);
	System.out.println(factRes);
     }
     static int factN(int num)
	{
		int fact = num*factN(num-1);
		return fact;
	}
}