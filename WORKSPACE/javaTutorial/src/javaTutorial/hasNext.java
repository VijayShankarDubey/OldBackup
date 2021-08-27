package javaTutorial;

import java.util.HashSet;
import java.util.Iterator;

public class hasNext {

	//HashSet treeset, LinkedHashset implements Set interface
	//does not accept duplicate values
	//There is no guarantee elements stored in sequential order or Random order
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("ashu");
		hs.add("aashi");
		hs.add("ajay");
		System.out.println(hs);
		hs.add("India");
		System.out.println(hs);
		hs.add("ajay");
		System.out.println(hs);
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
