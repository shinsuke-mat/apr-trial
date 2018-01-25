package jp.ac.osakau.apr;

import org.junit.Test;
import static org.junit.Assert.*;
public class RepairMeTest {
	@Test
	public void test01() {
		RepairMe rm = new RepairMe();
		assertEquals(4, rm.countPrimes(10));
	}
	@Test
	public void test02() {
		RepairMe rm = new RepairMe();
		assertEquals(25, rm.countPrimes(99));
	}
	@Test
	public void test03() {
		RepairMe rm = new RepairMe();
		assertEquals(25, rm.countPrimes(100));
	}
	@Test
	public void test04() {
		RepairMe rm = new RepairMe();
		assertEquals(26, rm.countPrimes(101)); // failed test cos 101 is a prime number
	}
	@Test
	public void test05() {
		RepairMe rm = new RepairMe();
		assertEquals(0, rm.countPrimes(1));
	}
	@Test
	public void test06() {
		RepairMe rm = new RepairMe();
		assertEquals(0, rm.countPrimes(0));
	}
	@Test
	public void test07() {
		RepairMe rm = new RepairMe();
		assertEquals(0, rm.countPrimes(-1));
	}
	@Test
	public void test08() {
		RepairMe rm = new RepairMe();
		assertEquals(0, rm.countPrimes(-100));
	}
}
