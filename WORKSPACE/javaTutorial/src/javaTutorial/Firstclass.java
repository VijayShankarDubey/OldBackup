package javaTutorial;

public class Firstclass {
	
	int a=5;
	
	public void getData() {  // method
		System.out.println("I'm a method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		creating object for calling method inside main method
		Firstclass fc= new Firstclass(); //syntax of creating object for a class
		secondClass sc = new secondClass();  // objected created for second java class
		
		fc.getData();   //calling method
		sc.setData();   // calling method from different java class
		System.out.println(fc.a);
		System.out.println("hello");
	}

}
