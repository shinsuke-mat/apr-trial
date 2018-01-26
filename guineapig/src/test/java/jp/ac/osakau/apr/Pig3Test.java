package jp.ac.osakau.apr;

import org.junit.Test;
import static org.junit.Assert.*;
public class Pig3Test {
	@Test
	public void test01() {
		assertEquals(9, new Pig3().close_to_zero(10));
	}
	@Test
	public void test02() {
		assertEquals(99, new Pig3().close_to_zero(100));
	}
	@Test
	public void test03() {
		assertEquals(0, new Pig3().close_to_zero(0)); // failed: 0 to be 0
	}
	@Test
	public void test04() {
		assertEquals(-9, new Pig3().close_to_zero(-10));
	}
}
