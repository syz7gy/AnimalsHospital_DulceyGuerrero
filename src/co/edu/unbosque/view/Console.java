package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {

public Scanner sc;
	
	public Console() {
		sc = new Scanner(System.in);
	}
	
	public int nextInt() {
		return sc.nextInt();
	}
	
	public long nextLong() {
		return sc.nextLong();
	}
	
	public float nextFloat() {
		return sc.nextFloat();
	}
	
	public double nextDouble() {
		return sc.nextDouble();
	}
	
	public boolean nextBoolean() {
		return sc.nextBoolean();
	}
	
	public String next() {
		return sc.next();
	}
	
	public String nextLine() {
		return sc.nextLine();
	}
	
	public void println(String message) {
		System.out.println(message);
	}
	
	public void print(String message) {
		System.out.print(message);
	}
}
