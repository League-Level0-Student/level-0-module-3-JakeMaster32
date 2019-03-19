//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Jeff = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		for (int y = 0; y < 1000000; y++) {
			String x = JOptionPane
					.showInputDialog("What color would you like the robot to draw. Choices: red, blue, green, yellow");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (x.equals("red")) {
				Jeff.setPenColor(new Color(0xFF0000));
			} else if (x.equals("blue")) {
				Jeff.setPenColor(new Color(0x0039FF));
			} else if (x.equals("green")) {
				Jeff.setPenColor(new Color(0x47A02F));
			} else if (x.equals("yellow")) {
				Jeff.setPenColor(new Color(0xF4F50C));
			} else {
				Jeff.setRandomPenColor();
			}
			// 6. If the user doesn’t enter anything, choose a random color

			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10
			Jeff.setPenWidth(10);
			Jeff.setSpeed(30);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			Jeff.penDown();
			Jeff.move(100);
			Jeff.turn(90);
			Jeff.move(100);
			Jeff.turn(90);
			Jeff.move(100);
			Jeff.turn(90);
			Jeff.move(100);
			Jeff.turn(90);
		}
	}
}
