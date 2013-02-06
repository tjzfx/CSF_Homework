package View;

public class View {
	
	char[][] currentGame = null;
	
	public char[][] getCurrentGame() {
		return currentGame;
	}

	public void setCurrentGame(char[][] currentGame) {
		this.currentGame = currentGame;
	}

	private void drawBoard() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print("test");
			}
		}
	}
}
