package santhunewproject;
import java.util.*;
public class Arrays1dusingscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,7,4,0,5};	
		System.out.println(a.length);
	for( int i=0;i<a.length;i++)  {
		System.out.println(a[i] + " ");
		
	}
	System.out.println();
	for(int x:a) {
		System.out.print(x + " ");
	}
	System.out.println();
	Scanner sc=new Scanner(System.in);
			int b[]=new int [5];
			System.out.println("Enter no: ");
			for( int i=0;i<a.length;i++) {
				b[i]=sc.nextInt();
			}
			for(int y:b) {
				System.out.print(y + " ");
			}
	
	}

}
