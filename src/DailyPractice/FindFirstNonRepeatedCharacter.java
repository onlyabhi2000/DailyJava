package DailyPractice;

import java.util.HashMap;
import java.util.Map;

//Write a function to find the first non-repeated character in a string using a HashMap.
public class FindFirstNonRepeatedCharacter {
	public static char nonRepeating(String str) {
		Map<Character, Integer> map = new HashMap<>();
		 for (char c : str.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }
		 for (char c : str.toCharArray()) {
	            if (map.get(c) == 1) {
	                return c;
	            }
	        }
		 return '0';
	}
	
	
	public static void main(String[] args) {
		
		
		String input = "aabhishek";
		
		
		char result =nonRepeating(input);
		
		if(result !='0') {
			System.out.println(result);
		}else {
			System.out.println("no found");
		}
		
		
	}

}
