package Tu4.kangyuyang;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalc {
	Calc c = new Calc();
	int a=8;
	int b=3;
	int result;
	@BeforeEach
	void setUp() throws Exception {
		result = a + b;
		
	}

	@Test
	void test() {
		
		assertTrue(c.add(a, b)==result);
	}
	@Test
	void test2() {
		assertTrue(c.substract(a, b)==5);
	}

}
