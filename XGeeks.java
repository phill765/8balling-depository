package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String Ryland = "Ryland will Fly";
		String Nicholas = "Nicholas is gonna do the Mind Reading";
		String Cameron = "Cameron is gonna teleport";
		String Joseph = "Joseph is gonna be The Doctor and time travel";
		String Dave = "Dave gonna build a uuuuuuuuuuuuuuge wall";
		String Colin = "Colin gonna get the power to have ideas";
		String George = "George gonna get Morphin";
		String Dat_Boi = "oh sh*t what up???";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String answer = JOptionPane.showInputDialog("Enter ye name");
		if (answer.equals("George")) {
			JOptionPane.showMessageDialog(null, George);
		}
		if (answer.equals("Ryland")) {
			JOptionPane.showMessageDialog(null, Ryland);
		}
		if (answer.equals("Nicholas")) {
			JOptionPane.showMessageDialog(null, Nicholas);
		}
			if (answer.equals("Cameron")) {
				JOptionPane.showMessageDialog(null, Cameron);
			}
				if (answer.equals("Joseph")) {
					JOptionPane.showMessageDialog(null, Joseph);
				}
					if (answer.equals("Dave")) {
						JOptionPane.showMessageDialog(null, Dave);
					}
						if (answer.equals("Colin")) {
							JOptionPane.showMessageDialog(null, Colin);
						}
							if (answer.equals("Dat_Boi")) {
								JOptionPane.showMessageDialog(null, Dat_Boi);
							}
						
					
				
			
		
	}
}

// 3. Show the superpower in a pop-up, depending on the name entered.
