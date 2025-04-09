package testquestions;
import java.util.*;

public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		
		if(num%2!=0) {
			System.out.println("weird");
		}
		else if(num%2==0 && num>=2 && num<=5) { 
			System.out.println("not weird");
		}
		else if(num%2==0 && num>=20) { 
			System.out.println("not weird");
	}
		else if(num%2==0 && num>=6 && num<=20) { 
			System.out.println("invalid");
}
	}
}

