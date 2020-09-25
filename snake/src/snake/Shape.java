package snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Shape extends Drawable {
	private List<Rect> rects;
	
	public Shape(Color color) {
		setColor(color);
		rects = new ArrayList<>();
	}
	
	public List<Rect> getRects() {
		return rects;
	}
	
	public Rect duplicateRect(Rect baseRect) {
		int baseX = (int) baseRect.getLocation().getX();
		int baseY = (int) baseRect.getLocation().getY();
		int baseWidth = (int) baseRect.getDimension().getWidth();
		int baseHeith = (int) baseRect.getDimension().getHeight();
		
		Point location = new Point(baseX - baseWidth, baseY);
		Dimension dimension = new Dimension(baseWidth, baseHeith);
		Rect newRect = new Rect(location, dimension);
		return newRect;
	}
	
	public void addRect(Rect rect) {
		rects.add(rect);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		for (Rect r: rects) {
			r.draw(g);
		}
	}
}
