package DailyPractice;


/*
 * String Rotation; Assume you have a method isSubs t rin g which checks if one word is a substring 
of another. Given two strings, si and s2, write code to check if s2 is a rotation of si using only one 
call to isSubs t rin g [e.g., "wate r bottle " is a rotation oP'erbottlewat"),*/
public class StringRotation {
	
	public static boolean isSubstring(String s1, String s2) {
		if(s1.length()==s2.length()) {
			String newstring = s1+s2;
			if(newstring.contains(s2)) {
				return true;
				
			}else
				return false;
		}
		else 
			return false;
		
	}
	
	
	public static void main(String[] args) {
		
		String s1= "water";
		String s2 = "aterw";
		
		boolean result=isSubstring(s1,s2);
		System.out.println(result);
		
		
		
	}

}
