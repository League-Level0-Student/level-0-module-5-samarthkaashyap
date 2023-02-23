package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {

public static void main(String[] args) {

	String input = JOptionPane.showInputDialog(null, "Give number?");
	int num = Integer.parseInt(input);
	for(int x = 2; x<Math.sqrt(num); x++) {
		if (num % x == 0) {
			JOptionPane.showMessageDialog(null, "It is not prime");
		System.exit(0);
		}
		
		
	}
	JOptionPane.showMessageDialog(null, "It is prime");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	

	
}
