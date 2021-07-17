package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintServiceT;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintServiceT<String> ps = new PrintServiceT<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		String x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}
}
