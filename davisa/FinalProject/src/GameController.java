
public class GameController implements InputDelegate{
	private ConsoleView consoleView;
	private Board board;
	
	public void setConsoleView(ConsoleView view) {
		consoleView = view;
	}
	
	public void setBoard(Board b) {
		board = b;
	}
	
	public void startGame() {
		consoleView.startGame();
	}
	
	public void handleInput(String input) {
        if (input.equals("print")) {
        	// print the board
        	consoleView.printBoardToConsole(board.getGameBoard());
        }
	}

}
