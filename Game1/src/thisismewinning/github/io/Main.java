package thisismewinning.github.io;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import thisismewinning.github.io.entity.Player;
import thisismewinning.github.io.gameloop.GameLoop;
import thisismewinning.github.io.gameos.GameWindow;

public class Main {
	
	public static GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
	public static int width = graphicsDevice.getDisplayMode().getWidth();
	public static int height = graphicsDevice.getDisplayMode().getHeight();
	
	public static void main(String[] args) {
		GameWindow frame = new GameWindow("Coaxe", width, height);
		frame.setFullscreen(1);
		frame.addKeyListener(new Player());
		frame.add(new GameLoop(width,height));
		frame.setVisible(true);
	}

}
 