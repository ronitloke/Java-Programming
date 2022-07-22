import java.util.*;
class p1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks of first subject");
		int a = sc.nextInt();

		System.out.println("Enter marks of second subject");
		int b = sc.nextInt();

		System.out.println("Enter marks of third subject");
		int c = sc.nextInt();

		System.out.println("Enter marks of four subject");
		int d = sc.nextInt();

		int M = 0;

			M = M + a + b + c + d;

		System.out.println("Total no.of marks");
		System.out.println(M);

		if (M<35)
		{
		   System.out.println("Fail");
;
		}
		else if (M>=35 && M<=50)
		{
		   System.out.println("Second class");
;
		}
		else if (M>50 && M<=60)
		{
		   System.out.println("First class");

		}
		else if (M>=80)
		{
		   System.out.println("Distinction");

		}
		else 
		{
		   System.out.println("Just pass");
		}
	}
}
