import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value1:");
		int number1=sc.nextInt();
		System.out.println("Enter the value2:");
		int number2=sc.nextInt();
		for(int i=number1+1;i<number2;i++)
		{
			int n=0;
			if(i==0||i==1)
			{
				
				continue;
			}
			for(int j=2;j<i;j++)
			{
				
				if(i%j==0)
				{
					n=1;
					break;
				}
			}
			if(n==0)
			{
			
			System.out.println(i);
			}
		}
	}
}


