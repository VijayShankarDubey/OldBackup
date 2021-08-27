package javaTutorial;

//super key word class
public class childDemo extends parentDemo{

	String name = "QA Click Academy";
	
	//constructor
	public childDemo() {
		super();
		System.out.println("child class constructor");
	}
	public void getStringData() {
		System.out.println(name);  //if we same variable priority will give local variable
		System.out.println(super.name); //super keyword used for calling parent class string 
	}

	//method
	public void getData() {
		super.getData(); //super keyword used for calling parent method 
		System.out.println("I'm child class"); //if we same method priority will give local variable
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childDemo cd = new childDemo();
		cd.getStringData();
		cd.getData();
	}

}
