class MergeStrings {
	public String merge(String word1, String word2){
		final int lengthOne = word1.length();
		final int lengthTwo = word2.length();
		int num = lengthOne < lengthTwo ? lengthOne : lengthTwo;

		StringBuilder sb = new StringBuilder(lengthOne + lengthTwo);

		for (int i = 0; i <= num; i++) {
			String [] arr1 = word1.split("", lengthTwo + 1);
			String [] arr2 = word2.split("", lengthOne + 1);
			
			sb.append(arr1[i]).append(arr2[i]);
			
		}

		return sb.toString();
	}
}
