package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonTyler extends Button implements ButtonInterfaceLubna {

	boolean buttonState;
	
	
	public ButtonTyler(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, "", null);
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void drawButton(Graphics2D g, boolean hover) {
		if(buttonState) {
			
		}
		else {
			
		}
	}

	@Override
	public void setColor(Color color) {
	
		
	}

	@Override
	public void highlight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dim() {
		// TODO Auto-generated method stub
		
	}

}
