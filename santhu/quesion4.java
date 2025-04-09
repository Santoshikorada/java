package testquestions;

import java.util.Arrays;

public class quesion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="RAMU";
		String s2="UMAR";
		
		char[] charArray1=s1.toCharArray();
		char[] charArray2=s2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1,charArray2)) {
			System.out.println(s1 + " and " + s2 + " anagram");
		}
		else {
			System.out.println(s1 + " and " +  s2 + " not anagram");
		}

	}

}
