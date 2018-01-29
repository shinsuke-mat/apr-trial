package jp.ac.osakau.apr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Pig4Test {

	@Test
	public void test01() {
		assertEquals(12, new Pig4().gcd(48, 36));
	}
	@Test
	public void test02() {
		assertEquals(12, new Pig4().gcd(36, 48));
	}
	@Test
	public void test03() {
		assertEquals(1, new Pig4().gcd(7, 3));
	}
	@Test
	public void test04() {
		assertEquals(7, new Pig4().gcd(7, 7));
	}
	@Test
	public void test05() {
		assertEquals(0, new Pig4().gcd(0, 7));
	}
	@Test
	public void test06() {
		assertEquals(0, new Pig4().gcd(0, 0));
	}
}
