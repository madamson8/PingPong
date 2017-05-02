import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame {



	public boolean left,right,up,down = false;

	public static void main(String[] args) {
		Game game = new Game();
		Player1 p1 = new Player1(20,20,20,20);
		Runnable r = new Runnable() {

			@Override
			public void run() {
				new MyFrame().addKeyListener(new KeyListener() {

					@Override
					public void keyTyped(KeyEvent e) {}

					@Override
					public void keyReleased(KeyEvent e) {
						switch (e.getKeyCode()) {
							case 37:
								//Left
								game.left = false;
								break;
							case 38:
								//Up
								game.up = false;
								break;
							case 39:
								game.right = false;
								//Right
								break;
							case 40:
								//Down
								game.down = false;
								break;
						}
					}
					@Override
					public void keyPressed(KeyEvent e) {
						switch (e.getKeyCode()) {
							case 37:
								//Left
								game.left = true;
								break;
							case 38:
								//Up
								game.up = true;
								break;
							case 39:
								game.right = true;
								//Right
								break;
							case 40:
								//Down
								game.down = true;
								break;
						}
					}
				});

				if(game.down) {
					p1.changePlayerY(2); //Remember that the y axis is inverted, down is positive, and vice versa
				}

			}
		};

		SwingUtilities.invokeLater(r);

	}
}
