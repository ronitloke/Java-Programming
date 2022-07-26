/*Print the pattern

          1
		2 1 2
	  3 2 1 2 3
	4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5

*/
class p13 
{
	public static void main(String[] args) 
	{
		int n=5;
     
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n-i;j++)
			{
			System.out.print(" ");
			}
			for (int j=i;j>=1;j--) //when i=3 first space will print then 3 then j-- then 2 will print then 1 from left to right
			{
			System.out.print(j);
			}
			for (int j=2;j<=i;j++) //first row will be skipped as j=2 is greater than i the it will start printing from left to right
			{
			System.out.print(j);
			}
		System.out.println();
		}
	}
}
