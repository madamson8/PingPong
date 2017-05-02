import javax.swing.*;
import java.awt.*;

/**
 * Created by ma039102 on 5/2/2017.
 */
public class MyFrame extends JFrame {

    public MyFrame() {
        super("My Frame");

        setContentPane(new DrawPane());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
        setFocusable(true);
        requestFocusInWindow();
    }

    class DrawPane extends JPanel {
        public void paintComponent(Graphics g) {
            //Draw here, you know the deal
            g.fillRect(10,10,50,50);
        }
    }
}
