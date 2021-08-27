package javaTutorial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//hashtable -pass table set collection
//hashMap and hashTable difference
//1. hashMap non synchronized  and not thread safe
//2. hashMap accept null value
public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "morning");
		hm.put(2, "afternoon");
		hm.put(3, "evening");
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(5));
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext()) {
//			System.out.println(it.next());
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
