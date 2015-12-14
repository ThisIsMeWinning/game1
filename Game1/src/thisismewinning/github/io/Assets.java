package thisismewinning.github.io;

import java.awt.image.BufferedImage;

import thisismewinning.github.io.gameos.LoadImage;
import thisismewinning.github.io.gameos.SpriteSheet;

public class Assets {
	
	SpriteSheet blocks = new SpriteSheet();
	
	public static BufferedImage grass_1;
	public static BufferedImage wall_1;
	
	public void init() {
		blocks.setSpriteSheet(LoadImage.loadImage(Main.class, "blocks.png"));
		
		grass_1 = blocks.getTile(0, 0, 16, 16);
		wall_1 = blocks.getTile(16, 0, 16, 16);
	}
	
	public static BufferedImage getGrass_1() {
		return grass_1;
	}
	
	public static BufferedImage getWall_1() {
		return wall_1;
	}

}
