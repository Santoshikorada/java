package santhunewproject;
import java.util.*;
public class secondprogram {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		
		System.out.println("Enter weight:");
		int weight= sc.nextInt();
		if(age < 45 && weight < 65)
		{
			System.out.println("Eligible for physical test:");	
		}
		else {
			System.out.println("Not Eligible for physical test:");	
		}
		System.out.println("Enter char");
		char c=sc.next().charAt(0);
		if(c>='A' && c<='E') {
			System.out.println("Lies between  a and e");
		}
		else
		{
			System.out.println("Does not Lies between  a and e");	
		}
}

}
