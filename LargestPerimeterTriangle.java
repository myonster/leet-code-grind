import java.util.Arrays;

class LargestPerimeterTriangle {
	public int largestPerimeter(int [] nums) {
		// window slide
		// index 0 1 2
		// no need to compare 0 1 3 because if 0 1 2 cannot then cfm cannot
		//int max = 0;
		Arrays.sort(nums);
		
		for (int i = nums.length - 1; i >= 2; i --) {
			// i = 0, i = 1, i = 2
			// 1. sum of two sides must be larger
			// 2. difference between the sides must be lesser
			int value = nums[i - 1] + nums[i - 2];
			//max = value > nums[i] ? value + nums[i] : max; 
			if (value > nums[i]) {
				return value + nums[i];
			}
		}

		return 0;
	}
}
