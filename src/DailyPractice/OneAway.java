package DailyPractice;


/*One Away: There are three types of edits that can be performed on strings: insert a character, 
remove a character, or replace a character. Given two strings, write a function to check if they are 
one edit (or zero edits) away.*/
public class OneAway {
	public static void main(String[] args) {
		
		String s1= "abhi";
		String s2 = "abehi";
		
		 if(oneaway(s1, s2))
		        System.out.print("one step away");
		    else
		        System.out.print("No");
		}
		
	
	
	static boolean oneaway(String s1 , String s2) {
		
		int m = s1.length();
		int n = s2.length();
		
		if(Math.abs(m-n)>1 || s1.equals(s2)) 
			return false;
		
		
		int count =0;
		int i=0;
		int j=0;
		while(i<m && j<n) {
			if(s1.charAt(i)!=s2.charAt(j)) {
				if(count==1)
					return false;
				
				
				if(m>n)
					i++;
				else if (n>m) 
					j++;
				else {
					i++;
					j++;
				}
				
				count++;
					
				
			}
			 else // If current characters match
		        {
		            i++;
		            j++;
		        }
			
			
		}
		// If last character is extra
	    // in any string
	    if (i < m || j < n)
	        count++;
	    
	    return count==1;
	 
		
	}
	

}
