import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Move {
	Board board;
	String[] columnLetters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"};
	HashSet<String> scrabbleDictionary;
	boolean firstMove = true;
	
	public Move() {
		initializeDictionary();
	}
	
	public void setBoard(Board b) {
		board = b;
	}

	private void initializeDictionary() {
		scrabbleDictionary = new HashSet<String>();
		Path textPath = Paths.get("/Users/davisallen/SES/davisa/FinalProject/words.txt");

		Charset charset = Charset.forName("US-ASCII");
		try {
			BufferedReader reader = Files.newBufferedReader(textPath, charset);
			String line = null;
			while ((line = reader.readLine()) != null) {
				scrabbleDictionary.add(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean playMove(Player player, String letter, int number, String orientation, String word) {
		String requiredWord = String.valueOf(word);
		// check if there is room on the board for the word
		int rowIndex = number; 
		int columnIndex = Arrays.asList(columnLetters).indexOf(letter.toLowerCase());
		if(rowIndex < 0 || rowIndex > 14) return false;
		if(columnIndex == -1) return false;
		
		ArrayList<Boolean> adjacencyBool = new ArrayList<Boolean>();
		char[][] gameBoard = board.getGameBoard();
		char[][] tempGameBoard = new char[15][15];
		for(int i = 0; i < gameBoard.length; i++) {
			for(int j = 0; j < gameBoard[i].length; j++) {
				tempGameBoard[i][j] = gameBoard[i][j];
			}
		}
		if (orientation.equals("over")) {
			if(columnIndex > (15-word.length())) return false;
			for(int i = 0; i < word.length(); i++) {
				if (tempGameBoard[rowIndex][columnIndex+i] != '\u0000') {
					int indexOfLetter = requiredWord.indexOf(tempGameBoard[rowIndex][columnIndex+i]);
					if (indexOfLetter == -1) {
						return false;
					}else if (indexOfLetter == 0) {
						requiredWord = requiredWord.substring(1);
					} else if (indexOfLetter == (requiredWord.length()-1)) {
						requiredWord = requiredWord.substring(0, requiredWord.length()-1);
					} else {
						requiredWord = requiredWord.substring(0, indexOfLetter) + requiredWord.substring(indexOfLetter+1, requiredWord.length());
					}
				} else {
					tempGameBoard[rowIndex][columnIndex+i] = word.charAt(i);
					adjacencyBool.add(checkAdjacency(rowIndex, columnIndex+i));
				}
			}
			if ((adjacencyBool.indexOf(true) == -1) && (!firstMove)) return false;
		} else if (orientation.equals("down")) {
			if(rowIndex > (15-word.length())) return false;
			for(int i = 0; i < word.length(); i++) {
				if (tempGameBoard[rowIndex+i][columnIndex] != '\u0000') {
					int indexOfLetter = requiredWord.indexOf(tempGameBoard[rowIndex+i][columnIndex]);
					if (indexOfLetter == -1) {
						return false;
					} else if (indexOfLetter == 0) {
						requiredWord = requiredWord.substring(1);
					} else if (indexOfLetter == (requiredWord.length()-1)) {
						requiredWord = requiredWord.substring(0, requiredWord.length()-1);
					} else {
						requiredWord = requiredWord.substring(0, indexOfLetter) + requiredWord.substring(indexOfLetter+1, requiredWord.length()-1);
					}
				} else {
					tempGameBoard[rowIndex+i][columnIndex] = word.charAt(i);
					adjacencyBool.add(checkAdjacency(rowIndex+i, columnIndex));
				}
			}
			if ((adjacencyBool.indexOf(true) == -1) && (!firstMove)) return false;
		} else {
			return false;
		}

		// check if player has tiles for the word
		ArrayList<Character> playerTiles = player.getMyTiles();
		ArrayList<Character> removedPlayerTiles = new ArrayList<Character>();
		for (int i = 0; i < requiredWord.length(); i++) {
			char c = requiredWord.charAt(i);
			int indexOfChar = playerTiles.indexOf(c);
			if (indexOfChar != -1) {
				removedPlayerTiles.add(playerTiles.remove(indexOfChar));
			} else {
				playerTiles.addAll(removedPlayerTiles);
				return false;
			}
		}
		// check if the word is in the dictionary
		if(!scrabbleDictionary.contains(word)) return false;
		
		// if move is valid
		if(firstMove) firstMove = false;
		board.setGameBoard(tempGameBoard);
		// update player score
		return true;
	}
	
	private boolean checkAdjacency(int rI, int cI) {
		char[][] gameBoard = board.getGameBoard();
		boolean bool = false;
		if((rI+1 < 15) && gameBoard[rI+1][cI] != '\u0000') bool = true;
		if((rI-1 > -1) && gameBoard[rI-1][cI] != '\u0000') bool = true;
		if((cI+1 < 15) && gameBoard[rI][cI+1] != '\u0000') bool = true;
		if((cI-1 > -1) && gameBoard[rI][cI-1] != '\u0000') bool = true;
		return bool;
	}
	
}
