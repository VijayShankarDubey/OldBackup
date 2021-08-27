import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Chapter_17 {

	// Install TestNG from Help -> MarketPlace
	// If getting error while running. Add in your library (Getting TestNG 7.3.0
	// transitive vulnerability CVE-2020-11022 and CVE-2020-11023 due to JQuery
	// 3.4.1)
//public void regular() {
//	ArrayList<String> names = new ArrayList<String>();
//	names.add("abd");
//	names.add("sad");
//	names.add("asw");
//	int count=0;
//	
//	for(int i=0;i<names.size();i++) {
//		
//		String Actual = names.get(i);
//		if(Actual.startsWith("b")) {
//			count++;
//		}
//	}
//	System.out.println(count);
//}

	/*	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Holly");
		names.add("Bolly");
		names.add("Jolly");
		names.add("Hari");
		names.add("Hippo");
//	
//	long C=names.stream().filter(s ->s.startsWith("H")).count();
//	System.out.println(C);
		long d = Stream.of("Abhishek", "Ankit", "Naveen", "Rakesh", "Sonu").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
//	names.stream().filter(s ->s.length()>3).forEach(s ->System.out.println(s));
		names.stream().filter(s -> s.length() > 3).limit(1).forEach(s -> System.out.println(s));

	}

	public void streamMap() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Holly");
		names.add("Bolly");
		names.add("Jolly");
		names.add("Hari");
		names.add("Hippo");

		// print names which contains first letter A
		Stream.of("Aniket", "Ankit", "Naveen", "Rakesh", "Sonu").filter(s -> s.contains("A")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// Print names which have first letter as A with upper case and sorted
		List<String> names1 = Arrays.asList("Aniket", "Ankit", "Naveen", "Rakesh", "Sonu");
		names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// Print both the arrays list names and mames1
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
//		newStream.sorted().forEach(s -> System.out.println(s));
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Naveen"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	} */

	public void streamCollect() {
		List<String> ls = Stream.of("Aniket", "Ankit", "Naveen", "Rakesh", "Sonu").filter(s -> s.endsWith("n"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> values=Arrays.asList(3,2,4,2,5,3,7,9,4);
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}
}
