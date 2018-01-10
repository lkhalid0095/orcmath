package myStuff;

import guiTeacher.GUIApplication;

public class SimonGameLubna extends GUIApplication {

	public static SimonGameLubna game;
	public static SimonScreenLubna screen;
	public SimonGameLubna(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		screen = new SimonScreenLubna(getWidth(),getHeight());
		setScreen(screen);

	}

	public static void main(String[] args) {
		game = new SimonGameLubna(800,550);
		Thread runner = new Thread(game);
		runner.start();

	}

}
