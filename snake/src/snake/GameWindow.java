package snake;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameWindow extends JFrame{
	private Renderer renderer;
	
 	public GameWindow(){
		renderer = new Renderer();
		
		Background background = new Background();
		renderer.add(background);
		
		Snake snake = new Snake();
		renderer.add(snake);
		
		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGTH);
		setResizable(false);		
		setTitle(Constants.WINDOW_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
 	
 	public Renderer getRenderer() {
		return renderer;
	}
	
	@Override
	public void paint(Graphics g) {
		renderer.render(g);
	}
}