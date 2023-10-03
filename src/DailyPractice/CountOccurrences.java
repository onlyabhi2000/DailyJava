package DailyPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Write a function that counts the occurrences of numbers in a list and stores the result in a HashMap.
public class CountOccurrences {
	
	static HashMap<Integer, Integer> countOccurance(List<Integer> inputlist){
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(Integer x : inputlist) {
			if(map.containsKey(x)) {
				map.put(x, map.get(x)+1);
				
			}else {
				map.put(x, 1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		List< Integer> inputlist = new ArrayList<>();
		inputlist.add(1);
		inputlist.add(2);
		inputlist.add(2);
		inputlist.add(3);
		inputlist.add(3);
		inputlist.add(3);
		
		 Map<Integer, Integer> newmap=countOccurance(inputlist);
		 
		 for(Integer num : newmap.keySet()) {
			 int count = newmap.get(num);
			 System.out.println(num + " -" + count);
		 }
		 
		
		
	}

}
