package abstract_test;

import java.util.*;

public class Hash_Set_test {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("Jayes");
		set.add("Betcy");
		set.add("Angel");
		set.add("Abgy");
		System.out.println(set);
        boolean s =set.contains("Betcy");
        System.out.println(set.size());
        set.remove("Abgy");
        System.out.println(set);
        
        if(s)
        {
        	System.out.println("contains the name");
        }
        else
        {
        
        	System.out.println("No name");	
        }
        
        for(String f : set)
        {
        	System.out.println(f);	
        }
	}

}
