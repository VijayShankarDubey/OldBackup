package javaTutorial;

public class setThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 3;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j < i+1 ; j++) {
//				int f =(k*i);
				System.out.print(k*i + " ");
			}
			System.out.println(" ");	
		}
		k++;
	}

}
