package ArraySorting;

import java.util.Scanner;

public class InsertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[]=new int[5] ;
		int array2[]=new int[6] ;
		 int value,position;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers for array..");
		for(int i=0;i<array1.length;i++)
		{
			array1[i]=sc.nextInt();
			
			
		}
		
		System.out.println("Enter value to insert");
		value=sc.nextInt();
		System.out.println("Enter index to insert");
		position=sc.nextInt();
	
		for(int i=0;i<array2.length;i++)
		{
			if (i <= position - 1)
                array2[i] = array1[i];
            else if (i == position)
            	array2[i] = value;
            else
            	array2[i]= array1[i - 1];
			System.out.println(array2[i]);
		}
			
	}
			
}
	


