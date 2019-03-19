//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();

	public static void main(String[] args) {

		// 2. Ask the user how dizzy you want the robot from 1-10, then spin that number
		// of times.
		String x = JOptionPane.showInputDialog("On a scale of 1-10, how dizzy do you want your robot to be?");
		// 1. Use the dance method to make the robot spin.
		int y = Integer.parseInt(x);
		robot.setSpeed(10);
		dance(y);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}
