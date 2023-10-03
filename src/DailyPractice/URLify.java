package DailyPractice;
/* 
 URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string 
has sufficient space at the end to hold the additional characters, and that you are given the "true" 
length of the string. (Note: If implementing in Java, please use a character array so that you can 
perform this operation in place.)*/

public class URLify {
	
//	  public static void replaceSpaces(String input)
//	  {
//	    String rep = "%20";
////	    char[] newchar = rep.toCharArray();
//	    
//	    for (int i = 0; i < input.length(); i++) {
//	      if (input.charAt(i) == ' ') {
//	        StringBuilder string
//	          = new StringBuilder(input);
//	        string.setCharAt(i, '2');
//	      }
//	    }
//	    System.out.println(input);
//		
//		
//	}
	
	public static void main(String[] args) {
//		replaceSpaces(input);
		String input = "Mr 3ohn Smit h ";

        input = input.trim();
        
         input = input.replaceAll("\\s", "%20");
         

        System.out.println(input);
		
		
		
	}

}
