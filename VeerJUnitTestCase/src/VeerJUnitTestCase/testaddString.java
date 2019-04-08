package VeerJUnitTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddString {

	@Test
	void test() {
		jUnitTesting teststr=new jUnitTesting();
		String result=teststr.addStrings("Krishna", "Veer");
		assertEquals("KrishnaVeer", result);
	}

}
