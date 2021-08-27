package javaTutorial;

public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		
		a[0]=2;
		a[1]=1;
		a[2]=0;
		a[3]=7;
		a[4]=9;
		
		int b[] = {2,3,5,1,4,9};
		
		for(int i=0;i<a.length;i++) {
			System.out.println("array of a = "+a[i] );
		}

		for(int j=0;j<b.length;j++) {
			System.out.println("array of b = " + b[j]);
		}
	}

}
