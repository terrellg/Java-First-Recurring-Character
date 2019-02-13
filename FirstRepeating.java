import java.sql.Time;
import java.util.HashSet;

/*	Practice Google Coding Interview Question First Recurring Character
 * 			https://www.youtube.com/watch?v=GJdiM-muYqc&t=169s
 * 
 * 
 * Given a string find the first repeating letter
 * 
 * 
 * example: "ABACA" ==> A
 * 			"baab"  ==> a
 * 			"c"		==> null
 * 
 * 
 */


public class FirstRepeating {
	
/*
 * Implementation: From first position in string check if there is a match with next position
 * 					if it doesn't match, continue checking each index in the string.
 * 					If no match is found for first position move to the second position and repeat until match is found.
 * 					If no matches are found return null 
 * 	
 * 
 * 	
 * 					Worst Case:	n^2 comparisons O(n^2)
 * 					Best Case: 	n comparisons O(n^)
 * 	
 * 	
*/
	
public String exponential(String s) {
	String repeated="";
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		for(int j=i+1;j<s.length();j++) {
		char c2 = s.charAt(j);
			if(c==c2) {
				repeated=repeated+c;
				System.out.println(repeated);
				return repeated;
			}
		}
	}
	System.out.println("null");
	return null;
}

/*
 * Using a hashset we go through the string and add each char we see to the hashset
 * Check if the char is already in the set
 * 	if it isnt add it to the hashset
 * 	if it is already in the hashset return char
 * 
 * 
 * 
 * Worst Case: n comparisons O(n)
 * Best Case: 1 comparison O(1)
 * 
 */



public String linear(String s) {
HashSet hs = new HashSet();
String repeated ="";
for(int i=0;i<s.length();i++) {
	char c = s.charAt(i);
	if(!hs.isEmpty() && hs.contains(c)) {
		repeated=repeated+c;
		System.out.println(repeated);
		return repeated;
	}
	else {
		hs.add(c);

	}


}
System.out.println("null");
return null;

}



public static void main(String[] args) {
	FirstRepeating fr = new FirstRepeating();
//	long startTime = System.nanoTime();
	fr.exponential("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890z");
//	long duration = System.nanoTime()-startTime;
	
//	long startTime2 = System.nanoTime();
	fr.linear("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890z");
//	long duration2 = System.nanoTime()-startTime2;
//	System.out.println(duration);
//	System.out.println(duration2);
}
}
