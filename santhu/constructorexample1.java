package santhunewproject;

public class constructorexample1 {
	int id;
	String Name;
	String City;
	
	constructorexample1(int id,String Name){
		this.id=id;
		this.Name=Name;
	}
	constructorexample1(int id,String Name,String City){
		this(id,Name);
		this.City=City;
		
	}
	void display() {
		System.out.println(id +" "+ Name +" " + City);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorexample1  obj1=new constructorexample1(33,"chinnu");
		obj1.display();
		constructorexample1  obj2=new constructorexample1(33,"chinnu","vizag");
		obj2.display();

	}

}
