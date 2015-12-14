package thisismewinning.github.io.gamestate;

import java.awt.Graphics2D;
import java.util.Stack;

import thisismewinning.github.io.gamestates.PlayState;

public class GameStateManager {

	public static Stack<GameState> states;
	
	public GameStateManager() {
		states = new Stack<GameState>();
		states.push(new PlayState(this));
	}
	
	public void update(double delta) {
		states.peek().update(delta);
	}
	
	public void render(Graphics2D g) {
		states.peek().render(g);
	}

	public void init() {
		states.peek().init();
	}

}
