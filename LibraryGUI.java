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
			inputDIE.setVisible(true);
		}
		if(button==outputall) {
			
		}
		if(button==search) {
			
		}
		if(button==loanout) {
			
		}
		if(button==returnbook) {
			
		}
		if(button==outputloaned) {
			
		}
		if(button==outputoverdue) {
			
		}
	}
	

}
