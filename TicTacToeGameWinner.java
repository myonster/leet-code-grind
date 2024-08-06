class TicTacToeGameWinner {

	public String tictactoe(int [][] moves) {
		int [] board = new int [1144];
		for (int i = 0; i < moves.length; i++) {
			int pos = 1000 + moves[i][0]* 10 + moves[i][1]; 
			if (i % 2 == 0) { //first player
				board[pos]++;
			}

			if (i % 2 != 0) { //second player
				board[pos]--;
			}

			if (i >= 4) {
				
				int hor = board[pos] + board[pos + 1] + board[pos + 2] + board[pos - 1] + board[pos - 2];
				int ver = board[pos] + board[pos + 10] + board[pos + 20] + board[pos - 10] + board[pos - 20];
				int diag1 = board[pos] + board[pos + 11] + board[pos + 22] + board[pos - 11] + board[pos - 22];
				int diag2 = board[pos] + board[pos + 9] + board[pos + 18] + board[pos - 9] + board[pos - 18];

				if (hor == 3 || ver == 3 || diag1 == 3 || diag2 == 3) {
					return "A";
				}

				if (hor == -3 || ver == -3 || diag1 == -3 || diag2 == -3) {
					return "B";
				}
			}
		}

		return moves.length == 9 ? "Draw" : "Pending";
	}
}
