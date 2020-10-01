package br.com.snake.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import br.com.snake.core.Direction;

public class Shape extends Drawable {
	private List<Rect> rects;
	
	public Shape(Color color) {
		setColor(color);
		rects = new ArrayList<>();
	}
	
	public List<Rect> getRects() {
		return rects;
	}
	
	public Rect getFirstRect() {
		return rects.get(0);
	}
	
	public Rect getLastRect() {
		return rects.get(rects.size() -1);
	}
	
	public Rect duplicateRect(Rect baseRect, Direction direction) {
		int baseX = (int) baseRect.getLocation().getX();
		int baseY = (int) baseRect.getLocation().getY();
		int baseWidth = (int) baseRect.getDimension().getWidth();
		int baseHeith = (int) baseRect.getDimension().getHeight();
		
		Point location = new Point(baseX + direction.getSgnX() * baseWidth, 
									baseY + direction.getSgnY()* baseHeith);
		
		
		Rect newRect = new Rect(location, baseRect.getDimension());
		return newRect;
	}
	
	public void addRect(Rect rect) {
		rects.add(rect);
	}
	
	@Override
	public void draw(Graphics g) {
		
		for (Rect r: rects) {
			r.draw(g);
		}
	}
	
	public boolean intersects(Rect rect) {
		for (Rect r : rects) {
			return true;
		}
		return false;
	}
}
