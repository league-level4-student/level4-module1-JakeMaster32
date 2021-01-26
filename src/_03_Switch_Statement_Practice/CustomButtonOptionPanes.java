package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];

		// use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Last day of the weekend");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "First day of the week");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Second day of the week");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Third day of the week. Middle of the week AKA Hump Day");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Fourth day of the week");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Last day of the week. Start of the weekend");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Middle of the weekend");
			break;

		}

	}
}
