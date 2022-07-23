class p1
{
	public static void main(String[] args) 
	{
		int i=0;
		int n= 101;
	
       for (i=0;i<n;i++)
        {
			if (i%2==0)
			{
		     System.out.println(i);
			}
		}
		
		while (i<n)
		{
			if (i%2==0)
			{
			System.out.println(i);
			}
			i++;
		}
		do
		{
		System.out.println(i);
		i++;
		}
		while (i<n);
	}
}

