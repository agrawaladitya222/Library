package library;
import java.util.*;

public class Library {
	private ArrayList<String> title = new ArrayList<String>();
	private ArrayList<String> author = new ArrayList<String>();
	private ArrayList<String> borrower = new ArrayList<String>();
	private ArrayList<String> dateborrowed = new ArrayList<String>();
	
	public Library() {
		
	}
	
	public void enterbook(String a, String b) {
		title.add(a);
		author.add(b);
		borrower.add(null);
		dateborrowed.add(null);
		//System.out.println(title);
	//	System.out.println(author);
		
	}
	
	public String getAllBooks() {
		String output = "";
		
		//System.out.println(title);
		//System.out.println(title.size());
		
		for(int i=0; i<title.size(); i++) {
			output =output + title.get(i) + "\tby " + author.get(i) + "\n";
		}
		//System.out.println(output);
		return output;
	}
}
