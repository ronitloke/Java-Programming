class p1 
{
	public static void Even(int a, int b)
	{
		for (int i=a;i<=b;i++)
		{
			if (i%2==0)
			{
		     System.out.println(i);
			}
		}
		return;
	}
	public static void main(String[] args) 
	{
	   Even(0,10);
	}
}
