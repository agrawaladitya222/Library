package library;
import javax.swing.*;
import BreezySwing.*;
public class OutputAll extends GBDialog{
	public OutputAll(JFrame parent) {
		super(parent);
		setTitle("Books in Library");
		setSize(300,500);
		setVisible(true);
	}
	JTextArea output = addTextArea(LibraryGUI.l.getAllBooks(),1,1,1,1);

}
