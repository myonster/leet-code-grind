class MoveZeroes {

	public int [] moveZeroes(int [] nums) {
		
		for(int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 0) {
				//swap
				for (int j = i + 1; j < nums.length; j ++) {
					if (nums[j] != 0) {
						int placeholder = nums[j];
						nums[j] = nums[i];
						nums[i] = placeholder;
						break; 
					}
				}
			} 
		}

		return nums;
		
	}
	
}
