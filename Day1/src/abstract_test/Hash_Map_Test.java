package abstract_test;

import java.util.*;

public class Hash_Map_Test {

	public static void main(String[] args) {

		HashMap<String, String> hash = new HashMap<String, String>();

		hash.put("Jayes", "Mathew");
		hash.put("Betcy", "Mathew");
		hash.put("Albin", "Paul");
		hash.put("Rojan", "boban");

		System.out.println(hash);

		System.out.println(hash.size());
		System.out.println(hash.get("Rojan"));
		hash.remove("Rojan");
		System.out.println(hash);
		for(String s : hash.keySet())
		{
			System.out.println(s);
		}
		
		for(String s : hash.values())
		{
			System.out.println(s);
		}

	}

}
