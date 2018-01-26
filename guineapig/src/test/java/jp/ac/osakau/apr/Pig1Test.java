package jp.ac.osakau.apr;

import org.junit.Test;
import static org.junit.Assert.*;
public class Pig1Test {
	@Test
	public void test01() {
		assertEquals(4, new Pig1().countPrimes(10));
	}
	@Test
	public void test02() {
		assertEquals(25, new Pig1().countPrimes(99));
	}
	@Test
	public void test03() {
		assertEquals(25, new Pig1().countPrimes(100));
	}
	@Test
	public void test04() {
		assertEquals(26, new Pig1().countPrimes(101)); // failed: 101 is a prime number
	}
	@Test
	public void test09() {
		assertEquals(26, new Pig1().countPrimes(102)); // failed: 101 is a prime number
	}
	@Test
	public void test05() {
		assertEquals(0, new Pig1().countPrimes(1));
	}
	@Test
	public void test06() {
		assertEquals(0, new Pig1().countPrimes(0));
	}
	@Test
	public void test07() {
		assertEquals(0, new Pig1().countPrimes(-1));
	}
	@Test
	public void test08() {
		assertEquals(0, new Pig1().countPrimes(-100));
	}
}
