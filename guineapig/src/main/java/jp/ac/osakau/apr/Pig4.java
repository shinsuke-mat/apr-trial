package jp.ac.osakau.apr;

public class Pig4 {

	// 最大公約数
	// bug:
	//   0を与えたときに無限ループ
	// memo:
	//   無限ループなのでAPRに適用しにくい
	public int gcd(int a, int b) {
		int n = 0;
		if (a == 0) {
			n = b;
		}
		while (b != 0) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		n = a;
		return n;
	}

	////////////////////////////////////////////////////////////////////////////////
	// method expected to be reused (but fake)
	public void reuse_me_fake(int n) {

	}

	// method expected to be reused (true)
	public void reuse_me_true(int n) {
		if (n > 0) {} else if (n == 0) { // このif文がif-elseの間に入ればOK
		}
	}

	// method expected to be reused (alternative)
	public int reuse_me_true2(int n) {
		if (n == 0) { // このif文がifの前か，if(n>0)の中に入ればOK
			return n;
		}
		return 0;
	}

	// method expected to be reused (alternative)
	public void reuse_me_true3(int n) {
		if (n == 0) { // このif文がelseの中に入ればOK
			n--;
		}
	}

	// method expected to be reused (alternative)
	public int reuse_me_true4(int n) {
		if (n == 0) {
			n++;
		}
		return 0;
	}
}
