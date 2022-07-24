class p3 
{
	public static void main(String[] args) 
	{
		int i = 5;
		int fact = 1;

        do
        {
			fact = fact *i;
			i--;
        }
        while (i>=1);
		System.out.println(fact);
	}
}

/*output
120
*/
