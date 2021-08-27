package javaTutorial;

// inheritance
public class childAbstractClass  extends abstractClass{

//	-----
// in Java Multiple inheritance not allowed
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childAbstractClass ca = new childAbstractClass();
		ca.engine();
		ca.safetyGuideLined();
		ca.bodyColor();
		ca.audioSystem();
	}
//	childAbstractClass ca = new childAbstractClass();
	
	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red Color on the body");
	}
	public void audioSystem() {
		System.out.println("new audio code"); //function overriding - both have same method same name 
	}

}
 