package testquestions;
import java.util.*;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,6,8,3,0,8,2,4};
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i] + " " + "duplicate");
				}
			}
		}

	}

}
