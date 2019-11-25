package library;

import javax.swing.*;
import BreezySwing.*;

public class LibraryGUI extends GBFrame {
	
	private JButton inputbook;
	private JButton outputall;
	private JButton search;
	private JButton loanout;
	private JButton returnbook;
	private JButton outputloaned;
	private JButton outputoverdue;
	public static Library l  = new Library();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame gui = new LibraryGUI();
		gui.setTitle("Library Home Page");
		gui.setVisible(true);
		gui.setSize(800,400);
	}
	
	public LibraryGUI() {
		inputbook = addButton("Input Book",1,1,1,1);
		outputall = addButton("Display Books",1,2,1,1);
		search = addButton("Search",2,1,1,1);
		loanout = addButton("Loan Out", 2,2,1,1);
		returnbook = addButton("Return Book",3,1,1,1);
		outputloaned = addButton("Display Borrowed",3,2,1,1);
		outputoverdue = addButton("Display Overdue",4,1,1,1);
	}
	
	public void buttonClicked(JButton button) {
		if(button==inputbook) {
			InputBook inputDIE = new InputBook(this);
		}else if(button==outputall) {
			OutputAll outputallDIE = new OutputAll(this);
		}else if(button==search) {
			Search searchDIE = new Search(this);
		}else if(button==loanout) {
			LoanOut loanoutDIE = new LoanOut(this);
		}else if(button==returnbook) {
			ReturnBook returnbookDIE = new ReturnBook(this);
		}else if(button==outputloaned) {
			OutputLoaned outputloanedDIE = new OutputLoaned(this);
		}else if(button==outputoverdue) {
			OutputOverdue outputoverdueDIE = new OutputOverdue(this);
		}
	}
	

}
