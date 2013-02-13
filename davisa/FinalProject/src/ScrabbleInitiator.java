import java.io.*;

public class ScrabbleInitiator {
	
	public static void main(String [] args) {
		// Start with initiating a ConsoleView and a GameController, as well as a board
		// make sure the ConsoleView can print out the game board to the console
		// and that the GameController can handle console input and recognize a "Print" command
		
		// View/Controller dependencies: input to view needs to get passed to controller
		// Controller needs to be able to update view
		// The GameController needs to be able to access the board, and pass the board data to the ConsoleView
		
		Board board = new Board();
		GameController gameController = new GameController();
		ConsoleView consoleView = new ConsoleView();
		
		gameController.setConsoleView(consoleView);
		gameController.setBoard(board);
		consoleView.setInputDelegate(gameController);

		gameController.startGame();
	}
	
}
