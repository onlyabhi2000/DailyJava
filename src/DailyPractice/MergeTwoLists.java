package DailyPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Write a method that takes in two lists and returns a new list with elements from both lists, without any duplicates.
public class MergeTwoLists {
	
	public static void main(String[] args) {
		List< Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		
		List< Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(5);
		list2.add(5);
		
		Set<Integer> hs = new HashSet<>();
		hs.addAll(list1);
		hs.addAll(list2);
		
		System.out.println(hs);
		
		
		
	}
	
	

}
