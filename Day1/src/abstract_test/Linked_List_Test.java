package abstract_test;

import java.util.*;

public class Linked_List_Test {

	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Jayes");
		ls.add("Betcy");
		ls.add("Home");
		ls.add("New");

		System.out.println(ls);
		for (String each : ls) {
			System.out.println(each);
		}
		System.out.println(ls.size());
		ls.remove(3);
		System.out.println(ls);
		ls.addFirst("Love");
		System.out.println(ls);
		ls.addLast("Love");
		System.out.println(ls);
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
	}
}
