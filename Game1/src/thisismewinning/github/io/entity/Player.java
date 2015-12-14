package thisismewinning.github.io.entity;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import thisismewinning.github.io.Main;
import thisismewinning.github.io.gameloop.GameLoop;
import thisismewinning.github.io.gameos.Vector2F;

public class Player implements KeyListener {

	Vector2F pos;
	private int width = 42;
	private int height = 42;
	private static boolean up, down, left, right;
	private float maxSpeed = 96f;

	private float speedUp = 0;
	private float speedDown = 0;
	private float speedLeft = 0;
	private float speedRight = 0;

	private float slowDown = 4.093f;

	private float fixedTime = 1f / 60f;

	private boolean mapMove = true;

	public Player() {
		pos = new Vector2F(Main.width / 2 - width / 2, Main.height / 2 - height / 2);
	}

	public void init() {
		
	}

	public void update(double delta) {

		float moveAmountu = (float) (speedUp * fixedTime);
		float moveAmountd = (float) (speedDown * fixedTime);
		float moveAmountl = (float) (speedLeft * fixedTime);
		float moveAmountr = (float) (speedRight * fixedTime);

		if (!mapMove) {
			if (up) {
				if (speedUp < maxSpeed) {
					speedUp += slowDown;
				} else {
					speedUp = maxSpeed;
				}
				pos.yPos -= moveAmountu;
			} else {
				if (speedUp != 0) {
					speedUp -= slowDown;

					if (speedUp < 0) {
						speedUp = 0;
					}
				}

				pos.yPos -= moveAmountu;
			}

			if (down) {
				if (speedDown < maxSpeed) {
					speedDown += slowDown;
				} else {
					speedDown = maxSpeed;
				}
				pos.yPos += moveAmountd;
			} else {
				if (speedDown != 0) {
					speedDown -= slowDown;

					if (speedDown < 0) {
						speedDown = 0;
					}
				}

				pos.yPos += moveAmountd;
			}

			if (left) {
				if (speedLeft < maxSpeed) {
					speedLeft += slowDown;
				} else {
					speedLeft = maxSpeed;
				}
				pos.xPos -= moveAmountl;
			} else {
				if (speedLeft != 0) {
					speedLeft -= slowDown;

					if (speedLeft < 0) {
						speedLeft = 0;
					}
				}

				pos.xPos -= moveAmountl;
			}

			if (right) {
				if (speedRight < maxSpeed) {
					speedRight += slowDown;
				} else {
					speedRight = maxSpeed;
				}
				pos.xPos += moveAmountr;
			} else {
				if (speedRight != 0) {
					speedRight -= slowDown;

					if (speedRight < 0) {
						speedRight = 0;
					}
				}

				pos.xPos += moveAmountr;
			}

			
			
			
			
			
		} else {
			
			
			
			
			
			
			if (up) {
				if (speedUp < maxSpeed) {
					speedUp += slowDown;
				} else {
					speedUp = maxSpeed;
				}
				GameLoop.map.yPos -= moveAmountu;
			} else {
				if (speedUp != 0) {
					speedUp -= slowDown;

					if (speedUp < 0) {
						speedUp = 0;
					}
				}

				GameLoop.map.yPos -= moveAmountu;
			}

			if (down) {
				if (speedDown < maxSpeed) {
					speedDown += slowDown;
				} else {
					speedDown = maxSpeed;
				}
				GameLoop.map.yPos += moveAmountd;
			} else {
				if (speedDown != 0) {
					speedDown -= slowDown;

					if (speedDown < 0) {
						speedDown = 0;
					}
				}

				GameLoop.map.yPos += moveAmountd;
			}

			if (left) {
				if (speedLeft < maxSpeed) {
					speedLeft += slowDown;
				} else {
					speedLeft = maxSpeed;
				}
				GameLoop.map.xPos -= moveAmountl;
			} else {
				if (speedLeft != 0) {
					speedLeft -= slowDown;

					if (speedLeft < 0) {
						speedLeft = 0;
					}
				}

				GameLoop.map.xPos -= moveAmountl;
			}

			if (right) {
				if (speedRight < maxSpeed) {
					speedRight += slowDown;
				} else {
					speedRight = maxSpeed;
				}
				GameLoop.map.xPos += moveAmountr;
			} else {
				if (speedRight != 0) {
					speedRight -= slowDown;

					if (speedRight < 0) {
						speedRight = 0;
					}
				}

				GameLoop.map.xPos += moveAmountr;
			}
		}

	}

	public void render(Graphics2D g) {
		g.fillRect((int) pos.xPos, (int) pos.yPos, width, height);
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_W) {
			up = true;
		}
		if (key == KeyEvent.VK_S) {
			down = true;
		}
		if (key == KeyEvent.VK_A) {
			left = true;
		}
		if (key == KeyEvent.VK_D) {
			right = true;
		}
	}

	public void keyReleased(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_W) {
			up = false;
		}
		if (key == KeyEvent.VK_S) {
			down = false;
		}
		if (key == KeyEvent.VK_A) {
			left = false;
		}
		if (key == KeyEvent.VK_D) {
			right = false;
		}
		
	}

	public void keyTyped(KeyEvent e) {

	}

}
