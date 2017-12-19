package lubna;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Books extends AnimatedComponent {

	private String name;
	private String author;
	private String genre;
	private int page;
 
	public Books(String name, String author, String genre, int page) {
		super(40, 40, 180, 230 );
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.page = page;
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
	public String toString() {
		
			return name + "," + author + "," + genre + "," + page + "." ;

	}
	
	

}
