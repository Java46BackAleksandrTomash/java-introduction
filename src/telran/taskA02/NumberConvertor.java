package telran.taskA02;

public class NumberConvertor {

	public static String toBinaryStr(int number) {
		String res = new String();
		while (number > 0) {
			res = (number % 2) + res;
			number /= 2;

		}
		return res;
	}
}