/*Print the pattern

*        *
**      **
***    *** 
****  ****
**********
**********
****  ****
***    ***
**      **
*        *


*/


class  p14
{
	public static void main(String[] args) 
	{
		int n=4;

        //Upper part

		for (int i=1;i<=n;i++)
		{
			//1st part
			for (int j=1;j<=i;j++)
			{
		    System.out.print("*");
			}

			//spaces
			int space = 2*(n-i);       //Take seperate variable to declare space
			for (int k=1;k<=space;k++)
			{
			System.out.print(" ");
			}

		    //2nd part
			for (int j=1;j<=i;j++)
			{
		    System.out.print("*");
			}
		System.out.println();
		}

        //Lower part

		for ( int i=n;i>=1;i--)
		{
			//1st part
			for (int j=1;j<=i;j++)
			{
		    System.out.print("*");
			}
			
			//spaces
			int space = 2*(n-i);
			for (int k=1;k<=space;k++)
			{
			System.out.print(" ");
			}

		    //2nd part
			for (int j=1;j<=i;j++)
			{
		    System.out.print("*");
			}
		System.out.println();
		}
	}
}
