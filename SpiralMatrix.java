import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
	public List<Integer> spiralOrder(int [][] matrix) {
		List<Integer> list = new ArrayList<Integer>();
		
		int direction = 0; // | 0 - right | 1 - down | 2 - left | 3 - up |
		int upperBound = 0;
		int lowerBound = matrix.length - 1;
		int rightBound = matrix[0].length - 1;
		int leftBound = 0;
		//list.size() != (matrix.length * matrix[0].length);
		
		while (list.size() != (matrix.length * matrix[0].length)) {
			switch (direction) {

				case 3:
					for(int i = lowerBound; i >= upperBound; i--) {
						list.add(matrix[i][leftBound]);
						if (i == upperBound) {
							direction = 0;
							leftBound++;
						}
					}

				default:
				
					for(int i = upperBound; i <= lowerBound; i++) {
						if (direction == 3) {
							break;
						}

						if (list.size() == (matrix.length * matrix[0].length)) {
							break;
						}
					
						switch (direction) {
							case 0:
								for(int j = leftBound; j <= rightBound; j++) {
									list.add(matrix[i][j]);
								}
								upperBound++;
								direction = 1;
								break;
							case 1:
								list.add(matrix[i][rightBound]);
								if (i == lowerBound) {
									direction = 2;
									rightBound--;
								}
								break;
							case 2:
								if (i == lowerBound) {
									for (int j = rightBound; j >= leftBound; j--) {
										list.add(matrix[i][j]);
									}
									lowerBound--;
									direction = 3;
								}
								break;
						}
					}

			}
		}

		return list;
	}
}
