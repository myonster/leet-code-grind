import java.util.Arrays;

class ArithmeticProgression {

    public boolean canMakeArithmeticProgression(int[] arr) {
		// sort the arr
		// traverse through
		Arrays.parallelSort(arr);
		int diff = Math.abs(arr[0] - arr[1]);
		
		
		for (int i = 0; i < arr.length - 1; i++) {
			int currentDiff = Math.abs(arr[i] - arr[i + 1]);
			if (currentDiff != diff) {
				return false;
			}

			diff = currentDiff;
		}
		
		return true;
    }

}
