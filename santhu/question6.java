package testquestions;
import java.util.*;
public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks: ");
		int marks=sc.nextInt();
		if(marks>=80) {
			System.out.println(marks + " Grade A");
		}
		else { if(marks<80 && marks>=60) {
			System.out.println(marks + " "+ " Grade B");
		}
		else { if(marks==40) {
			System.out.println(marks + " " + " Grade C");
			
			
		}
		else { if(marks<40) {
			System.out.println(marks + " " + "Grade D");
		}

	}

}
}
	}
}

