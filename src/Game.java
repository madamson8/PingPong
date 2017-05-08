import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame {



	public boolean left,right,up,down = false;

	public static void main(String[] args) {
		Game game = new Game();
		Runnable r = new Runnable() {

			@Override
			public void run() {
				new MyFrame().repaint();

			}

		};

		SwingUtilities.invokeLater(r);

	}

//	public void mainLoop() {
//		if(down) {
//			p1.changePlayerY(5);
//		}
//	}

}
