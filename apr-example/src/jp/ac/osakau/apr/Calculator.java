package jp.ac.osakau.apr;

public class Calculator {
	public static void main(String args[]) {
		Calculator cal = new Calculator();
		System.out.println(cal.fact(3));
	}
	
	public int fact(int n) {
		if (n == 1) return 1;
		return n*fact(n-1);
	}
}
