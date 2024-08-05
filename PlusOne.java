class PlusOne {
	public int[] plusOne(int[] digits) {
		//[1,2,3,5,9]
		// [1,2,3,5,10]
		
		for(int i = digits.length - 1; i >= 0; i--) {
			int numb = digits[i];
			//System.out.println("travese");
			if (numb == 9 && i != 0) {
				digits[i] = 0;
			
			} else {
				digits[i] = digits[i] + 1;
				break;
			}

		}

		if (digits[0] == 10) {
			int [] arr = new int [digits.length + 1];
			arr[0] = 1;
			return arr;
		}

		return digits;
	}
}
