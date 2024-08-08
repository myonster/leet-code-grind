class CountOddNumbers {
	public int countOdds(int low, int high) {
		return low % 2 != 0 && high % 2 != 0  ? (high - low + 1) / 2 + 1: (high - low + 1) / 2;		
	}
}
