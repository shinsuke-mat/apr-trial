package jp.ac.osakau.apr;

public class Pig2 {

	// 与えられた整数以下の素数をカウントする
	// bug:
	//   n自体の素数がカウントされないので，nが素数のときに結果が-1になる
	// memo:
	//   Pig1と同様，期待外の謎修正が生まれるが，期待の初期変数変更はできない．
	//   初期値の設定エラーはFLが上手くいかない．
	//   しきい値0.5 -> 0.1でFL成功 & APR成功した
	public int countPrimes(int n) {
		int s = 0;
		int i = n; // int i = n + 1; これに差し替えれば直る
		// i++; あるいはこれを挿入する
		while (true) {
			if (--i < 2) {
				break;
			}
			if (isPrime(i)) {
				s++;
			}
		}
		return s;
	}

	private boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
		//for (int i = 2; i <= Math.sqrt(n); i++) {
			 // n--; // これでも直る．人の修正ではありえない．n/2
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	////////////////////////////////////////////////////////////////////////////////
	// method expected to be reused (but fake)
	public void reuse_me_fake(int n) {

	}

	// method expected to be reused (true)
	public void reuse_me_true(int n) {
		int i = n + 1;
		System.out.println(i);
	}
	// method expected to be reused (true)
	public void reuse_me_true2(int n) {
		n++;
	}
}
