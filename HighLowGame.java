import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
public static void main(String[] args) {
	int randomn = new Random().nextInt(101);
	String answer = JOptionPane.showInputDialog(null, "Im thinking of a number betweem 1-100, what is it?");
	int ans =  Integer.parseInt(answer);
	for (int i = 0; ans!=randomn; i++) {
		ans =  Integer.parseInt(answer);
	
if(ans>randomn){
	answer = JOptionPane.showInputDialog(null, "the number is lower, try again");
}
else if(ans<randomn){
	answer = JOptionPane.showInputDialog(null, "the number is higher, try again");
}
else if(ans==randomn){
	JOptionPane.showMessageDialog(null, "YOU GOT THE NUMBER MY DUDE!!!");
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}