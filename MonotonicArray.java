class MonotonicArray {
	public boolean isMonotonic(int [] nums) {
		if (nums.length == 1) {
			return true;
		}

		boolean presenceOfDirection = false;
		boolean increasing = false;
		if (nums[0] - nums[1] > 0) {
			increasing = false;
			presenceOfDirection = true;
		}

		if (nums[0] - nums[1] < 0) {
			increasing = true;
			presenceOfDirection = true;
		}
		
		// (1, 1, 2, )
		for (int i = 0; i < nums.length - 1; i++) {
			if (presenceOfDirection) {
				if (nums[i] - nums[i + 1] > 0 && increasing) {
					return false;
				}

				if (nums[i] - nums[i + 1] < 0 && !increasing) {
					return false;
				}
			} else {
				if (nums[i] - nums[i + 1] > 0) {
					increasing = false;
					presenceOfDirection = true;		
				}

				if (nums[i] - nums[i + 1] < 0) {
					increasing = true;
					presenceOfDirection = true;
				}
			}
		}

		return true;
	}
}
