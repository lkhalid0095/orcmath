package lubna;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button {

	private String s1;
	private String s2;
	private Color color;



	public CustomButton(int x, int y) {
		super(x, y, 50, 50, "", null);
	}
	//Graphics 2D used for rendering.
	public void drawButton(Graphics2D g, boolean hover) {
		g.setColor(Color.BLACK);
		g.drawString(s1, 40, 40);
		g.drawString(s2, 40, 80);
		
		g.setColor(color);
		g.drawRect(30, 30, 15, 15);
//		g.fill3DRect(30, 30, 15, 15, isHovered());
	}
	public void updateString1(String string) {
	}

	public void updateString2(String string) {
	}

	public void setIconColor(Color color) {
	}

}
