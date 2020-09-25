package snake;

public class Game {
	private GameWindow gameWindow;
	private Renderer renderer;
	private Snake snake;
	
	
	public void start() {
		snake = new Snake();
		gameWindow = new GameWindow();
		renderer = gameWindow.getRenderer();
		addElementsToScreen();
		run();
	}
	private void addElementsToScreen() {
		renderer.add(new Background());
		renderer.add(snake);		
	}
	public void run() {
		do {
			gameWindow.repaint();
			
			try {
			Thread.sleep(30);
			}catch(InterruptedEception e) {
				
			}
		} while (!isGameOver());
	}
	private boolean isGameOver() {
		return false;
	}
}
