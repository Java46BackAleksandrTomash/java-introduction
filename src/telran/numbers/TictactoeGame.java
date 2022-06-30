package telran.numbers;

public class TictactoeGame {
	public static final char X = 'x';
	public static final char Z = '0';
	public static final char E = '1';

	public static int tictactoeMove(char matrix[][], int numRow, int numCol, char symb) {
		matrix[numRow][numCol] = symb;
		if (isRowWin(matrix, numRow) || isColWin(matrix, numCol) || isDiag1Win(matrix) || isDiag2Win(matrix)) {
			return 1;
		}
			if(isMatrixFull(matrix)) {
				return 2;
		}
		return 0;
	}
	
	static boolean isMatrixFull(char[][] matrix) {
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix.length; j++) {
				if (matrix[i][j] == E) {
					return false;
				}
			}
		}
		return true;
	}

	static boolean isDiag2Win(char[][] matrix) {
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[matrix.length - 1 - i][i] != matrix[matrix.length - i][i - 1]) {
				return false;
			}
		}
		return true;
	}

	static boolean isDiag1Win(char[][] matrix) {
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][i] != matrix[i - 1][i - 1]) {
				return false;
			}
		}
		return true;
	}

	static boolean isColWin(char[][] matrix, int numCol) {
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][numCol] != matrix[i - 1][numCol]) {
				return false;
			}
		}
		return true;
	}

	static boolean isRowWin(char[][] matrix, int numRow) {
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[numRow][i] != matrix[numRow][i - 1]) {
				return false;
			}
		}
		return true;
	}
}
