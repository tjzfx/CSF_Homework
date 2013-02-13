import java.util.Scanner;

public class ConsoleView {
	private InputDelegate inputDelegate;
	private char[][] gameBoard;
	
	public void setInputDelegate(InputDelegate delegate) {
		inputDelegate = delegate;
	}
	
	public void startGame() {
	    while(true) {
	        Scanner consoleScanner = new Scanner(System.in);
	        System.out.println("Type 'print' to print board");
	        String command = consoleScanner.next();
	        inputDelegate.handleInput(command);
	    }
	}

	public void printBoardToConsole(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				char charAtIandJ = board[i][j];
				if (charAtIandJ == '\u0000') {
					System.out.print(" - ");
				} else {
					System.out.print(" " + charAtIandJ + " ");
				}
			}
			System.out.println("");
		}
	}
	
}
