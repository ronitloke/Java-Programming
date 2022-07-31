class p15 
{
	public static int characters(int ch)
	{
		int sum=0;
		for (int i='a';i<=ch;i++)
		{
			sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println(characters('e'));
	}
}
