package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obediant_Robot {
	static Robot rob = new Robot();

	public static void main(String[] args) {

		rob.show();
		rob.penDown();
		rob.setSpeed(100);
		String input = JOptionPane.showInputDialog(null, "1 for square, 2 for triangle, and 3 for circle");
		if (input.equals("1")) {
			String color = JOptionPane.showInputDialog(null, "a for red, b for blue");
			if (color.equals("a")) {
				rob.setPenColor(255, 0,0);
			}
			else {
				rob.setPenColor(0, 0, 255);
			}
			drawSquare();
		}
		else if (input.equahttps://github.com/League-Level0-Student/level-0-module-5-samarthkaashyap.gitls("2")) {
			String color2 = JOptionPane.showInputDialog(null, "a for red, b for blue");
			if (color2.equals("a")) {
				rob.setPenColor(255, 0, 0);
			}
			else {
				rob.setPenColor(0, 0, 255);
			}
			drawTriangle();
		}
		else {
			String color3 = JOptionPane.showInputDialog(null, "a for red, b for blue");
			if (color3.equals("a")) {
				rob.setPenColor(255, 0, 0);
			}
			else {
				rob.setPenColor(0, 0, 255);
			}
			drawCircle();
		}
		

	}

	public static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.move(90);
			rob.turn(90);
		}
	}
	public static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			rob.move(90);
			rob.turn(120);
		}
	}
	public static void drawCircle() {
		for (int i = 0; i<360; i++) {
			rob.move(1);
			rob.turn(1);
		}
	}

}
