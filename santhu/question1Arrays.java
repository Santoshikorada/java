package testquestions;
import java.util.*;
public class question1Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int a[]= {2,43,66,92,3,5,13,123,432,44,78};
		 System.out.println("Enter any number:");
		 int x=sc.nextInt();
		 for(int i=0;i<=a.length-1;i++) {
			 if(a[i]>x)
	System.out.println(a[i]);
			
		}
	}
}

