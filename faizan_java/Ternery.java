class Ternery
{
    public static void main(String[] ar)
    {
    	int a = 50 ;
	int b = 20;
	int c = 30;
	int y = a>b && a>c?a:(b>c)?b:c;
	System.out.println(y);
    }	
}