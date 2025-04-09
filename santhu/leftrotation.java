package santhunewproject;

public class leftrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		int temp=a[5];
		int i;
		
		/*for(i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[i]=temp;
		
		for(i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}*/
		
		int temp1=a[a.length-1];
		for(i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
			
		}
		a[i]=temp1;
		for(i=a.length;i>0;i-- ) {
			System.out.print(a[i] + " ");
		}
	}

}
