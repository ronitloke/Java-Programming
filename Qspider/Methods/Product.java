import java.util.*;
class p6 
{

	public static int product(int a, int b)
	{
		int res=0;
       for (int i=a;i<=b;i++)
       {
		   if (i%2!=0)
		   {
		      res = res + i;
		   }
       }
	   return res;	   		
	}

	public static void main(String[] args) 
	{
		/*Scanner sc = Scanner(System.in);
		int a = sc.nextInt();

		Scanner sc = Scanner(System.in);
		int a = sc.nextInt();*/
		System.out.println(product(0,10));
	}
}
