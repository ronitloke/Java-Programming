/*PRINT THE PATTERN

*         *
**       **
* *     * *
*  *   *  *
*   **    *
*   **    *
*  *   *  *
* *     * *
**       **
*         *

*/

class  p16
{
	public static void main(String[] args) 
	{
		int n=5;
         
		 //Uppper half
         
		for (int i=1;i<=n;i++)
		{   
			//1st part

			for (int j=1;j<=i;j++) 
			{
             if (j==1 || j==i)   //Used when j to i eg: i=3 then j=3, i=4 then j=4
             {
			System.out.print("*");
			 }
			 else
			 {
		    System.out.print(" ");
             }
			}

			//Spaces

			for (int j=1;j<=2*(n-i);j++)
			{
			System.out.print(" ");
			}
            
			//2nd part

			for (int j=1;j<=i;j++)
			{
				if (j==1 || j==i)
				{
				System.out.print("*");
				}
				else
				{
			    System.out.print(" ");
				}
			}
		System.out.println();
		}

		//Lower half

        for (int i=n;i>=1;i--)
		{   
			//1st part

			for (int j=1;j<=i;j++)
			{
             if (j==1 || j==i)
             {
			System.out.print("*");
			 }
			 else
			 {
		    System.out.print(" ");
             }
			}

			//Spaces

			for (int j=1;j<=2*(n-i);j++)
			{
			System.out.print(" ");
			}
            
			//2nd part

			for (int j=1;j<=i;j++)
			{
				if (j==1 || j==i)
				{
				System.out.print("*");
				}
				else
				{
			    System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}
