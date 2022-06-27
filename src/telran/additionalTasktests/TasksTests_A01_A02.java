package telran.additionalTasktests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.taskA01.MaxSubSubsequenceLength;
import telran.taskA02.NumberConvertor;

class TasksTests_A01_A02 {

	@Test
	void maxSubsequenceLength_1() {
		int[] arr = { 1, 3, 3, 2, 8, 8, 8, 5, 6, 6 };
		assertEquals(3, MaxSubSubsequenceLength.maxSubsequenceLength(arr));
	}
	
	@Test
	void maxSubsequenceLength_2() {
		int[] arr = { 1, 3, 3, -9, 2, 8, 8, 8, 5, 6, 6 };
		assertEquals(1, MaxSubSubsequenceLength.maxSubsequenceLength(arr));
	}

	@Test
	void maxSubsequenceLength_3() {
		int[] arr = { };
		assertEquals(0, MaxSubSubsequenceLength.maxSubsequenceLength(arr));
	}
	@Test
	void toBinaryStr_1() {
		int  num = 7;
		assertEquals(Integer.toBinaryString(num), NumberConvertor.toBinaryStr(num));
	}
	@Test
	void toBinaryStr_2() {
		int  num = 10;
		assertEquals(Integer.toBinaryString(num), NumberConvertor.toBinaryStr(num));
	}
	@Test
	void toBinaryStr_3() {
		int  num = 135;
		assertEquals(Integer.toBinaryString(num), NumberConvertor.toBinaryStr(num));
	}
}
