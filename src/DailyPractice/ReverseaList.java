package DailyPractice;

import java.util.ArrayList;
import java.util.List;
//Write a method that reverses the elements of a given list.
public class ReverseaList {
	public static void main(String[] args) {
		List<Integer> emptylist = new ArrayList<>();
		
		List< Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		for(int i = list1.size()-1 ; i>=0;i--) {
			int item=list1.get(i);
			emptylist.add(item);

			
		}
		System.out.println(emptylist);

	}

}
