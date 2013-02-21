import java.util.Scanner;

public class ConsoleView {
	private InputDelegate inputDelegate;
	private char[][] gameBoard;
	
	public void setInputDelegate(InputDelegate delegate) {
		inputDelegate = delegate;
	}
	
	public void printBoardToConsole(char[][] board) {
		System.out.println("    A  B  C  D  E  F  G  H  I  J  K  L  M  N  O ");
		for (int i = 0; i < board.length; i++) {
			System.out.print(" " + i + ((i < 10) ? " " : ""));
			for (int j = 0; j < board[i].length; j++) {
				char charAtIandJ = board[i][j];
				if (charAtIandJ == '\u0000') {
					System.out.print(" - ");
				} else {
					System.out.print(" " + charAtIandJ + " ");
				}
			}
			System.out.print(" " + i + ((i < 10) ? " " : ""));
			System.out.println("");
		}
		System.out.println("    A  B  C  D  E  F  G  H  I  J  K  L  M  N  O ");
	}

	public void printToConsole(String s) {
		System.out.println(s);
	}
	
	public void printCommandList() {
		System.out.println("Type 'print' to print board \n" +
				"Type 'myTiles' to see the tiles available to you" + "\n" +
				"Type 'play [letter A - O] [number 1 - 15] [over/down] [word]' to play a word" + "\n" +
				"Type 'whoseTurn' to print whose turn it is");
	}
}
