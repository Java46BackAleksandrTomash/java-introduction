package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.text.Strings;

import static telran.text.Strings.*;

class StringsClassTests {

	@Test
	void validBracketsTest(){
		
		assertTrue(Strings.hasaValidBrackets("aaaaaa(sdfsdfdsf[dfd(f)f]zcvzxcv{{[ghjk]}}asd)"));
		assertFalse(Strings.hasaValidBrackets(")dfgswfgsf("));
		assertFalse(Strings.hasaValidBrackets("[werwert(wertwrtw] wertrtrt)"));
	}
}
	