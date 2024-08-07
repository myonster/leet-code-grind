import java.util.List;
import java.util.ArrayList;

class SetMatrixZeroes {
	public int [][] setZeroes(int[][] matrix) {
		boolean [] index = new boolean [matrix[0].length];
		boolean [] rowIsZero = new boolean[matrix.length];

		for (int j = 0; j < matrix.length; j++) {
			//int [] rowCheck = matrix[j].clone();
			boolean haveZero = false;
			for (int i = 0; i < matrix[j].length; i++) {
				if (matrix[j][i] == 0) {
					//System.out.println("0 and not 0 from index");
					haveZero = true;
					index[i] = true;
				}

				// if (index[i] > 0) {
				// 	//System.out.println("index is 0, column affected!");
				// 	matrix[j][i] = 0;
				// }
			}

			if (haveZero) {
				rowIsZero[j] = true;
				matrix[j] = new int [matrix[j].length];
			}
		}

		for (int j = 0; j < matrix.length; j++) {
			if (!rowIsZero[j]) {
				for (int i = 0; i < matrix[j].length; i++) {
					if (index[i]) {
						matrix[j][i] = 0;
					}
				}
			}
		}
		
		return matrix;
	}
}
