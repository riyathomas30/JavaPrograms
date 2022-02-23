
public class CheckWords {

	
	public static void main(String[] args) {
	
		String sentence="I am studying Java and Css";
//		String words[]=sentence.split("");
//		System.out.println(words.length);
//		for(int j=0;j<words.length;j++)
//		{
//			
//			System.out.print(words[j]+"\n");
//		}
		int count=1;
		for(int i=0;i<sentence.length();i++)
		{ 
			if((sentence.charAt(i) == ' ') &&(sentence.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
			
	}

}
