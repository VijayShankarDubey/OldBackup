package javaTutorial;

public class minimumNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = { { 2, 3, 4 }, { 5, 6, 7 }, { 1, 9, 8 } };
		int min = abc[0][0];
		int mincol = 0;
//		int k = 0;
//		int max;
//		
//		System.out.println(a[2][1]);
//		int maxValue = num[0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
					mincol = j;
				}
//				System.out.println("Minmum = " + j);
			}
		}
		int max = abc[0][mincol];
		int k = 0;
		while (k < 3) {
			if (abc[k][mincol] > max) {
				max = abc[k][mincol];
			}
			k++;

		}
		System.out.println("Minimum = " + min);
		System.out.println("Maximum = " + max);
	}
}
