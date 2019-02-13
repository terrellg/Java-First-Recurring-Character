import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstRepeatingTest {
//TESTS FOR LINEAR
	@Test
	void test() {
		//no repeats
		FirstRepeating fr = new FirstRepeating();
		String s ="ab";
		String expected = null;
		String actual = fr.linear(s);
		assertTrue("Given the input "+s+" I expected, " +expected+" but instead got " +actual ,expected==actual);

	}
	@Test
	void test2() {
		//firstrepeating
		FirstRepeating fr = new FirstRepeating();
		String s ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890a";
		String expected = "a";
		String actual = fr.linear(s);
		assertTrue("Given the input "+s+" I expected, " +expected+" but instead got " +actual ,expected.equals(actual));

	}
	@Test
	void test3() {
		//emptystring
		FirstRepeating fr = new FirstRepeating();
		String s ="";
		String expected = null;
		String actual = fr.linear(s);
		assertTrue("Given the input "+s+" I expected, " +expected+" but instead got " +actual ,expected==actual);

	}
	@Test
	void test4() {
		//oneletter
		FirstRepeating fr = new FirstRepeating();
		String s ="z";
		String expected = null;
		String actual = fr.linear(s);
		assertTrue("Given the input "+s+" I expected, " +expected+" but instead got " +actual ,expected==actual);

	}
	//TESTS FOR EXPONENTIAL
	@Test
	void test5() {
		//no repeats
		FirstRepeating fr = new FirstRepeating();
		String s ="ab";
		String expected = null;
		String actual = fr.exponential(s);
		assertTrue("Given the input "+s+" I expected, " +expected+" but instead got " +actual ,expected==actual);

	}
	@Test
	void test6() {
		//firstrepeating
		FirstRepeating fr = new FirstRepeating();
		String s ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890a";
		String expected = "a";
		String actual = fr.exponential(s);
		assertTrue("Given the input "+s+" I expected, " +expected+" but instead got " +actual ,expected.equals(actual));

	}
	@Test
	void test7() {
		//emptystring
		FirstRepeating fr = new FirstRepeating();
		String s ="";
		String expected = null;
		String actual = fr.exponential(s);
		assertTrue("Given the input "+s+" I expected, " +expected+" but instead got " +actual ,expected==actual);

	}
	@Test
	void test8() {
		//oneletter
		FirstRepeating fr = new FirstRepeating();
		String s ="z";
		String expected = null;
		String actual = fr.exponential(s);
		assertTrue("Given the input "+s+" I expected, " +expected+" but instead got " +actual ,expected==actual);

	}
}
