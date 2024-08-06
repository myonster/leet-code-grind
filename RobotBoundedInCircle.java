class RobotBoundedInCircle {

	public boolean isRobotBounded(String instructions) {
		int [] pos = new int [3];
		int maxX = 0;
		int maxY = 0;
		
		for (int i = 0; i < 4; i++) {
			int [] nextPos = new RobotBoundedInCircle().move(pos, instructions);
			// System.out.println(" ");
			// System.out.println("Iteration: " + i);
			// System.out.println("Current position: [" + pos[0] + " , " + pos[1] + "]");
			// System.out.println("Next position: [" + nextPos[0] + " , " + nextPos[1] + "]");
			// System.out.println(" --- ");
			// System.out.println(" ");
			if (nextPos[0] == 0 && nextPos[1] == 0) {
				return true;
			}

			pos = nextPos;
		}
		
		return false;
	}

	public int [] move(int [] sPos, String instructions) {
		int dir = sPos[2]; 			//			   ^ 	
		int [] pos = sPos.clone();			// 	  		north[0] 
									// < west[1]       east[3] > 	
									//          south[2]
									//             v
		
		byte [] arr = instructions.getBytes();
		// G - 71 L -76 R-82
		//[] pos [0,0] x-y axis

		for (byte move : arr) {
			switch (move) {
				case 71:
					switch (dir) {
						case 0:
							pos[1]++; //y-axis unit +1 (moving up)
							break; 
						case 1:
							pos[0]--; //x-axis unit -1 (moving west)
							break;
						case 2:
							pos[1]--; //y-axis unit -1 (moving south)
							break;
						case 3:
							pos[0]++; //x-axis unit +1 (moving east)
							break;
					}
				break;

				case 76:
					switch(dir) {
						case 3:
							dir = 0;
							break;
						default:
							dir++;
							break;
					}
				break;

				case 82:
					switch(dir) {
						case 0:
							dir = 3;
							break;
						default:
							dir--;
							break;						
					}
				break;
			}
		}

		//System.out.print(pos[0] + " , " + pos[1]);
		//return (pos[0] == 0 && pos[1] == 0);
		pos[2] = dir;
		return pos;
	}
}
