import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String str1="Java";
		String str2=new String("Java");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to reverse:");
		String str=sc.next();
		int length=str.length();
		String revString="";
		for(int i=length-1;i>=0;i--)
		{
			revString+=str.charAt(i);
		}
		System.out.println("Reveresed string is "+revString);

	}

}
