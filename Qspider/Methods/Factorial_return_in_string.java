/*Factorial of 7 and return result in string format*/

class p11 
{
	public static int factorial(int n)
	{
	    int fact = 1;
		for (int i=n;i>=1;i--)
		{
		    fact = fact * i;
		}		
		return fact;
	}
	public static void main(String[] args) 
	{	
		
		System.out.println("Result : " + factorial(7));
	}
}
