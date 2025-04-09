package santhunewproject;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	System.out.println("Hello World");
	int sum = 0;
	for(int i = 1; i<=5; i++)
	{
		sum=sum +i;
	}
	System.out.println(sum);
	int no = 20;
	if(no > 1 && no <10)
	{
		System.out.println("no is within the range");
	}
	else
	{
		System.out.println("no is not within the range");
	}
	if(no % 2 == 0)
	{
		System.out.println("number is even");

	}
	else
	{
		System.out.println("number is odd");
	}
	System.out.println("Enter Name: ");
	String name = sc.next();
	
	
	System.out.println("Enter Age: ");
	int Age = sc.nextInt();
	
	
	System.out.println("Enter Salary: ");
	Float Salary = sc.nextFloat();
	
	
	System.out.println("Enter Character: ");
	char C = sc.next().charAt(0);
	}
}


