import java.util.Scanner;

public class FactorialCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int number=sc.nextInt();
		int factorial=number;
		for(int i=number-1;i>1;i--)
		{
			factorial=factorial*i;
		}
		
		System.out.println("Factorial of "+number+"is "+factorial);	
		factorial=number;
		int j=number-1;
		while(j>1)
		{
			factorial=factorial*j;
			j--;
		}
		
		System.out.println("Factorial of "+number+"is "+factorial);	
	}

}
