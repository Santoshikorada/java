package santhunewproject;

public class BankingApplication {
	int id;
	String name;
	int bankbalance=2000;
	
	BankingApplication (int id,String name){
			this.id=id;
		this.name=name;
	}	
		void accinfo() {
			System.out.println("customer.id:"+" " + id);
			System.out.println("customer.name:"+ " " +name);
			System.out.println("customer.accbalance:"+ " " + bankbalance);
			
		}
		void accwth( int amtwth) {
			bankbalance=bankbalance-amtwth;
			System.out.println("After withdrwal: "+bankbalance);
		}
		void accdpt(int amtdpt) {
			bankbalance=bankbalance+amtdpt;
			System.out.println("After deposite: "+bankbalance);
		}
		void accdet() {
			System.out.println("customer.id:"+" " + id);
			System.out.println("customer.name:"+ " " +name);
			System.out.println("customer.accbalance:"+ " " + bankbalance);
			
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingApplication obj=new BankingApplication(531,"Chinni");
		obj.accinfo();
		obj.accwth(500);
		obj.accdpt(900);
		obj.accdet();
		
	}

}
