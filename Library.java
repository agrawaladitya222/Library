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
		
		
	}
	
	public String getAllBooks() {
		String output = "";
		
		
		for(int i=0; i<title.size(); i++) {
			output =output + title.get(i) + "\tby " + author.get(i) + "\n";
		}
	
		return output;
	}
	
	public String search(String a) {
		String output="";
		for(int i=0; i<title.size(); i++) {
			if(a.equalsIgnoreCase(title.get(i))) {
				output = output + title.get(i) + "\tby " + author.get(i) + "\n";
				
				if(borrower.get(i) == null) {
					output = output + "Currently in Library\n";
				}else {
					output = output + "Borrower: " + borrower.get(i) + "\tDate Borrowed: " + dateborrowed.get(i) + "\n";
				}
				
			}
		}
		
		return output;
	}
}
