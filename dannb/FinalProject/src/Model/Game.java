package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;

public class Game {

	char[][] board = new char[15][15];
	Path wordsPath = Paths.get("words.txt");
	Charset charset = Charset.forName("US-ASCII");
	HashSet<String> validWords = new HashSet<String>();
	
	
	public Game() {
		board[2][5] = 'c';
		board[2][6] = 'a';
		board[2][7] = 't';
		board[2][8] = 's';
		board[1][6] = 'b';
		board[3][6] = 'l';
		board[3][6] = 'l';
		try {
			BufferedReader reader = Files.newBufferedReader(wordsPath, charset);
			Scanner s = new Scanner(reader);
			
			while (s.hasNext()) {
				validWords.add(s.next());
			}
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public char[][] getBoard() {
		return board;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}
}
