package lubna;

import java.util.List;

import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {

	private TextField descriptionBox;
	private TextField name;
	private TextField author;
	private TextField genre;
	private TextField page;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		descriptionBox = new TextField(40, 40, 200, 30,"Enter Text Here. ","Description");
		viewObjects.add(descriptionBox);
		name = new TextField(40, 40, 250, 80,"Enter the name of the book here. ","Description");
		viewObjects.add(name);
		author = new TextField(40, 40, 300, 130,"Enter the name of the author here.","Description");
		viewObjects.add(author);
		genre = new TextField(40, 40, 230, 180,"Enter the genre here. ","Description");
		viewObjects.add(genre);
		page = new TextField(40, 40, 240, 0,"Enter the page number here.","Description");
		viewObjects.add(page);
		

	}

}
