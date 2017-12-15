package newpackage;

import java.util.ArrayList;
import java.util.Collections;

public class CatalogMaker {

	private ArrayList <Books> booksList ;
	public CatalogMaker() {
		
		booksList = new ArrayList<Books>();
		booksList.add(new Books("Carry On", " Rainbow Rowell", " Contemporary ", 400) );
		booksList.add(new Books("Throne of Glass", " Sarah J. Mass", " Science Fiction ", 223) );
		booksList.add(new Books("Six of Crows", " Leigh Bardugo", " Adventure ", 400) );
	}
	
	public static void main(String[] args) {
		CatalogMaker maker = new CatalogMaker();
		System.out.println(maker.getCSVContent());

	}
	public String getCSVContent() {
		String data = "";
		for(Books b: booksList) {
			data = data + b + "\n" + "\n";
		}
		return data;
	}

}
