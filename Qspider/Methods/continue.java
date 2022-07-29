class  p8
{
	public static void main(String[] args) 
	{
		int a=1;
		while (a<5)
		{
		System.out.println("*");
           if (a==2)
           {
			  System.out.println(a);
			  a++;
			  continue;                //If we use continue then it will transfer control to the beginning of the loop condition
			  //break;                //If we use break then it will stop the execution and transfer control back to end of the block
           }
		    System.out.println("*");  // here this will not execute when a==2 as continue keyword will transfer back control to beginning at a=2
			  a++;
		}
    System.out.println("Main-end");
	}
}

/*output with break
*
*
*
2
*
*
*
*
Main-end

*/



