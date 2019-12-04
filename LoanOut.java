package library;
import javax.swing.*;
import BreezySwing.*;
public class LoanOut extends GBDialog{
	public LoanOut(JFrame parent) {
		super(parent);
		setTitle("Loan Out");
		setSize(500,700);
		setVisible(true);
		borrowernamebox.setEnabled(false);
		datebox.setEnabled(false);
		loanout.setEnabled(false);
	}
	
	private JLabel titlelab = addLabel("Title:",1,1,1,1);
	private JTextField titlebox = addTextField("",1,2,1,1);
	private JLabel authorlab = addLabel("Author:",2,1,1,1);
	private JTextField authorbox = addTextField("",2,2,1,1);
	private JLabel borrowernamelab = addLabel("Borrower name:",4,1,1,1);
	private JTextField borrowernamebox = addTextField("",4,2,1,1);
	private JLabel datelab = addLabel("Date:",5,1,1,1);
	private JTextField datebox = addTextField("",5,2,1,1);
	private JButton search = addButton("Search",3,1,1,1);
	private JButton loanout = addButton("Loan Out", 6,1,1,1);
	private JButton reset = addButton("Reset",6,2,1,1);
	
	public void buttonClicked(JButton button) {
		if(button == search) {
			if(!LibraryGUI.l.checkLoaned(titlebox.getText(), authorbox.getText())){
				borrowernamebox.setEnabled(true);
				datebox.setEnabled(true);
				search.setEnabled(false);
				titlebox.setEditable(false);
				authorbox.setEditable(false);	
				loanout.setEnabled(true);
			}
		}
		if(button == loanout) {
			String nothing="";
			if(!nothing.equals(borrowernamebox.getText()) && !nothing.equals(datebox.getText())) {
				LibraryGUI.l.loanBook(titlebox.getText(), authorbox.getText(), borrowernamebox.getText(), datebox.getText());
				messageBox(titlebox.getText() + "by " + authorbox.getText() + " has been loaned out to " + borrowernamebox.getText());
			}
		}
		if(button == reset) {
			borrowernamebox.setEnabled(false);
			datebox.setEnabled(false);
			search.setEnabled(true);
			titlebox.setEditable(true);
			authorbox.setEditable(true);
			loanout.setEnabled(false);
			borrowernamebox.setText("");
			datebox.setText("");
			titlebox.setText("");
			authorbox.setText("");
			
		}
	}
}