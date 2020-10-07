package org.fatec;

import java.util.Scanner;

public class Leitor {
	
	private Scanner console;
	
	public Leitor() {
		console = new Scanner (System.in);
		
	}
	
	
	public String lerString (String label) {
		System.out.println(label);
		return console.nextLine();
		
	}
	
	public int lerInt(String label) {
		return Integer.parseInt(lerString(label));
	}
	 
}
