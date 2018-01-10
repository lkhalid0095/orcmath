package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonTyler extends Button implements ButtonInterfaceLubna {

	private Color base;
	private Color current;
	
	
	public ButtonTyler(int x, int y, int w, int h, String text,Color color, Action action) {
		super(x, y, w, h, "", color, null);
		setColor(color);

		
		// TODO Auto-generated constructor stub
	}

	public void drawButton(Graphics2D g, boolean hover) {
		Ellipse2D ellipse = new Ellipse2D.Double(0,0, getWidth(), getHeight());
		g.setColor(current);
		g.draw(ellipse);
		g.fill(ellipse);
	}
	@Override
	public void setX(double x) {
		setX((int)x);
	}
	@Override
	public void setY(double y) {
		setY((int)y);
	}

	@Override
	public void setColor(Color color) {
		base = color;
		current = color;
		update();
		
	}

	@Override
	public void highlight() {
		current = Color.GRAY;
		update();
	}

	@Override
	public void dim() {
		current = base;
		update();
	}
	public void update() {
		BufferedImage hoverImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics2D hoverG = hoverImage.createGraphics();
		applyStyles(hoverG);
		drawButton(hoverG, true);
		super.update();
	}

	@Override
	public void getAButton() {
		// TODO Auto-generated method stub
		
	}

}
