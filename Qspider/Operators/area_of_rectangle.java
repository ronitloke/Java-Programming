import java.util.*;
class p5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length");
		int l = sc.nextInt();

		System.out.println("Enter the breadth");
		int b = sc.nextInt();

		double area = 0;

		area = l * b;

 		System.out.println("Area of rectangle is " + area);
	}
}
