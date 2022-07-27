/*Print the pattern


      *
    * * *
  * * * * * 
* * * * * * *
* * * * * * *
  * * * * *
    * * *
	  *

*/
class  p15
{
	public static void main(String[] args) 
	{
		int n=4;
        
		//Upper half
		for (int i=1;i<=n;i++)
		{
			//Spaces
			for (int j=1;j<=n-i;j++)
			{
		System.out.print(" ");
			}
			//Stars
			for (int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}

		//Lower half
		for (int i=n;i>=1;i--) //Here after decrement i becomes 4/3/2/1/0
		{
			
			//Spaces
			for (int j=1;j<=n-i;j++) // j<=4-4=0, 4-3=1, 4-2=2, 4-1=3, 4-0=4
			{
		System.out.print(" ");
			}

			//Stars
			for (int j=1;j<=2*i-1;j++) // 2*4-1=7, 2*3-1=5, 2*2-1=3,2*1-1=1
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
