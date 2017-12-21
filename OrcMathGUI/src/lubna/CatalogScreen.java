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
		text = new TextArea(500, 40, 100, 100, "This is where the text goes.");
		viewObjects.add(text);
		addButton = new Button(40,300,40,40, "Add",new Action() {
		
			@Override
			public void act() {
				addClick("Add Button Clicked");
				
			}
		});
		viewObjects.add(addButton);
		deleteButton = new Button(40,350,50,50, "Delete" ,new Action() {
			
			@Override
			public void act() {
				
				deleteClick("Delete Button Clicked");
				
			}
		});
		viewObjects.add(deleteButton);
		saveButton = new Button(40,400,40,40, "Save",new Action() {
			
			@Override
			public void act() {
				saveClick("Save Button Clicked");
				
			}
		});
		viewObjects.add(saveButton);
		loadButton = new Button(40,450,40,40, "Load",new Action() {
			
			@Override
			public void act() {
				loadClick("Load Button Clicked");
				
			}
		});
		viewObjects.add(loadButton);
		openButton = new FileOpenButton(40,500,60,60, null,this);
		viewObjects.add(openButton);
		}
	
	protected void loadClick(String string) {
		text.setText(string);
		
	}
	
	protected void deleteClick(String string) {
		text.setText(string);
		
	}

	protected void saveClick(String string) {
		text.setText(string);
		
	}

	protected void addClick(String s) {
		Book b = new Book(name.getText(),author.getText(),Integer.parseInt(page.getText()));
		books.addBook(b);
		text.setText(s);
		list.setText(catalog.getCSVContent());
		name.setText("");
		author.setText("");
		page.setText("");
		
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
