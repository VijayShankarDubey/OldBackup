package javaTutorial;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());

		
	}

}
