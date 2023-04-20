package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	static int happiness = 0;
	static String pet = "";
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		pet = JOptionPane.showInputDialog(null, "What pet do u want? Dog, Fish, Cat");
		

		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		while (happiness<5) {
			
		
			int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Pet", "Play" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			if (task ==0) {
				Feed_Pet();
			}
			if (task==1) {
				Pet_Pet();
			}
			if (task ==2) {
				Play_Pet();
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
		JOptionPane.showMessageDialog(null, "You love the pet, take them home.");
	}

	static // 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	void Feed_Pet() {
		happiness = happiness + 1;
		if (pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "purr");
		}
		if (pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "bark");
		}
		if (pet.equals("fish")) {
			JOptionPane.showMessageDialog(null, "glug");
		}
	}
	static void Pet_Pet() {
		if (pet.equals("cat")) {
			happiness = happiness + 1;
			JOptionPane.showMessageDialog(null, "purr");
		}
		if (pet.equals("dog")) {
			happiness = happiness +1;
			JOptionPane.showMessageDialog(null, "bark");
		}
		if (pet.equals("fish")) {
			happiness = happiness - 1;
			JOptionPane.showMessageDialog(null, "dissaproving glug");
		}
	}
	static void Play_Pet() {
		if (pet.equals("dog")) {
			happiness = happiness +1;
			JOptionPane.showMessageDialog(null, "bark");
		}
		if (pet.equals("cat")) {
			happiness = happiness - 1;
			JOptionPane.showMessageDialog(null, "dissaproving purr");
		}
		if (pet.equals("fish")) {
			happiness = happiness - 1;
			JOptionPane.showMessageDialog(null, "dissaproving glug");
		}
	}
}