package abstract_test;

public class Child extends Ab_Test{
	
	@Override
	public void print() {
		System.out.println("I am Printing");
		
	}

	@Override
	public void Run() {
		System.out.println("I am Running");
		
	}

	public static void main(String[] args) {
		
		Child c = new Child ();
		c.print();
		c.Run();
		c.race();

	}
}
