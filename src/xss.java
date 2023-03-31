public class xss {


	public static void main(String[] args) {
//		String tag = "<script>alert('Itamar')</script>";
//		String tag = "<a href='https://google.com.br'>Valide seu login</a> mais alguma coisa";
		String tag = "</SCRiPT/><DETAILs/+/onpoINTERenTEr%0a=%0aa=prompt,a()//";
		
		if (tag.charAt(0) == '<' || tag.contains("<") || tag.charAt(tag.length() - 1) == '>' || tag.contains(">")) {
			System.out.println("");
			return;
		}
		
//		if (tag.charAt(0) == '<' 
//				|| tag.contains("<") 
//				|| tag.contains("</") 
//				|| tag.contains(">")
//				|| tag.charAt(tag.length() - 1) == '>') 
//		{	
//			System.out.println(tag);
//			
//			return;
//		}
//		
		

		System.out.println(tag);
	}
}
