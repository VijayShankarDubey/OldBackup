package javaTutorial;

//Interface
public class IndiaTraffic implements centralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		centralTraffic it = new IndiaTraffic();
		it.redStop();
		it.goGree();
		it.waitYellow();

	}

	@Override
	public void goGree() {
		// TODO Auto-generated method stub
		System.out.println("GO");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("STOP");
	}

	@Override
	public void waitYellow() {
		// TODO Auto-generated method stub
		System.out.println("WAIT");
	}

}
