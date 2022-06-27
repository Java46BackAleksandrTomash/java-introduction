package telran.taskA01;



public class MaxSubSubsequenceLength {

	public static int maxSubsequenceLength(int[] arr) {

		int temp = 0, count = 0, res = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (temp == arr[i])
				count++;
			else {
				res = Math.max(0, res);
				temp = arr[i];
				count = 1;
			}
		
		}
		return res;
	}
}