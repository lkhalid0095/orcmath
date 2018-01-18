package practiceFinal;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class GameScreen extends ClickableScreen implements Runnable {

	private Button win;
	private Button lose;
	private boolean hasWon;
	private TextArea winMessage;
	private TextArea loseMessage;

	public GameScreen(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
	
		
//		rect1.setColor(Color.CYAN);
//		rect2.drawRect(400, 250, 50, 50);
//		rect2.setColor(Color.CYAN);
		win = new Button(280, 250, 60, 60, "Win", new Action() {
			
			@Override
			public void act() {
				hasWon = true;
				winMessage = new TextArea(335,200,150,150,"You Win!");
				setBackground(Color.PINK);
				viewObjects.add(winMessage);
				
				if(hasWon) {
					win.setEnabled(false);
					lose.setEnabled(false);
				}
				
			}
		});
		win.setBackground(Color.pink);
		win.setForeground(Color.MAGENTA);
		
		viewObjects.add(win);
		lose = new Button(380, 250, 60, 60, "Lose", new Action() {
			
			@Override
			public void act() {
				hasWon = false;
				loseMessage = new TextArea(335,200,150,150,"You Lose!!");
				setBackground(Color.red);
				viewObjects.add(loseMessage);
				if(!hasWon) {
					win.setEnabled(false);
					lose.setEnabled(false);
					
				}

				
			}
		});
		viewObjects.add(lose);
		lose.setBackground(Color.pink);
		lose.setForeground(Color.magenta);
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}



}
