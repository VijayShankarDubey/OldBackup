package javaTutorial;

//one try can follow multiple catch blocks
//catch should be an immediate block after try
public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 7;
		int b = 0;

		try {
			int k = a / b;
			System.out.println(k);
		} catch (ArithmeticException ae) {
			System.out.println("I catch the Arithmetic Exception");
		} catch (IndexOutOfBoundsException io) {
			System.out.println("I catch the Index out of bound Exception");
		} catch (Exception e) { // general exception it will handle all kind of exception
			System.out.println("I catch the error/exception");
		}
		finally { //finally exception will execute at last even script fail or pass
			System.out.println("delete cookies");
		}

	}

}
