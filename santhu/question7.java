package testquestions;
import java.util.*;
public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Heigth: ");
		double Heigth=sc.nextDouble();
		
		System.out.println("Enter Weigth: ");
		int Weigth=sc.nextInt(); 
		
		if ( Heigth>=5.5 &&  Weigth>=55) {
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("not Eligible");
		}
	}

}
