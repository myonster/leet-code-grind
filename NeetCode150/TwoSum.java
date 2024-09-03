import java.util.HashMap;
import java.util.Arrays;

class TwoSum {
	public int [] twoSum(int [] nums, int target) {
		// Arrays.sort(nums);
		int [] arr = new int [2];
		int leftPointer = 0;
		int rightPointer = nums.length - 1;

		//Hash -> key is the number and value is the index
		HashMap<Integer, Integer> indexMap = new HashMap<Integer,Integer>();

		for (int i = 0; i < nums.length; i++) {
			
			int complement = target - nums[i];

			if (indexMap.containsKey(complement)) {
				arr[0] = i;
				arr[1] = indexMap.get(complement);

				return arr; 
			} else {
				indexMap.put(nums[i], i);
			}
		}
		
		return	arr;
	}
}
