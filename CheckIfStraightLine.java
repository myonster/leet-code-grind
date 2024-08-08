class CheckIfStraightLine {
	public boolean checkStraightLine(int [][] coordinates) {
		// form a straight line equ
		// y = mx + c;
		int flag = 0;
		double grad = 0;
		int y = coordinates[0][1];;
		int x = coordinates[0][0];
		double c = 0; 
		
		double rise = (coordinates[1][1] - coordinates[0][1]); 
		int run = (coordinates[1][0] - coordinates[0][0]);

		if (run == 0) {
			flag = 1;
			x = coordinates[0][0];
		} else if (rise == (double) 0) {
			flag = 2;
			y = coordinates[0][1];
		} else {
			flag = 0;
			grad = rise / run;
			c = y - grad * x;
		}

		for (int i = 2; i < coordinates.length; i ++) {
			switch (flag) {
				case 1: {
					if (coordinates[i][0] != x) {
						return false;
					}
					break;
				}
				
				case 2: {
					if (coordinates[i][1] != y) {
						return false;
					}

					break;
				}
				case 0: {
					if ((double) coordinates[i][1] != grad * coordinates[i][0] + c) {
						return false;
					} 
					break;
				}
			}
		}

		return true;
	}
}
