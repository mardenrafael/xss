public class Xss {


	public static void main(String[] args) {
		String tag = "</SCRiPT/><DETAILs/+/onpoINTERenTEr%0a=%0aa=prompt,a()//";
		
		
		
		if (tag.charAt(0) == '<' || tag.contains("<") || tag.charAt(tag.length() - 1) == '>' || tag.contains(">")) {
			System.out.println("");
			return;
		}
		
		System.out.println(tag);
	}
}
