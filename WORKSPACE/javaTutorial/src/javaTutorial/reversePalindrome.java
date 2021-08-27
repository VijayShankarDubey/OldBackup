package javaTutorial;

public class reversePalindrome {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "NITIN";
		String t = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {

			t = t + (s.charAt(i));
		}
		System.out.println(t);
		
		if (s.equals(t)) {
//			System.out.println(s);
//			System.out.println(t);
			System.out.println("String is Palindorme");
		} else {
			System.out.println("String is not Palindorme");
		}
}	
}


