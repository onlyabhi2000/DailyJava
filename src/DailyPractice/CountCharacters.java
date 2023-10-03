package DailyPractice;

import java.util.HashMap;
import java.util.Map;

//Write a method that takes a string and returns a map with characters as keys and their counts as values.
public class CountCharacters {
	
	public static Map<Character, Integer> countChar(String str){
		Map<Character, Integer> map = new HashMap<>();
		
		char[] charArray=str.toCharArray();
		
		for( char newchar : charArray) {
			if(map.containsKey(newchar)) {
				map.put(newchar, map.get(newchar)+1);
			}
			else {
				map.put(newchar, 1);
			}
			
		}
		return map;
		
	}
	
	public static void main(String[] args) {
		String str= "abhishekSharma";
		
		  Map<Character, Integer> newcountChar=countChar(str);
		  
		  for(Map.Entry<Character, Integer> entry :newcountChar.entrySet()) {
			  
			  System.out.println(entry.getKey() +"-"+ entry.getValue());
			  
		  }
	}
	
	

}
