package javaTutorial;

public class stringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		string : It is one of the pre-built class in java
		1. String literal
		2. By creating object of string
		*/
		
		//String literal - suppose if we have same variable for 'B' it will not create new object 
		String a = "javatraning";
		String b = "javaclass";
		
//		By creating object of string - suppose if we have same variable for 'B' it will create new object 
		String c = new String("javatutorial");
		String d = new String("javademo");
		
		//Manipulation applying on string
		System.out.println(a.charAt(4));
		System.out.println(a.indexOf("t"));
		System.out.println(a.substring(3, 7));
		System.out.println(a.substring(4));
		System.out.println(a.concat(" is going on."));
		System.out.println(a.toUpperCase());
		System.out.println(a.length());
		System.out.println(a.replace("a", "-"));
		
		String arr[] = a.split("t"); //splitting character using array
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}

}
