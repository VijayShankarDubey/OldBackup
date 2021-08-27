package javaTutorial;

public class staticVar {
	
	//Instance variable
	String name;
	String address;
	static String city ; //class variable
	static int i; // static keyword of independent objects
	static {
		city ="Banglore";
		 i =0;
	}
	
	//all static method not depend on object we can directly call them using class name 
	staticVar(String name, String address){
		this.name= name;
		this.address = address;
//		this.city= city;
		i++;
		System.out.println(i);
		
	}
	public void getAddress() {
		System.out.println(address + " "+ city);
		
	}
	//Default : access method anywhere only in package
	void abc() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticVar obj = new staticVar("Anu","Navalur");
		staticVar obj1 = new staticVar("Anuj","Marina");
		obj.getAddress();
		obj1.getAddress();

	}

}
