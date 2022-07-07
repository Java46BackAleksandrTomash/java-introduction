package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static telran.text.Strings.*;

class StringsClassTests {
	@Test
	void matchesTest() {
		assertEquals("match", matches("David", "david"));
		assertEquals("match", matches("John F", "John Fitzgerald"));
		assertEquals("no match", matches("John K", "John Fitzgerald"));
		assertEquals("match", matches("Anna Maria Magdalena", "Anna Magdalena"));
		assertEquals("match", matches("Anna Maria Magdalena", "Maria Magdalena"));
		assertEquals("no match", matches("Anna Maria Magdalena", "Anna Maria Roberta"));
		assertEquals("no match", matches("Anna Maria Magdalena", "Anna Magdalena Roberta"));
		assertEquals("no match", matches("Anna Maria Magdalena", "Anna Magdalena Maria"));
	}
//	@Test
//void matchesTest() {
//	String[][] data = {
//			{"David", "david", "match"},
//			{"John F", "John Fitzgerald","match"},
//			{"John K", "John Fitzgerald", " no match"},
//			{"Anna Maria Magdalena", "Anna Magdalena","match"},
//			{"Anna Maria Magdalena", "Maria Magdalena","match"},
//			{"Anna Maria Magdalena", "Anna Maria Roberta","no match"},
//			{"Anna Maria Magdalena", "Anna Magdalena Roberta","no match"},
//			{"Anna Maria Magdalena", "Anna Magdalena Maria","no match"}
//	};
//	for(int i = 0; i < data.length; i++) {
//		assertEquals(data[i][2], matches(data[i][0], data[i][1]));
//	}
	
	@Test
	void sortStringsAsNumbersTest() {
		String[] ar = {"9", "250", "50", "123", "23", "9", "123", "50"};
		String[] expected = {"9", "9", "23", "50", "50", "123", "123", "250"};
		assertArrayEquals(expected, sortStringsAsNumbers(ar));
	}
}
	