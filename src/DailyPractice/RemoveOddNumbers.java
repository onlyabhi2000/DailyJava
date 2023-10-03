package DailyPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Create a method to remove all odd numbers from an input list.
public class RemoveOddNumbers {
	
	public static void removeoddnumbers (List<Integer> list) {
		Iterator< Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int x=itr.next();
			if(x%2 !=0) {
				itr.remove();
			}
		}
	}
	
	public static void main(String[] args) {
		List< Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		removeoddnumbers(list1);
		System.out.println(list1);
		


	}

}
