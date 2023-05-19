package abstract_test;

public class test_interface implements Test_inter{
	
	public static void main(String[] args) {
		
		test_interface it = new test_interface ();
		it.benz();
		it.bmw();
		it.hyundai();
	}

	@Override
	public void benz() {
		System.out.println("i am benz");
	}

	@Override
	public void bmw() {
		System.out.println("i am bmw");
	}

	@Override
	public void hyundai() {
		System.out.println("i am hyundai");
	}

}
