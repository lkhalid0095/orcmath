package myStuff;

import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenLubna extends ClickableScreen implements Runnable {

	private TextLabel round;
	private ButtonInterfaceLubna[] buttons;
	private ProgressInterfaceLubna display;
	private ArrayList<MoveInterfaceLubna> sequence;
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;


	public SimonScreenLubna(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		
		addButtons();
		for(ButtonInterfaceLubna b: buttons){ 
		    viewObjects.add(b); 
		}
		display = getProgress();
		round = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceLubna>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(display);
		viewObjects.add(round);

	}

	private MoveInterfaceLubna randomMove() {
		
		int bIndex = (int)(Math.random()*buttons.length);
		while(bIndex == lastSelectedButton) {
			bIndex = (int)(Math.random()*buttons.length);
		}
		return getMove(bIndex);
	}

	/**
	 *  Place Holder until partner finishes implementations of MoveInterface.
	 * @return
	 */
	private MoveInterfaceLubna getMove(int bIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *  Place Holder until partner finishes implementations of ProgressInterface.
	 * @return
	 */
	private ProgressInterfaceLubna getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numOfButtons = 6;
		buttons = new ButtonInterfaceLubna[numOfButtons];
		Color buttonColors
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
