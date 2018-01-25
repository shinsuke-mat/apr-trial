package jp.ac.osakau.apr;

public class RepairMe {

	public int countPrimes(int n) {
		int s = 0;
		for (int i = 2; i < n; i++) { // bug here. "<" ではなく "<=" であるべき  
			if (isPrime(i)) {
				s++;
			}
		}
		return s;
	}

	private boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	////////////////////////////////////////////////////////////////////////////////
	// method expected to be reused (but fake)
	public int reuse_me_fake(int n) {
		for (int i = 0; i <= n; i++) {
			;
		}
		return 0;
	}

	// method expected to be reused (true)
	public int reuse_me_true(int n) {
		for (int i = 2; i <= n; i++) {
			;
		}
		return 0;
	}
}
