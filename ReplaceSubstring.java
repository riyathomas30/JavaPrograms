
public class ReplaceSubstring {

	public static void main(String[] args) {
	
		 String string1 = "The quick brown fox jumps over the lazy fox.";
		 String string2 = "cat";
		 String result= string1.replaceAll("fox",string2);
		 System.out.println(result);
	}

}
