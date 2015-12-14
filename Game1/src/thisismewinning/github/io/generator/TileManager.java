package thisismewinning.github.io.generator;

import java.awt.Graphics2D;
import java.util.ArrayList;

import thisismewinning.github.io.gameos.Vector2F;

public class TileManager {
	
	public static ArrayList<Block> blocks = new ArrayList<Block>();

	public TileManager() {
	}
	
	public void update(double delta) {
		for (Block block : blocks) {
			block.update(delta);
		}
	}
	
	public void render(Graphics2D g) {
		for(Block block : blocks) {
			block.render(g);
		}
	}

}
