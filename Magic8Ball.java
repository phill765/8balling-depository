package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

    // 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
    // 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int x = new Random().nextInt(9);
    // 3. Print out this variable
System.out.println(x);
    // 4. Get the user to enter a question for the 8 ball
String answer = JOptionPane.showInputDialog("ask a question to the all knowing 8 ball");
    // 5. If the random number is 0
if (x==0){
	JOptionPane.showMessageDialog(null,"Yes");
}
    // -- tell the user "Yes"

    // 6. If the random number is 1
else if (x==1){
	JOptionPane.showMessageDialog(null, "No");
}
    // -- tell the user "No"

    // 7. If the random number is 2

    // -- tell the user "Maybe you should ask Google?"

    // 8. If the random number is 3

    // -- write your own answer

}
}