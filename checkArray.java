package ArraySorting;
import java.util.Scanner;  
 

public class checkArray {
	
 
public  void sortArray()
{
	
	int numbers[]=new int[5] ;
	 int largest,smallest;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 numbers for array..");
	for(int i=0;i<5;i++)
	{
		numbers[i]=sc.nextInt();
		
	}
	largest=smallest=numbers[0];
	for(int i=1;i<5;i++)
	{
		if(numbers[i]>largest)
		largest=numbers[i];

		if(numbers[i]<smallest)
			smallest=numbers[i];
	}
	System.out.println("Largest number is "+largest);
	System.out.println("Smallest number is "+smallest);

}
}