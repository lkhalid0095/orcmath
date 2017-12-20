package lubna;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen implements FileRequester {

	private TextField descriptionBox;
	private TextField name;
	private TextField author;
	private TextField page;
	private TextArea text;
	private Button addButton;
	private Button deleteButton;
	private Button saveButton;
	private Button loadButton;
	private CatalogMaker books;
	private FileOpenButton openButton;
	/*file open button*/
	public CatalogScreen(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		descriptionBox = new TextField(40, 50, 200, 30,"Enter Text Here. ","Description");
		viewObjects.add(descriptionBox);
		name = new TextField(40, 120, 200, 30,"Enter the name of the book here. ","Description");
		viewObjects.add(name);
		author = new TextField(40, 190, 200, 30,"Enter the name of the author here.","Description");
		viewObjects.add(author);
		page = new TextField(40, 250, 200, 30,"Enter the page number here.","Description");
		page.setInputType(TextField.INPUT_TYPE_NUMERIC);
		viewObjects.add(page);
		text = new TextArea(500, 40, 200, 30, "This is where the text goes.");
		viewObjects.add(text);
		addButton = new Button(40,400,100,30, "Add",new Action() {
		
			@Override
			public void act() {
				addClick();
				
			}
		});
		viewObjects.add(addButton);
		deleteButton = new Button(40,400,100,30, "Delete",new Action() {
			
			@Override
			public void act() {
				
				addClick();
				
			}
		});
		viewObjects.add(deleteButton);
		saveButton = new Button(40,500,100,30, "Save",new Action() {
			
			@Override
			public void act() {
				addClick();
				
			}
		});
		viewObjects.add(saveButton);
		loadButton = new Button(40,700,100,30, "Load",new Action() {
			
			@Override
			public void act() {
				addClick();
				
			}
		});
		viewObjects.add(loadButton);
		openButton = new FileOpenButton(40,900,100,30, null,this);
		viewObjects.add(openButton);
		}
		
	
	//openButton = new FileOpenButton(48,280,200,30,null,this);

	protected void addClick() {
		Book b = new Book(name.getText(),author.getText(),Integer.parseInt(page.getText()));
		books.addBook(b);
		text.setText("Add Button Clicked.");
		Book(name.setText(""), author.setText("");)
		
	}

	@Override
	public void setFile(File f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JFrame getWindow() {
		// TODO Auto-generated method stub
		return null;
	}

}
