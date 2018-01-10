package myStuff;

import java.awt.Color;

import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenLubna extends ClickableScreen implements Runnable {

	private TextLabel round;
	private ButtonInterfaceLubna[] button;
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
		for(ButtonInterfaceLubna b: button){ 
			viewObjects.add(b); 
		}
		display = getProgress();
		round = new TextLabel(350,350,300,80,"Let's play Simon!");
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

		int sequenceIndex = (int)(Math.random()*button.length);
		while(sequenceIndex == lastSelectedButton) {
			sequenceIndex = (int)(Math.random()*button.length);
		}
		return getMove(sequenceIndex);
	}

	/**
	 *  Place Holder until partner finishes implementations of MoveInterface.
	 * @return
	 */
	private MoveInterfaceLubna getMove(int bIndex) {
		// TODO Auto-generated method stub
		return new MoveTyler(button[bIndex]);
	}

	/**
	 *  Place Holder until partner finishes implementations of ProgressInterface.
	 * @return
	 */
	private ProgressInterfaceLubna getProgress() {
		return new ProgressTyler(400,400,300,100);
	}

	private void addButtons() {
		int numOfButtons = 4;
		button = new ButtonInterfaceLubna[numOfButtons];
		Color[] buttonColors = {Color.blue, Color.red, Color.magenta, Color.green,};
		for(int i=0; i<numOfButtons; i++) {
			final ButtonInterfaceLubna b = getAButton();
			
			b.setColor(buttonColors[i]);
			double cx = b.getWidth() / 2;
			double cy = b.getHeight() / 2;
			double angle = (i * (2 * Math.PI)) / button.length;
		    double x = cx + 110.0 * Math.cos(angle);                
		    double y = cy + 110.0 * Math.sin(angle); 
		    b.setColor(buttonColors[i]); 
		    b.setX(200+x);
		    b.setY(200+y);
			b.setAction(new Action(){

				public void act(){
					if(acceptingInput) {
						Thread blink = new Thread(new Runnable(){

							public void run(){
								b.highlight();
								try {
									Thread.sleep(800);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								b.dim();
							}

						});
						blink.start();
						if( b == sequence.get(sequenceIndex).getAButton()) {
							sequenceIndex++;
						}
						else
							display.gameOver();
					}
					if(sequenceIndex == sequence.size()){ 
						Thread nextRound = new Thread(SimonScreenLubna.this); 
						nextRound.start(); 
					}
				}

			});
			button[i] = b;
		}
	}

	/**
	Placeholder until partner finishes implementation of ButtonInterface
	 */
	private ButtonInterfaceLubna getAButton() {

		return new ButtonTyler(0,0,40,40,"",Color.blue,null);
	}
	private void changeText(String s) {
		Thread blink = new Thread(new Runnable(){

			public void run(){
				round.setText(s);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		blink.start();
	}
	@Override
	public void run() {
		round.setText("");
		nextRound();

	}

	private void nextRound() {
		acceptingInput=false;
		roundNumber++;
		sequence.add(randomMove());
		display.setRound(roundNumber);
		display.setSequenceSize(sequence.size());
		changeText("Simon's turn");
		changeText("");
		playSequence();
		changeText("Your Turn");
		acceptingInput=true;
		sequenceIndex=0;
	}

	private void playSequence() {
		ButtonInterfaceLubna b=null;
		for(int i=0; i<sequence.size(); i++) {
			if(b!= null) {
				b.dim();
			}
				b=sequence.get(i).getAButton();
				b.highlight();
				int sleepTime =Math.abs((800-6*roundNumber));
						try {
							Thread.sleep(sleepTime);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
		b.dim();
			}
	}

