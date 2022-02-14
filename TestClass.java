package JavaPackage;

public class TestClass {
public static void main(String[] args) {
		
	
	TestClass obj=new TestClass();
	System.out.println(obj.calculateAmount(5, 2));
		//System.out.println(calculateAmount(5,2));
		//System.out.println(calculateAmount(5,2,3));
	//System.out.println(checkEvenorOdd());
		//drawPattern();
		
	
		
	}
public  double calculateAmount(double a,double b)
{
	double amount=(a+b)/2;
	return amount;
	
}
public static double calculateAmount(double a,double b,double c)
{
	double amount=(a+b+c)/2;
	return amount;
	
}
	
	public static double calculateAmount()
	{
		int noOfPencil=2;
		int noOfPen=6;
		int noOBook=1;
		int priceofPen=10;
		int priceofPencil=5;
		int priceofBook=50;
		 double initialPrice=(noOfPencil * priceofPencil)+(noOfPen *priceofPen)+(noOBook*priceofBook);
		 double priceafterDiscount=initialPrice-(.1*initialPrice);
		 double totalAmount=priceafterDiscount+(.05*priceafterDiscount);
		// System.out.println("Amount payable by John"+totalAmount);
		 return totalAmount;
		
	}
public static String checkEvenorOdd()
{
	int number=173;
	if(number%2==0)
	{
		return " even";
	}
	else
	{
		return" odd";
	}
	
}
public static void drawPattern()
{
 

	    for (int i = 0; i <= 5; i++) {
	    	for(int j=0;j<i;j++)
	    	{
	      
	        System.out.print("* ");
	      }
		    System.out.print("\n");
	    }
	   

	   
	     
	
}
}
