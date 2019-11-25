package library;
import javax.swing.*;
import BreezySwing.*;

public class InputBook extends GBDialog {
	JLabel titlelabel = addLabel("Title:",1,1,1,1);
	JTextField titlebox = addTextField("",1,2,1,1);
	JLabel authorlabel = addLabel("Author:",2,1,1,1);
	JTextField authorbox = addTextField("",2,2,1,1);
	JButton input = addButton("Input Book",3,1,1,1);
	
	public InputBook(JFrame parent) {
		super(parent);
		setTitle("Input Book");
		setSize(500,200);
		setVisible(true);
	}

	public void buttonClicked(JButton button) {
		if(button == input) {
			LibraryGUI.l.enterbook(titlebox.getText(),authorbox.getText());
			
			
		}
	}

}
