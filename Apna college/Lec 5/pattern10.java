/*Print the pattern

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/
class p10 
{
	public static void main(String[] args) 
	{
		int n = 5;

		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				int sum = i+j; // used to add two cells and store it in sum

				if (sum % 2==0) // used to find even num cell after addition
				{
		        System.out.print(1+" ");
				}
				else
				{
				System.out.print(0+" ");
				}
			}
		System.out.println();
		}
	}
}

/*Note
If you want to revert the values just make sum % 2!=0
*/
