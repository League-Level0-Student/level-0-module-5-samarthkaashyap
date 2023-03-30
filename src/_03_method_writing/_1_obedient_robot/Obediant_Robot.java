package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Obediant_Robot {
	static Robot rob = new Robot();

	public static void main(String[] args) {

		rob.show();
		rob.penDown();
		rob.setSpeed(20);
		

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

}
