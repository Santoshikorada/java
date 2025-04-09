package testquestions;
import java.util.*;
public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int no1=sc.nextInt();
		System.out.println("Enter second number: ");
		int no2=sc.nextInt();
		System.out.println("Enter one operator: ");
		char operator=sc.next().charAt(0);
		double result;
		switch(operator) {
		case '+':
			result=no1+no2;
			System.out.println("result: "+ result);
			break;
			
		case '-':
			result=no1-no2;
			System.out.println("result: "+ result);
			break;  
			
		case '*':
			result=no1*no2;
			System.out.println("result: "+ result);
			break;
			
		case '/':
			result=no1/no2;
			System.out.println("result: "+ result);
			break;
		}

	}


	
}
