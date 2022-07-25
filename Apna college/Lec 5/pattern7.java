/*Print the pattern

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/
class p7 
{
	public static void main(String[] args) 
	{
		int n = 5;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
		    System.out.print(j+" "); //Whichever value is stored in j it will print that
			}
		System.out.println();
		}
	}
}
