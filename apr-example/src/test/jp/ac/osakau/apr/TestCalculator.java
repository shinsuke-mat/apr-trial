package jp.ac.osakau.apr;

import org.junit.Test;
import static org.junit.Assert.*;
public class TestCalculator {
	@Test
	public void test01() {
		Calculator c = new Calculator();
		assertEquals(3628800, c.fact(10));
	}
	@Test
	public void test02() {
		Calculator c = new Calculator();
		assertEquals(1, c.fact(1));
	}
	@Test
	public void test03() {
		Calculator c = new Calculator();
		assertEquals(0, c.fact(0));
	}
}
