package DailyPractice;

import java.util.Arrays;

//Check Permutation: Given two strings, write a method to decide if one is a permutation of the 
//other
public class CheckPermutation {
	
	//length should be sam 
	//contains same char
	
	public static boolean checkPermutation(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char[] newstr1 = str1.toCharArray();
		char[] newstr2 = str2.toCharArray();
		
		Arrays.sort(newstr1);
		Arrays.sort(newstr2);
		
		return Arrays.equals(newstr1, newstr2);
		
	}
	public static void main(String[] args) {
		
		String str1= "abhi";
		String str2 = "ibhaa";
		
		if(checkPermutation(str1, str2)) {
			System.out.println("permutation of earch other");
		}else {
			System.out.println("not permutation");
		}
		
		
	}

}
