package abstract_test;

public class Construct {
	
	public Construct (String name , int Age)
	{
		System.out.println("This is my constructor "+name + " aged " + Age);
	}
	

	public static void main(String[] args) {
		
		
		Construct ct = new Construct ("Jayes",30);
		
	}

}
