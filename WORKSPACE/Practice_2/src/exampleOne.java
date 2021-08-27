import java.util.ArrayList;

public class exampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 3, 4, 5, 6, 7, 8, 9, 0, 1 };

		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
//			int k=0;
			if (a[i] % 2 == 0) {
				even.add(a[i]);
//				k++;
			} else {
				odd.add(a[i]);
//			k++;
			
			}
		}
		System.out.println("Even = " + even);
		System.out.println("Odd = " + odd);
	}

}
