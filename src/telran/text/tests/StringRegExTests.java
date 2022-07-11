

package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;
import static telran.text.Strings.*;

import org.junit.jupiter.api.Test;

class StringRegExTests {

		@Test
		void isArithmeticExpressionTrue() {
			assertTrue(isArithmeticExpression("(123 + ((9)))"));
			assertTrue(isArithmeticExpression("(qwe + (1 * $_)) / _5"));
			assertTrue(isArithmeticExpression("((zB123/_R) + (1.086 * 0.9)) / $_"));
			assertTrue(isArithmeticExpression("123 + 9.81 * 12.0 / .19 - __"));
			
			
		}
		@Test
		void isArithmeticExpressionFalse() {
			assertFalse(isArithmeticExpression("123"));
			assertFalse(isArithmeticExpression("8 + 1."));
			assertFalse(isArithmeticExpression("8 / _"));
			assertFalse(isArithmeticExpression("- 8"));
			assertFalse(isArithmeticExpression("1 + -9"));
			assertFalse(isArithmeticExpression(""));
			assertFalse(isArithmeticExpression("ab + (1 * ) 9 / 2"));
			assertFalse(isArithmeticExpression("& -"));
			assertFalse(isArithmeticExpression("$ - _2 / &"));
			assertFalse(isArithmeticExpression("((ab + (1 * 9)) / 2"));
			assertFalse(isArithmeticExpression(")a + (1 * 9)) / __"));
			assertFalse(isArithmeticExpression("(a + (1 * 9))) / __"));
			
		}

}
