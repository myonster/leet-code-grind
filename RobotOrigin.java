class RobotOrigin {

	public boolean judgeCircle(String moves) {

		int [] pos = new int [2]; // [x y] axis

		for (byte move: moves.getBytes()) {
			switch(move) {
				case 85: //up
					pos[1]++;
					//System.out.println(pos[0] + " " + pos[1]);
					break;

				case 68: //down
					pos[1]--;
					//System.out.println(pos[0] + " " + pos[1]);
					break;
				case 76: //left
					pos[0]--;
					//System.out.println(pos[0] + " " + pos[1]);
					break;
				case 82: //right
					pos[0]++;
					//System.out.println(pos[0] + " " + pos[1]);
					break;
			}
		}
		
		return pos[0] == 0 && pos[1] == 0;		
	}
}
