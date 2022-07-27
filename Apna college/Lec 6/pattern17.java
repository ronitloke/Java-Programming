/*Print the pattern

    *****
   *   *
  *   *
 *   *
*****

*/

class  p17
{
	public static void main(String[] args) 
	{
     int n=5;

	  for (int i=1;i<=n;i++)
	  {
		  //Space
		  for (int j=1;j<=n-i;j++)
		  {
		  System.out.print(" ");
		  
		  if (i==1 || i==n)
			{
             for (j=1; j<=n; j++)
		       {
               System.out.print("*");
		       }
			}
          else
		    {
             for (j=1; j<=n; j++)
		      {
                if (j==1 || j==n)
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
 }
}
	
