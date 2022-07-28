class p2 
{
	public static void divisible(int a, int b)
	{
		for (int i=a;i<=b;i++)
		{
			if (i%3==0 && i%7==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		divisible(0,100);
		//System.out.println(divisible(0,100)); Note : This will not work as there is no return type so it will not
													 //return value to method name so it will not print any value.
	}
}
