package myStuff;

import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressTyler extends Component implements ProgressInterfaceLubna {

	boolean progress;
	private int round;
	private int sequence;
	public ProgressTyler(int x, int y, int w, int h) {
		super(x, y, w, h);
		
		update();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gameOver() {
		// TODO Auto-generated method stub
		progress = false;
	}

	@Override
	public void setRound(int roundNumber) {
		// TODO Auto-generated method stub
		round = roundNumber;
		update();
	}

	@Override
	public void setSequenceSize(int size) {
		// TODO Auto-generated method stub
		sequence = size;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		if(progress) {
			g.drawString("Round number  "+round, getX(), getY());
			g.drawString("Here's the sequence: "+sequence, getX(), getY()+ 15);
		}
		else {
			g.drawString("You've lost", getX(), getY());
		}
		
	}

}
