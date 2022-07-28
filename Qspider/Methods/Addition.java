class p3 
{
	public static int Add(int a, int b)
	{
		int sum=0;
		for (int i=a;i<=b;i++)
		{
			if (i%3==0 && i%7==0)
	         {
		      sum = sum + i;
	          }
		}
		//System.out.println(sum); Note: here it is not necessary to print as we r already printing method name in main method
		return sum;   // here there will be values or the variable where values are stored.
	}

	public static void main(String[] args) 
	{
		System.out.println(Add(0,100));

	}
}
