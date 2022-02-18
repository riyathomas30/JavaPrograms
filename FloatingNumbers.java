import java.util.Scanner;

public class FloatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float number1;
		float number2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 floating numbers");
		number1= sc.nextFloat();
		number2=sc.nextFloat();
		//System.out.println(Math.round(number1 - number2));
		if(number1>number2)
		{
			System.out.println("if");
				if ((number1 - number2) <= 0.01) { 
				     System.out.println("Numbers are matching"); 
				 } 
				 else { 
				     System.out.println("Numbers are not matching"); 
				 }
		}
		else
		{
			System.out.println("else");
			if ((number2 - number1) <= 0.01) { 
			     System.out.println("Numbers are matching"); 
			 } 
			 else { 
			     System.out.println("Numbers are not matching"); 
			 }
			
		}
		}}
		
