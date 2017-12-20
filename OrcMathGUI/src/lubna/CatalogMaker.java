package lubna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.orcmath.drawabletype.Template;

public class CatalogMaker {

	private ArrayList <Books> booksList ;
	private  String[] temp = {"title" , "author", "genre", "page"};
	public CatalogMaker() {

		booksList = new ArrayList<Books>();
		booksList.add(new Books("Carry On", " Rainbow Rowell", " Contemporary ", 400) );
		booksList.add(new Books("Throne of Glass", " Sarah J. Mass", " Science Fiction ", 223) );
		booksList.add(new Books("Six of Crows", " Leigh Bardugo", " Adventure ", 400) );


	}

	public static void main(String[] args) {
		CatalogMaker maker = new CatalogMaker();
		
		maker.addResponse();
		System.out.println(maker.getCSVContent());


	}
	private  void addResponse() {
		Scanner in = new Scanner(System.in);
		boolean questions = true;
		while(questions) {
			
			String[] response = new String[4];
			for(int i =0; i<  temp.length; i++) {

					System.out.println("What is the "+ temp[i]+" of the booK?");

					response[i] = in.nextLine(); 
			}
			booksList.add(new Books(response[0],response[1],response[2],Integer.parseInt(response[3])));
			questions = false;
			
		}

	}

	public String getCSVContent() {
		String data = "";
		for(Books b: booksList) {
			data = data + b + "\n" + "\n";
		}
		return data;
	}
}