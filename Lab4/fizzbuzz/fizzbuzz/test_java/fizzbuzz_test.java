import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class fizzbuzz_java {
	
	//verifie que fizzbuzz() done le meme resulta que fizzbuzz(1, 100)
	@Test
	void t1() {
		assertTrue(Arrays.equals(fizzbuzz.fizzbuzz(), fizzbuzz.fizzbuzz(1, 100)));
	}

	@Test
	void t2() {
		fizzbuzz what = new fizzbuzz();
		assertEquals(what.getClass(), new fizzbuzz().getClass());
	}
	
	//fizzbuzz(15, 15) est la meme que fizzbuzz(15), 15 % 5 et % 3 donne FizzBuzz
	@Test
	void t3() {
		assertEquals(fizzbuzz.fizzbuzz(15, 15)[0], "FizzBuzz");
	}
	
	//fizzbuzz(34) done le meme resulta que fizzbuzz(34, 34)
	@Test
	void t4() {
		assertEquals(fizzbuzz.fizzbuzz(34)[0], fizzbuzz.fizzbuzz(34, 34)[0]);
	}
	
	//echec puique fizzbuzz(3) = Fizz et fizzbuzz(5) = Bizz
	@Test
	void t5() {
		assertEquals(fizzbuzz.fizzbuzz(3)[0], fizzbuzz.fizzbuzz(5)[0]);
	}
	
	//echec puique fizzbuzz(3) != Bizz
	@Test
	void t6() {
		assertEquals(fizzbuzz.fizzbuzz(3)[0], "Buzz");
	}
	
	//echec puique fizzbuzz(5) != Fuzz
	@Test
	void t7() {
		assertEquals(fizzbuzz.fizzbuzz(5)[0], "Fizz");
	}
}