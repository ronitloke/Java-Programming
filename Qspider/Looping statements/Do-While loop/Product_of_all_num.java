class p2 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int product = 1;   
		do
		{
			if (i%3==0 && i%7==0)
			{
			 product = product * i;
			}
			i++;
		}
		while (i<=50);
		 System.out.println(product);
	}
}
