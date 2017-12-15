package newpackage;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class PlayingAround extends AnimatedComponent {

	public PlayingAround() {
		super(40, 40, 180, 230 );
		addSequence("resources/myspritesheet.png", 160, 0, 0, 180, 230, 5);
		Thread animation = new Thread(this);
		animation.start();
		update();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Graphics2D g) {
		
		super.update(g);
		
//		g.setColor(Color.CYAN);
//		g.fillRect(0, 0, getWidth(), getHeight());
	}
	

}
