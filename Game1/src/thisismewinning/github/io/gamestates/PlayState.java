package thisismewinning.github.io.gamestates;

import java.awt.Graphics2D;

import thisismewinning.github.io.Main;
import thisismewinning.github.io.gamestate.GameState;
import thisismewinning.github.io.gamestate.GameStateManager;
import thisismewinning.github.io.generator.Map;

public class PlayState extends GameState {
	
	Map map;

	public PlayState(GameStateManager gsm) {
		super(gsm);
	}

	@Override
	public void init() {
		map = new Map();
		map.init();
	}

	@Override
	public void update(double delta) {
		map.update(delta);
	}

	@Override
	public void render(Graphics2D g) {
		map.render(g);
	}

}
