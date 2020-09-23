package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	
	private Rect background;
	private Rect rect;
	
	public GameWindow() {
		background = new Rect(Color.BLACK, 0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGTH);
		rect = new Rect(Color.GREEN, 50, 50, 200, 200);
		
		/*rect.setX(0);
		rect.setY(0);
		rect.setWidth(Constants.WINDOW_WIDTH);
		rect.setHeight(Constants.WINDOW_HEIGTH);
		rect.setColor(Color.BLACK); caso queira usar o set*/
		
		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGTH);
		setResizable(false);		
		setTitle(Constants.WINDOW_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) {
		//g.setColor(Color.GREEN);
		//g.fillRect(200/* X DIREITA*/, 100 /* Y BAIXO*/, 250, 100);
		background.paint(g);
		rect.paint(g);
	}
}