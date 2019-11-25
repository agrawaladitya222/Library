package library;
import javax.swing.*;
import BreezySwing.*;
public class Search extends GBDialog{
	public Search(JFrame parent) {
		super(parent);
		setTitle("Search For a Book");
		setSize(300,500);
		setVisible(true);
	}
	private JTextField searchbox = addTextField("",1,1,1,1);
	private JButton search = addButton("Search",2,1,1,1);
	private JTextArea results = addTextArea("",3,1,1,1);
	
	public void buttonClicked(JButton button) {
		if(button==search) {
			
		}
	}

}
