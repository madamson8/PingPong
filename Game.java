package PingPong;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import PingPong.Drawing;
import PingPong.Player1;

public class Game {
	
	public static void main(String[] args) {
		Game game = new Game();
		
		
		game.createFrame();
		
	}
	
	public void createFrame() {
		JFrame frame = new JFrame("Ping Pong!");
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
}
