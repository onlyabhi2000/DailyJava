package DailyPractice;

import java.util.ArrayList;
import java.util.List;

//Write a method that takes two lists and returns a list of common elements.
public class FindCommonElements {
	
	public static List<Integer> commonElements(List<Integer> list1 , List<Integer> list2){
		List<Integer> newlist = new ArrayList<>();
		
		for(Integer x : list1) {
			if(list2.contains(x)) {
				newlist.add(x);
			}
		}
		return newlist;
	}
	
	public static void main(String[] args) {

		List< Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(3);
		
		List< Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(5);
		list2.add(5);
		
		List<Integer> finalList=commonElements(list1, list2);
		
		System.out.println(finalList);
//		
//		list1.retainAll(list2);
//		System.out.println(list1);
	}

}
