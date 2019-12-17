package _10_happy_pet;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What name of a pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 3; i++) {
			
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make " + pet + " happy?", "Pet Groomer", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Pet", "Walk", "Food" }, null);
			
			// 5. Use user input to call the appropriate method created in step 4.
			if(task==0) {
				pet();
			} else if(task==1) {
				walk();
			} else if(task==2) {
				food();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (happinessLevel >= 100) {
				JOptionPane.showMessageDialog(null, "you love " + pet);
				break;
			}
		}
		}
	


	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void pet() {
		JOptionPane.showMessageDialog(null, "you have pet your pet.");
		happinessLevel = happinessLevel + 34;
	}
	static void walk() {
		JOptionPane.showMessageDialog(null, "you have walked your pet.");
		happinessLevel = happinessLevel + 36;
	}
	static void food() {
		JOptionPane.showMessageDialog(null, "you have fed your pet.");
		happinessLevel = happinessLevel + 39;
	}
	}
