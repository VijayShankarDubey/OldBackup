package javaTutorial;

import java.util.ArrayList;

public class arrayList {
	//can accept duplicate values
	//ArrayList, LinkedList,vector - Implementing List interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("anu");
		a.add("anuj");
		a.add("abhi");
		System.out.println(a);
		a.add(0, "aki");
		System.out.println(a);
		System.out.println(a.get(2));
//		System.out.println(a.remove(1));
//		a.remove("anu");
		System.out.println(a.contains("abhi"));
		System.out.println(a);
		System.out.println(a.indexOf("aki"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}
