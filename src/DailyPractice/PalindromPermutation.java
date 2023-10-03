package DailyPractice;

import java.util.HashMap;

public class PalindromPermutation {
	
	//permutation
	//length should be samE
	//contains same char
	
	//palindrome
	//case1= LENGTH==ODD && 1 NON PAIR -->TRUE
	//CASE2 = LENGTH ==EVEN && 0 NON PAIR -->TRUE
	public static void main(String[] args) {
		
		
		
		
		String input = "Tac t Coaa";
		
		boolean result = isPermutationOfPalindrome(input);
		 if (result) {
	            System.out.println("palindrome & permutation");
	        } else {
	            System.out.println("not palindrome & permutation ");
	        }
		  
		
	}
	
	public static boolean isPermutationOfPalindrome(String str) {
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        str = str.replaceAll("\\s+", "").toLowerCase();



   
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        // Count characters with odd frequencies
        int oddCount = 0;
        for (int count : charFrequency.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false; // More than one character with odd frequency
            }
        }

        return true;

	}}
