package thisismewinning.github.io.gameloop;

import thisismewinning.github.io.Assets;
import thisismewinning.github.io.gameos.MainLoop;
import thisismewinning.github.io.gameos.Vector2F;
import thisismewinning.github.io.gamestate.GameStateManager;

public class GameLoop extends MainLoop {
	private static final long serialVersionUID = 1L;
	
	GameStateManager gsm;
	public static Assets assets = new Assets();
	public static Vector2F map = new Vector2F();

	public GameLoop(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void init() {
		assets.init();
		Vector2F.setWorldVariables(map.xPos, map.yPos);
		gsm = new GameStateManager();
		gsm.init();
		super.init();
	}
	
	@Override
	public void update(double delta) {
		Vector2F.setWorldVariables(map.xPos, map.yPos);
		gsm.update(delta);
	}
	
	@Override
	public void render() {
		super.render();
		gsm.render(graphics2D);
		clear();
	}
	
	@Override
	public void clear() {
		super.clear();
	}

}
