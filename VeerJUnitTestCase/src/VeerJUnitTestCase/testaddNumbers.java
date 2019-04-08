package VeerJUnitTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddNumbers {

	@Test
	void test() {
		jUnitTesting testnum = new jUnitTesting();
		int result= testnum.addNumbers(10, 20);
		assertEquals(30,result);
	}

}
