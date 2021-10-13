import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
//import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GPACalculator implements ActionListener
{
	private static JLabel courseNameLabel;
	private static JTextField courseNameInput;
	private static JLabel gradeLabel;
	private static JTextField[] gradeInput;
	private static JLabel creditsLabel;
	private static JTextField[] creditsInput;
	private static JLabel calculatedGPA;
	private static int counter;

	public static void main(String args[])
	{
		//CONSTRUCTING THE GUI
		JPanel panel = new JPanel(); // The frame within the frame 
		JFrame frame = new JFrame(); // THE ACTUAL WINDOW
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);

		int y;
		
		// COURSE NAME COLUMN
		courseNameLabel = new JLabel("Course Name ");
		courseNameLabel.setBounds(20, 20, 100, 25);
		panel.add(courseNameLabel);

		y = 45;
		for (counter = 1 ; counter <= 8 ; counter++)
		{
		courseNameInput = new JTextField();
		courseNameInput.setBounds(20, y, 150, 25);
		panel.add(courseNameInput);
		y += 30;
		}
		
		// GRADE COLUMN
		gradeLabel = new JLabel("Grade");
		gradeLabel.setBounds(200, 20, 100, 25);
		panel.add(gradeLabel);
		
		//String[] gradeTypes = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"};

		gradeInput = new JTextField[9];
		for (counter = 1 ; counter <= 8 ; counter++)
		{
			gradeInput[counter] = new JTextField();
			//gradeInput.setBounds(200, y, 150, 25);
			//panel.add(gradeInput);
			//y += 30;
		}

		y = 45;
		for (counter = 1 ; counter <= 8 ; counter++)
		{
			gradeInput[counter].setBounds(200, y, 150, 25);
			panel.add(gradeInput[counter]);
			y += 30;
		}

		/*
		for(int i = 0; i < panel.length; i++)
		{
		panel[i].setBounds(50, 50, i * 60, 100);
		}
		*/
		
		// CREDITS COLUMN
		creditsLabel = new JLabel("Credits");
		creditsLabel.setBounds(380, 20, 100, 25);
		panel.add(creditsLabel);

		creditsInput = new JTextField[9];
		for (counter = 1 ; counter <= 8 ; counter++)
		{
			creditsInput[counter] = new JTextField();
		}

		y = 45;
		for (counter = 1 ; counter <= 8 ; counter++)
		{
			creditsInput[counter].setBounds(380, y, 150, 25);
			panel.add(creditsInput[counter]);
			y += 30;
		}

		/*
		creditsLabel = new JLabel("Credits");
		creditsLabel.setBounds(380, 20, 100, 25);
		panel.add(creditsLabel);
		
		y = 45;
		for (counter = 1 ; counter <= 8 ; counter++)
		{
		creditsInput = new JTextField();
		creditsInput.setBounds(380, y, 150, 25);
		panel.add(creditsInput);
		y += 30;
		}
		*/

		
		/*
		// COURSE TYPE COLUMN
		JLabel courseTypeLabel = new JLabel("Course Type");
		courseTypeLabel.setBounds(560, 20, 100, 25);
		panel.add(courseTypeLabel);
		
		String[] courseTypes = {"Regular", "AP"};

		y = 45;
		for (counter = 1 ; counter <= 8 ; counter++)
		{
		JComboBox courseTypeInput = new JComboBox(courseTypes);
		courseTypeInput.setBounds(560, y, 150, 25);
		panel.add(courseTypeInput);
		y += 30;
		}
		*/

		// CALCULATE GPA BUTTON
		JButton button = new JButton("Calculate GPA!");
		button.setBounds(380, 300, 150, 25);
		//button.setBounds(560, 300, 150, 25);
		button.addActionListener(new GPACalculator());
		panel.add(button);

		// CALCULATED GPA LABEL
		calculatedGPA = new JLabel("");
		calculatedGPA.setBounds(20, 320, 300, 25);
		panel.add(calculatedGPA);
		
		frame.setVisible(true);
		// classPoint = gradeValue * credits
		/* gradeValue > 
		* A+ 4.00 4.50
		*/
		// weightedGradeValue > 
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//int counter1;
		double GPADouble;
		String GPAString;
		
		// ADDING UP ALL POINTS
		String gradesString;
		double gradesDouble = 0, totalGradePoints = 0;
		for (counter = 1 ; counter <= 8 ; counter++)
		{
			gradesString = gradeInput[counter].getText();
			switch (gradesString)
			{
				case "A+" : 
					gradesDouble = 4.00;
					break;
				case "A" :
					gradesDouble = 4.00;
					break;
				case "A-" :
					gradesDouble = 3.67;
					break;
				case "B+" :
					gradesDouble = 3.33;
					break;
				case "B" :
					gradesDouble = 3.00;
					break;
				case "B-" :
					gradesDouble = 2.67;
					break;
				case "C+" :
					gradesDouble = 2.33;
					break;
				case "C" :
					gradesDouble = 2.00;
					break;
				case "C-" :
					gradesDouble = 1.67;
					break;
				case "D+" :
					gradesDouble = 1.33;
					break;
				case "D" :
					gradesDouble = 1.00;
					break;
				case "D-" :
					gradesDouble = 0.67;
					break;
				case "F" :
					gradesDouble = 0.00;
					break;
				default :
					System.out.println("Error. Please try again.");
					break;
				
			}
			totalGradePoints += gradesDouble;
		}
		
		// ADDING UP ALL CREDITS
		String creditsString;
		int creditsInt, totalCredits = 0;
		for (counter = 1 ; counter <= 8 ; counter++)
		{
			creditsString = creditsInput[counter].getText();
			creditsInt = Integer.parseInt(creditsString);
			totalCredits += creditsInt;
		}

		GPADouble = totalGradePoints/totalCredits;
		GPAString = Double.toString(GPADouble);
		calculatedGPA.setText(GPAString);
	}
}