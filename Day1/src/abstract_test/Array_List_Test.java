package abstract_test;
import java.util.*;

public class Array_List_Test {

	public static void main(String[] args) {

		
	ArrayList<String> cars = new ArrayList<String>();
	cars.add("bmw");
	cars.add("benz");
	cars.add("hyundai");
	System.out.println(cars);
	
//	String t =cars.get(0);
	//System.out.println(t);

	/*cars.set(0, "Audi");
	String u =cars.get(0);
	System.out.println(u);
	System.out.println(cars);
	cars.remove(2);
	System.out.println(cars);*/
	System.out.println(cars.size());
	
	for(String l :cars )
	{
		System.out.println(l);
	}
	cars.clear();
	System.out.println("Now: "+cars);
	}
}
