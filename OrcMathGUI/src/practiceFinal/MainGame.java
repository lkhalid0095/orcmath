package practiceFinal;

import guiTeacher.GUIApplication;

public class MainGame extends GUIApplication {

	private GameScreen screen;
	public static MainGame  game;
	public MainGame(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		screen = new GameScreen(getWidth(),getHeight());
		setScreen(screen);

	}

	public static void main(String[] args) {
		game = new MainGame(800,600);
		Thread runner = new Thread(game);
		runner.start();

	}

}
