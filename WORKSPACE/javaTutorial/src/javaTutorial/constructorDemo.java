package javaTutorial;

public class constructorDemo {
	
	//will not return values
	//name of constructor should be the class name
	public constructorDemo() {
		System.out.println("I am a constructor");
	}
	// Parameterized constructor
	public constructorDemo(int a,int b) {
		System.out.println("I am in Parameterized Constructor");
		int c = a+b;
		System.out.println(c);
	}
	public constructorDemo(String str) {
		System.out.println(str);

	}
	public void method() {
		System.out.println("I am a method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorDemo cd =new constructorDemo();
		constructorDemo pc =new constructorDemo(4,5);
		constructorDemo st =new constructorDemo("hello");
		
//		compiler will call implicit constructor if you have not defined constructor
//		whenever you create an object constructor is called
//		block of code when ever an object is created 
		
	}

}
