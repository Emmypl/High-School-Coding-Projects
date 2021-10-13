import javax.swing.JFrame;
import javax.swing.JPanel;

public class CryptoConverter 
{
	/*
	public static void GUISetup()
	{	
	}
	*/
	
	public static void main(String[] args)
	{
		JPanel panel = new JPanel(); 	// The "stage".
		JFrame frame = new JFrame(); 	// The "scene".
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
	}
}
