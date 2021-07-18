package application;

import entities.Client;

public class Program {
	
	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c3 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria2@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		
		System.out.println(c1.equals(c2));
		System.out.println("C1 iqual a C3: " + c1.equals(c3));
		
		System.out.println("Compara alocação em memoria: " + (c1 == c3));
		
	}
}