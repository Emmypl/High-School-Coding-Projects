import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class CryptoConverter 
{	
	public static void main(String[] args)
	{
		JPanel panel = new JPanel(); 	// The "stage".
		JFrame frame = new JFrame(); 	// The "scene".
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);

		JLabel amountLabel = new JLabel("Amount");	// "AMOUNT" COLUMN START
		amountLabel.setBounds(20, 20, 100, 25);
		panel.add(amountLabel);

		JTextField amountTextField = new JTextField();
		amountTextField.setBounds(20, 45, 100, 25);
		panel.add(amountTextField);

		JLabel fromLabel = new JLabel("From");		// "FROM" COLUMN START
		fromLabel.setBounds(150, 20, 100, 25);
		panel.add(fromLabel);

		JTextField fromTextField = new JTextField();
		fromTextField.setBounds(150, 45, 100, 25);
		panel.add(fromTextField);
		
		JLabel toLabel = new JLabel("To");		// "TO" COLUMN START
		toLabel.setBounds(280, 20, 100, 25);
		panel.add(toLabel);	
		
		JTextField toTextField = new JTextField();
		toTextField.setBounds(280, 45, 100, 25);
		panel.add(toTextField);

		frame.setVisible(true);
	}
}
