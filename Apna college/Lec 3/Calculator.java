import java.util.*;
class p1 
{
	public static void main(String[] args) 
	{
    Scanner sc = new Scanner(System.in);

	System.out.println("Enter first number");
	int a = sc.nextInt();

	System.out.println("Enter operator");
	char op = sc.next().charAt(0);

	System.out.println("Enter second number");
	int b = sc.nextInt();

	int res = 0;

    switch(op){
    case '+' : 
    res = a + b;
	System.out.println("The result of given expression is");
	System.out.println(res);
    break;

	case '-' : 
    res = a - b;
    System.out.println("The result of given expression is");
    System.out.println(res);
	break;

	case '*' : 
    res = a * b;
    System.out.println(res);
	break;

	case '/' : 
    res = a / b;
    System.out.println("The result of given expression is");
    System.out.println(res);
	break;

	case '%' : 
    res = a % b;
    System.out.println("The result of given expression is");
    System.out.println(res);
	break;

	default : 
	System.out.println("Invalid opertor");
	}
}
}
