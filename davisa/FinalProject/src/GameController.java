import java.util.Scanner;


public class GameController implements InputDelegate{
	private Game game;
	private ConsoleView consoleView;
	private Board board;
	private TileBag tileBag;
	private Player player1;
	private Player player2;
	private Move move;
    Scanner consoleScanner = new Scanner(System.in);
	
	public void setUpGame() {
		board = new Board();
		consoleView = new ConsoleView();
		tileBag = new TileBag();
		player1 = new Player("Player 1");
		player2 = new Player("Player 2");
		game = new Game(player1, player2);
		move = new Move();
		move.setBoard(board);
		
		addInitialTilesToPlayers();

		consoleView.setInputDelegate(this);
		
		// START GAME
		startGame();
	}
	
	private void addInitialTilesToPlayers() {
		for (int i = 0; i < 7; i++) {
			Character c = tileBag.removeTile();
			player1.addTile(c);
		}
		for (int i = 0; i < 7; i++) {
			Character c = tileBag.removeTile();
			player2.addTile(c);
		}
	}

	public void startGame() {
	    while(true) {
	        consoleView.printToConsole("Enter a command or type 'help' for command options");
	        String command = consoleScanner.next();
	        handleInput(command);
	    }
	}
	
	private void handleInput(String input) {
        if (input.equals("print")) {
        	consoleView.printBoardToConsole(board.getGameBoard());
        } else if (input.equals("help")) {
        	consoleView.printCommandList();
        } else if (input.equals("whoseTurn")) {
        	Player playerWhoseTurnItIs = game.getPlayerWhoseTurnItIs();
        	consoleView.printToConsole(playerWhoseTurnItIs.name);
        } else if (input.equals("myTiles")) {
        	Player playerWhoseTurnItIs = game.getPlayerWhoseTurnItIs();
        	consoleView.printToConsole(playerWhoseTurnItIs.listMyTiles());
        } else if (input.equals("play")) {
        	String letter = consoleScanner.next();
        	int number = consoleScanner.nextInt();
        	String orientation = consoleScanner.next();
        	String word = consoleScanner.next();
        	Player playerWhoseTurnItIs = game.getPlayerWhoseTurnItIs();
        	boolean successfulMove = move.playMove(playerWhoseTurnItIs, letter, number, orientation, word);
        	if(successfulMove) {
            	// replenish tiles
        		int playerNumTiles = playerWhoseTurnItIs.getMyTiles().size();
            	for (int i = 0; i < (7-playerNumTiles); i++) {
        			Character c = tileBag.removeTile();
        			playerWhoseTurnItIs.addTile(c);
            	}
            	consoleView.printBoardToConsole(board.getGameBoard());
            	game.togglePlayerWhoseTurnItIs();
            	playerWhoseTurnItIs = game.getPlayerWhoseTurnItIs();
            	consoleView.printToConsole("It is " + playerWhoseTurnItIs.name + "'s turn and your tiles are:");
            	consoleView.printToConsole(playerWhoseTurnItIs.listMyTiles());
        	} else {
        		consoleView.printToConsole("Move Was Invalid");
        	}
        }
        
        
        else {
        	consoleView.printToConsole("Command not recognized");
        }
	}

}
