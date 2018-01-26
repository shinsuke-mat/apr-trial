package jp.ac.osakau.apr;

import org.junit.Test;
import static org.junit.Assert.*;
public class Pig2Test {
	@Test
	public void test01() {
		assertEquals(4, new Pig2().countPrimes(10));
	}
	@Test
	public void test02() {
		assertEquals(25, new Pig2().countPrimes(99));
	}
	@Test
	public void test03() {
		assertEquals(25, new Pig2().countPrimes(100));
	}
	@Test
	public void test04() {
		assertEquals(26, new Pig2().countPrimes(101)); // failed: 101 is a prime number
	}
	@Test
	public void test05() {
		assertEquals(0, new Pig2().countPrimes(1));
	}
	@Test
	public void test06() {
		assertEquals(0, new Pig2().countPrimes(0));
	}
	@Test
	public void test07() {
		assertEquals(0, new Pig2().countPrimes(-1));
	}
	@Test
	public void test08() {
		assertEquals(0, new Pig2().countPrimes(-100));
	}
}
