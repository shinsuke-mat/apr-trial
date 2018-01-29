package jp.ac.osakau.apr;

public class Pig1 {

	public static void main(String args[]) {
		System.out.println(new Pig1().countPrimes(103));
	}
	// 与えられた整数以下の素数をカウントする
	// bug:
	//   n自体の素数がカウントされないので，nが素数のときに結果が-1になる
	// memo:
	//   期待していたforの修正は出てこない．ループまるごと書き換えは厳しい？
	//   一方で全く期待していないisPrime()関数内でのn--修正が生まれた．
	//   isPrime()自体はおかしい結果になるが，countPrimes()は正しくなる不思議．
	//   isPrime()のループ条件をMath.sqrt(n)としておくと上の謎修正は通らなくなる．
	public int countPrimes(int n) {
		int s = 0;
		for (int i = 2; i < n; i++) { // bug here. "<" ではなく "<=" であるべき
		//for (int i = 2; i <= n; i++) {
			boolean f = isPrime(i);
			if (f) {
				s++;
			}
		}
		return s;
	}

	private boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i <= n / 2; i++) {
		//for (int i = 2; i <= Math.sqrt(n); i++) {
			//n--;
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
