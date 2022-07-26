/*Print the pattern

       1
      2 2
     3 3 3
    4 4 4 4
   5 5 5 5 5

*/
class p12 
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
			for (int k=1;k<=i;k++)
			{
			System.out.print(i+" ");
			}
		System.out.println();
		}
	}
}
/*Note: choose variable according to needs like in every line if we want to print same num from start '1' then call same loop
        and if we want to print incremented num on every new line then call incremented variable loop 'i'
*/