import static org.junit.Assert.*;

import org.junit.Test;

import Model.Tile;


public class TileTest {

	@Test
	public void test() {
		Tile testTile = new Tile();
		testTile.getTilePool(); //Not working
		
		
		assertEquals(testTile.getTilePool().keySet().size(), 26);
	}

}
