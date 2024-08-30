class CalculatePower {
	public double myPow(double x, int n) {
        // all the edge cases...
		if ((double) Math.abs(x) == 1.0) {
			return n % 2 == 0 ? (double) Math.abs(x) : x;
		}

		if (x == 0) return 0;


		if (n == Integer.MAX_VALUE) {

			if (x < 1 && x > 0) return 0;
		}

		if (n == Integer.MIN_VALUE) {

			if (Math.abs(x) > 1) return 0;
		}

		// actual recursion
	
		if (n == 1) {
			return x;
		}

		if (n == -1) {
			return 1 / x;
		}
		
		if (n % 2 == 0) {
			return myPow(x, n / 2) * myPow(x, n / 2);	
		} else {
			return myPow(x, n / 2) * myPow(x, n - n/2);
		}
	}
}
