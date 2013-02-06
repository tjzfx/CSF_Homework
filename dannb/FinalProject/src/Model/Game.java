package Model;

public class Game {

	char[][] board = new char[15][15];

	
	
	public Game() {
		super();
		board[2][5] = 'c';
		board[2][6] = 'a';
		board[2][7] = 't';
		board[2][8] = 's';
	}

	public char[][] getBoard() {
		return board;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}
	
}
