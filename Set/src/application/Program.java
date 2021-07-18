package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("Tablet");
		set.add("TV");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
	
}