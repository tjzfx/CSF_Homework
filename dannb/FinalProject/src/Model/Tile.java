package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tile {
	char value;
	Path tilesPath = Paths.get("tiles.txt");
	Charset charset = Charset.forName("US-ASCII");
	Hashtable<String, Integer> tilePool = new Hashtable<String, Integer>();
	
	public Tile() {
		try {
			BufferedReader reader = Files.newBufferedReader(tilesPath, charset);
			Scanner s = new Scanner(reader);
			
			while (s.hasNext()) {
				tilePool.put(s.next(), s.nextInt());
			}
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Hashtable<String, Integer> getTilePool() {
		return tilePool;
	}

	public void setTilePool(Hashtable<String, Integer> tilePool) {
		this.tilePool = tilePool;
	}

	public char getValue() {
		return value;
	}
	
	public void setValue(char value) {
		this.value = value;
	}
	
	int points;

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	Queue<Tile> tileQueue = new LinkedList<Tile>();
	
	
}
