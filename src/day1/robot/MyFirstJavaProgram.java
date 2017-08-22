package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		System.out.println("Hello world!");
		Robot bot = new Robot("mini");
		bot.setWindowColor(Color.blue);
		bot.penDown();
		bot.move(70);
		bot.setPenColor(0, 255, 0);
		bot.turn(90);
		bot.setPenColor(700, 800, 200);
		bot.move(70);
		bot.turn(90);
		bot.setPenColor(2, 600, 2);
		bot.move(70);
		bot.turn(90);
		bot.setPenColor(300, 500, 4);
		bot.move(70);
	}
}
