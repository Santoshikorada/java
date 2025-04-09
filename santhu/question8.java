package testquestions;
import java.util.*;
public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Character: ");
		char c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("it is a vowel");
		}
		else {
			System.out.println("it is a consonant");
		}

	}

}
