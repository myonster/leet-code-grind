class FirstOccurence {


	public int strStr(String haystack, String needle) {
		// haystack = "hihello" length => 7
		// needle = "hello" length => 5

		byte [] haystackArr = haystack.getBytes();
		byte [] needleArr = needle.getBytes(); 

		// for loop running from 0, 1 , 2 ( three times)
		// running n times => number of items in the haystack
		for (int i = 0; i <= haystackArr.length - needleArr.length; i++) {

			// running m times => number of items in the needle
			for (int j = 0; j < needleArr.length; j++) {
				if (needleArr[j] != haystackArr[i + j]) {
					break;
				}

				if (j == needleArr.length - 1 && needleArr[j] == haystackArr[i + j]) {
					return i;
				}
			}
			
		}

		// total O(n^2) ?
		return -1;
	}
	
	//Given answer is more straightforward; its still O(m*n) though

	public int solution(String haystack, String needle) {
		return haystack.indexOf(needle);
	}
}
