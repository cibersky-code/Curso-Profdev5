package br.com.snake.scene;

import br.com.snake.graphics.Rect;
import br.com.snake.util.Constants;

public class Background extends Rect{

	public Background() {
		super(0,0,Constants.WINDOW_WIDTH,Constants.WINDOW_HEIGTH);
		setColor(Constants.BACKGROUD_COLOR);
	}
	
}
