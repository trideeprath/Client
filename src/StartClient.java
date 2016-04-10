import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;


public class StartClient {

	public static void main(String args[]){
		UserInterface ui = new UserInterface();
		JTextArea ta = ui.textArea;
		JScrollPane sp = new JScrollPane(ta); 
		sp.setBounds(10,300,500,300);
		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		ui.getContentPane().add(sp);
		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ui.setSize(600,800);
		ui.setVisible(true);
	}
}
