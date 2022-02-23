
public class CountCharacters {
	static  int ASCII_SIZE = 256;
	public static void main(String[] args) {
		String str="mathematics";
//		
//	        
//	        
		 int count[] = new int[ASCII_SIZE];
		  for(int i=0; i<str.length(); i++)
		  {
			  (count[str.charAt(i)])++; //increment the count of each character by using ASCII of character as key  
		  }
		  
		  int first = 0, second =0;
		  for(int i=0; i < ASCII_SIZE; i++)
		  {
		   
		    if(count[i] > count[first]) //
		    {
		      second = first;
		      first = i;
		    }
		   
		    else if(count[i] > count[second] && count[i] != count[first])
		    {
		      second = i;
		    }
		    
		  }
//		  for(int i=0; i<str.length(); i++)
//			  for(int j=0; i<ASCII_SIZE; j++)
//				 
//			  (count[str.charAt(i)])++; //increment the count of each character by using ASCII of character as key  
//		  }
//		  
		 
		   System.out.println("second most frequent character is "+ (char)second);  	  
		   System.out.println(" most frequent character is "+ (char)first); 
		 
	}

}
