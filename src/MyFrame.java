import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by ma039102 on 5/2/2017.
 */
public class MyFrame extends JFrame {
    Game game = new Game();
    Player1 p1 = new Player1(25, 25, 25, 75);

    public MyFrame() {
        super("My Frame");

        setContentPane(new DrawPane());


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
        setFocusable(true);
        requestFocusInWindow();
        setLocationRelativeTo(null);
        addKeyListener(new KeyListener() {
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
                        p1.changePlayerY(5);
                        System.out.println(p1.getPlayer1Y());
                        System.out.println("Down");
                        break;
                }
            }
        });

    }



    class DrawPane extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            //Draw here, you know the deal
            g.fillRect(p1.getPlayer1X(), p1.getPlayer1Y(), p1.getPlayer1Width(), p1.getPlayer1Height());
        }
//        repaint();

    }



}
