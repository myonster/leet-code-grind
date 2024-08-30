class MultiplyStrings {
	public String multiply(String num1, String num2) {
		int [] arr = new int[num1.length() + num2.length()];
		byte [] num1Arr = num1.getBytes();
		byte [] num2Arr = num2.getBytes();
		
		for (int i = num1.length() - 1; i >= 0; i--) {
			int n = num1Arr[i] - 48;
			//System.out.println(num1Arr[i] - 48);
			int carryOver = 0;
			int traversal = num1.length() - i - 1;
			
			for(int j = num2.length() - 1; j >= 0; j--) {
				int multiplier = num2Arr[j] - 48;
				
				int result = n * multiplier + carryOver + arr[traversal];

				if (result >= 10) {
					carryOver = result / 10;
					result = result % 10;
				} else {
					carryOver = 0;
				}

				arr[traversal] = result;
				traversal++;

				if (j == 0) {
					arr[traversal] = carryOver;
				}
			}
			
		}

		boolean start = false;
		StringBuilder sb = new StringBuilder();
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] == 0 & !start) {
				continue;
			}
			sb.append(arr[i]);
			start = true;
		}

		if (sb.length() == 0) {
			return "0";
		}

		return sb.toString();
	}
}
