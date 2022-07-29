import java.util.*;
class p5 
{
	public static void vowel(char ch)
	{
	
	/*if (ch=='a' ||  ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	{
		System.out.println("It is a vowel");
	}
    else
		{
		System.out.println("It is a consonant");
		}
	}*/
	switch(ch)
		{
		case 'a':
		System.out.println("It is a vowel");
	    break;
		case 'e':
		System.out.println("It is a vowel");
	    break;
		case 'i':
		System.out.println("It is a vowel");
	    break;
		case 'o':
		System.out.println("It is a vowel");
	    break;
		case 'u':
		System.out.println("It is a vowel");
	    break;
		case 'A':
		System.out.println("It is a vowel");
	    break;
		case 'E':
		System.out.println("It is a vowel");
	    break;
		case 'I':
		System.out.println("It is a vowel");
	    break;
		case 'O':
		System.out.println("It is a vowel");
	    break;
		case 'U':
		System.out.println("It is a vowel");
	    break;
		default :
		System.out.println("It is a consonant");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		vowel(ch);
	}
}
