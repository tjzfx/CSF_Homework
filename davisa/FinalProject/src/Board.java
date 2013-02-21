
public class Board {
	
	private char[][] gameBoard;
	
	public Board() {
		gameBoard = new char[15][15];
	}
	
	public char[][] getGameBoard() {
		return gameBoard;
	}
	
	public void setGameBoard(char[][] c) {
		gameBoard = c;
	}
}
