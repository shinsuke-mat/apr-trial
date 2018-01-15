package jp.ac.osakau.apr;

public class Calculator {
	
	public static void main (String args[]) {
		Calculator c = new Calculator();
		System.out.println(c.fact(10));
	}
	
	// buggy method
	public int fact(int n) {
		//if (n == 1) return 1; // a bug here
		if (n == 0) return 0;
		return n * fact(n - 1);
	}
	
	// method expected to be reused (but fake)
	public int reuse_me_fake(int n) {
		if (n == 0) return 0;
		return 1;
	}
	
	// method expected to be reused (true)
	public int reuse_me_true(int n) {
		if (n <= 1) return 1;
		return 1;
	}
}
