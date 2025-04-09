package santhunewproject;

public class constructorexample2 {
	int id;
	String name;
	int fees;
	
	 constructorexample2 (int id,String name){
		 
				 this.id=id;
		 this.name=name;
		 
	 }
	 constructorexample2 (int id,String name,int fees){
		 
		 this(id,name);
		 this.fees=fees;
	 }
	 
	 void display() {
		 System.out.println(id + " " + name + " " + fees);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorexample2 obj1=new constructorexample2(531,"chinni");
		obj1.display();
		constructorexample2 obj2=new constructorexample2(532,"chinnu",50000);
		obj2.display();
	}

}
