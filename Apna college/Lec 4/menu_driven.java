import java.util.*;
class p3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int input;

		do
		{
		int M = sc.nextInt();
		if (M>=90 && M<=100)
		{
		System.out.println("This is Good");
		}
		else if (M>=60 && M<=89)
		{
		System.out.println("This is also Good");
		}
		else if (M>=0 && M<=59)
		{
		System.out.println("This is Good as well");
		}
		else
		{
		System.out.println("Invalid");
		}

		System.out.println("want to continue ? (yes(1) or no(0))");
		input = sc.nextInt();
		}
		while (input==1);

	}
}
