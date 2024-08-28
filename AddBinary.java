class AddBinary {
	public String addBinary(String a, String b) {

		int length = a.length() > b.length() ? a.length() : b.length();
		StringBuilder sbA = new StringBuilder(a);
		StringBuilder sbB = new StringBuilder(b);
		StringBuilder result = new StringBuilder();

		sbA.reverse().setLength(length);
		sbB.reverse().setLength(length);

		byte [] arrA = sbA.toString().getBytes();
		byte [] arrB = sbB.toString().getBytes();

		boolean carryOver = false;

		for (int i = 0; i < length; i++) {
			int sum = 0;
			if (arrA[i] == 49) {
				sum++;
			}

			if (arrB[i] == 49) {
				sum++;
			}

			if (carryOver) {
				sum++;
			}

			switch(sum) {
				case(0) :
					result.append("0");
					carryOver = false;
					break;
			
				case(1) :
					result.append("1");
					carryOver = false;
					break;
				case(2) :
					result.append("0");
					carryOver = true;
					break;
				case(3) :
					result.append("1");
					carryOver = true;
					break;
			}
			
		}

		if (carryOver) {
			result.append("1");
		}		

		return result.reverse().toString();
	}
}
