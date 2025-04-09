package santhunewproject;

public class patientEncapsulation {
	private int pno;
	private String pname;
	
	public void setno(int pno) {
		this.pno=pno;
	}
	public int getno() {
		return pno;
	}
	public void setname(String pname) {
		this.pname  =pname;
	}
	public String getname() {
		return pname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 patientEncapsulation obj=new  patientEncapsulation();
		 obj.setno(33);
		 obj.setname("leena");
		 System.out.println(obj.getno() + " " + obj.getname());
	}

}
