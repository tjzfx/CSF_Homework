import java.util.Collections;
import java.util.LinkedList;

public class TileBag {
	LinkedList<Character> tiles;
	
	public TileBag() {
		tiles = new LinkedList<Character>();
		populateAndRandomizeTileBag();
	}
	
	private void populateAndRandomizeTileBag() {
		for (int a = 0; a < 9; a++) tiles.add('a');
		for (int b = 0; b < 2; b++) tiles.add('b');
		for (int c = 0; c < 2; c++) tiles.add('c');
		for (int d = 0; d < 4; d++) tiles.add('d');
		for (int e = 0; e < 12; e++) tiles.add('e');
		for (int f = 0; f < 2; f++) tiles.add('f');
		for (int g = 0; g < 3; g++) tiles.add('g');
		for (int g = 0; g < 3; g++) tiles.add('g');
		for (int h = 0; h < 2; h++) tiles.add('h');
		for (int i = 0; i < 9; i++) tiles.add('i');
		for (int j = 0; j < 1; j++) tiles.add('j');
		for (int k = 0; k < 1; k++) tiles.add('k');
		for (int l = 0; l < 4; l++) tiles.add('l');
		for (int m = 0; m < 2; m++) tiles.add('m');
		for (int n = 0; n < 6; n++) tiles.add('n');
		for (int o = 0; o < 8; o++) tiles.add('o');
		for (int p = 0; p < 2; p++) tiles.add('p');
		for (int q = 0; q < 1; q++) tiles.add('q');
		for (int r = 0; r < 6; r++) tiles.add('r');
		for (int s = 0; s < 4; s++) tiles.add('s');
		for (int t = 0; t < 6; t++) tiles.add('t');
		for (int u = 0; u < 4; u++) tiles.add('u');
		for (int v = 0; v < 2; v++) tiles.add('v');
		for (int w = 0; w < 2; w++) tiles.add('w');
		for (int x = 0; x < 1; x++) tiles.add('x');
		for (int y = 0; y < 2; y++) tiles.add('y');
		for (int z = 0; z < 1; z++) tiles.add('z');
		Collections.shuffle(tiles);
	}
	
	public Character removeTile() {
		return tiles.removeFirst();
	}
}
