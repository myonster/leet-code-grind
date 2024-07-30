class FindTheDifference {

	char find(String s, String t) {

		int [] arr = new int[26];
		int [] arr2 = new int[26];
		byte [] strArr = s.getBytes();
		byte [] newArr = t.getBytes();
		

		for(int i = 0; i < s.length(); i++) {
			arr[strArr[i] - 97] ++;
		}

		boolean status = true;

		for(int i = 0; i < t.length(); i++) {
			arr2[newArr[i] - 97] ++;

			if (arr2[newArr[i] - 97] > arr[newArr[i] - 97]) {
				return (char) newArr[i];
			}
		}

		return (char) 'a';
	}
}
