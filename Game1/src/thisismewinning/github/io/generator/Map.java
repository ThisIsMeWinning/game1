package thisismewinning.github.io.generator;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import thisismewinning.github.io.Main;
import thisismewinning.github.io.entity.Player;
import thisismewinning.github.io.gameos.LoadImage;
import thisismewinning.github.io.gameos.Vector2F;
import thisismewinning.github.io.generator.Block.BlockType;

public class Map {

	TileManager tiles = new TileManager();
	
	Player player = new Player();

	public Map() {
	}

	public void init() {
		player.init();
		
		BufferedImage map = null;

		try {
			map = LoadImage.loadImage(Main.class, "map.png");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int x = 0; x < 64; x++) {
			for (int y = 0; y < 64; y++) {

				int col = map.getRGB(x, y);

				switch (col & 0xffffff) {
				case 0x808080:
					tiles.blocks.add(new Block(new Vector2F(x * 48, y * 48), BlockType.GRASS_1));
					break;
					
				case 0x404040:
					tiles.blocks.add(new Block(new Vector2F(x * 48, y * 48), BlockType.WALL_1).isSolid(true));
					break;
				}
			}
		}
	}

	public void update(double delta) {
		tiles.update(delta);
		player.update(delta);
	}

	public void render(Graphics2D g) {
		tiles.render(g);
		player.render(g);
	}

}
