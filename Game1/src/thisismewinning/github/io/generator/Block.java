package thisismewinning.github.io.generator;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import thisismewinning.github.io.Assets;
import thisismewinning.github.io.gameos.Vector2F;

public class Block extends Rectangle {

	Vector2F pos = new Vector2F();
	private int blockScale = 48;

	private BlockType blocktype;
	private BufferedImage block;
	
	private boolean isSolid;

	public Block(Vector2F pos, BlockType blocktype) {
		this.pos = pos;
		this.blocktype = blocktype;
		init();
	}
	
	public Block isSolid(boolean isSolid) {
		this.isSolid = isSolid;
		return this;
	}

	public void init() {
		switch (blocktype) {
		case GRASS_1:
			block = Assets.getGrass_1();
			break;
			
		case WALL_1:
			block = Assets.getWall_1();
			break;
		}

	}

	public void update(double delta) {

	}

	public void render(Graphics2D g) {
		g.drawImage(block, (int) pos.getWorldLoaction().xPos, (int) pos.getWorldLoaction().yPos, blockScale, blockScale,
				null);
		
		if(isSolid) {
			g.drawRect((int) pos.getWorldLoaction().xPos, (int) pos.getWorldLoaction().yPos, blockScale, blockScale);
		}
	}

	public enum BlockType {
		GRASS_1,
		WALL_1
	}

	public boolean isSolid() {
		return false;
	}

}
