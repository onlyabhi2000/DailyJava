package DailyPractice;

import java.util.ArrayList;
import java.util.List;

// Write a program that takes in a list of integers and returns a new list containing all the duplicates.
public class DuplicateElementsFinder {
	public static List<Integer> dublicates(List<Integer> list){
		List<Integer> containsduplicates = new ArrayList<>();
		for(int i = 0 ; i<list.size()-1;i++) {
			for(int j= i+1;j<list.size();j++) {
				if (list.get(i).equals(list.get(j))) {
					if(!containsduplicates.contains(list.get(j))) {
						containsduplicates.add(list.get(i));
						}}}}
		return containsduplicates;
					
			}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		
		List<Integer> finalList=dublicates(list);
		
		System.out.println(finalList);
		

//					System.out.println(list.get(i));
				
				}
	
		
		

		
		
		
	}

