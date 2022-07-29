class  p7
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
			  break;                //If we use break then it will stop the execution and transfer control back to end of the block
           }
		    System.out.println("*");
			  a++;
		}
    System.out.println("Main-end");
	}
}
/*Output without break      
*                           
*
*
2
*
*
*
Main-end



output with break
*
*
*
2
Main-end*/

