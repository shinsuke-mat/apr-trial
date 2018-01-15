package jp.ac.osakau.apr;

public class Calculator {
	
	public static void main (String args[]) {
		Calculator c = new Calculator();
		System.out.println(c.fact(10));
	}
	
	// buggy method
	public int fact(int n) {
		if (n == 1) return 1; // a bug here
		return n * fact(n - 1);
	}
	
	// method expected to be reused
	public int copyme(int n) {
		if (n == 0) return 0;
		return 1;
	}
}
