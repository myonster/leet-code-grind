class MatrixDiagonalSum {
	public int diagonalSum(int[][] mat) {
		int sum = 0;
		int dim = mat.length;
		for (int i = 0; i < dim; i++) {
			int [] row = mat[i];

			if (i == dim - i -1) {
				sum += row[i];
			} else {
				sum += row[i] + row[dim - i - 1];	
			}
			
		}

		return sum;
	}
}
