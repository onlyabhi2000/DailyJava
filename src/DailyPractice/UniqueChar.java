package DailyPractice;


//Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you 
//cannot use additional data structures? 
public class UniqueChar {
	
	public static boolean isUnique(String str) {
		
		 int length = str.length();

	        for (int i = 0; i < length - 1; i++) {
	            char currentChar = str.charAt(i);
	            for (int j = i + 1; j < length; j++) {
	                if (currentChar == str.charAt(j)) {
	                    return false; 
	                }
	            }
	        }
	        return true;
		
	}
	
	public static void main(String[] args) {
		String str = "abcdd";
		

		if (isUnique(str)) {
            System.out.println("unique char");
        } else {
            System.out.println("no unique char");
        }
		



	}
	}
