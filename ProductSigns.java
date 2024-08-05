class ProductSigns {

	public int arraySign(int [] nums) {
		int negCount = 0;
		for(int i = 0; i < nums.length; i++) {
			int numb = nums[i];

			if (numb == 0) {
				return 0;
			}

			if (numb < 0) {
				negCount++;
			}
		}		

		if (negCount % 2 == 0) {
			return 1;
		} else {
			return -1;
		}
	}
}
