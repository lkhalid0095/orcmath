package myStuff;

import guiTeacher.GUIApplication;

public class SimonGameLubna extends GUIApplication {

	public SimonGameLubna(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		SimonScreenLubna screen = new SimonScreenLubna(getWidth(),getHeight());
		setScreen(screen);

	}

	public static void main(String[] args) {
		SimonGameLubna s = new SimonGameLubna(800,600);
		Thread runner = new Thread(s);
		runner.start();

	}

}
