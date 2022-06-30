package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;
import static telran.numbers.TictactoeGame.*;

import org.junit.jupiter.api.Test;

import telran.numbers.TictactoeGame;

class Testtictactoe { 

	@Test
	void TictactoeGametest1() {
		char matrix1[][] = { { Z, E, X }, { X, Z, E }, { E, E, E } };
		assertEquals(1, TictactoeGame.tictactoeMove(matrix1, 2, 2, Z));
		assertEquals(0, TictactoeGame.tictactoeMove(matrix1, 2, 2, X));
	}

	@Test
	void TictactoeGametest2() {
		char matrix2[][] = { { X, Z, X }, { Z, Z, X }, { Z, X, E } };
		assertEquals(2, TictactoeGame.tictactoeMove(matrix2, 2, 2, Z));
	}

	@Test
	void TictactoeGametest3() {
		char matrix3[][] = { { Z, E, X }, { X, E, E }, { E, E, Z } };

		assertEquals(1, TictactoeGame.tictactoeMove(matrix3, 1, 1, Z));
	}
}