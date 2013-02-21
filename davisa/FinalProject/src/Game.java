
public class Game {

	private Player player1;
	private Player player2;
	private Player playerWhoseTurnItIs;
	
	public Player getPlayerWhoseTurnItIs() {
		return playerWhoseTurnItIs;
	}
	
	public void togglePlayerWhoseTurnItIs() {
		if(playerWhoseTurnItIs.equals(player1)) {
			playerWhoseTurnItIs = player2;
		} else {
			playerWhoseTurnItIs = player1;
		}
	}
	
	public Game(Player p1, Player p2) {
		player1 = p1;
		player2 = p2;
		playerWhoseTurnItIs = p1;
	}
}
