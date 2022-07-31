/*Count the total of all the no divisible by 3 and 9 btwn 0 to 100 and return count
*/

class p12 
{
	public static int counter(int a, int b)
	{
		int count = 0;

		for (int i=a;i<=b;i++)
		{
			if (i%3==0 && i%9==0)
			{
				count = count + i;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println(counter(0,100));
	}
}
