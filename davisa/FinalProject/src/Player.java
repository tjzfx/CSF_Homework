import java.util.ArrayList;

public class Player {
	String name;
	private ArrayList<Character> tiles;
	
	public Player(String playerName) {
		name = playerName;
		tiles = new ArrayList<Character>();
	}
	
	public void addTile(Character c) {
		tiles.add(c);
	}
	
	public void setMyTiles(ArrayList<Character> t) {
		tiles = t;
	}
	
	public ArrayList<Character> getMyTiles() {
		return tiles;
	}
	
	public String listMyTiles() {
		String myTiles = "";
		for (int i = 0; i < tiles.size(); i++) {
			myTiles = myTiles + tiles.get(i) + " ";
		}
		return myTiles;
	}
}
