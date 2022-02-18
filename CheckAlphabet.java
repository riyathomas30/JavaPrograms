import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
System.out.println("Enter alphabet");
char alphabet=sc.next().charAt(0);
if((alphabet>='a' && alphabet<='z') || (alphabet>='A' && alphabet<='Z'))
{
	switch(alphabet)
	{
	case 'a':
	case 'A':
	case 'e':
	case 'E':
	case 'i':
	case 'I':
	case 'o':
	case 'O':
	case 'u':
	case 'U':System.out.println("Entered alphabet if vowel");break;
	default:System.out.println("Entered character is a consonant");break;
	};
}
else
{
	System.out.println("Entered charcter is not an alphabet");
}

}
}