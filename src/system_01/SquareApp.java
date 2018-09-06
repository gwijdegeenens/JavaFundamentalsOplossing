package system_01;

import java.io.*;

public class SquareApp {
	public static void main(String[] args) {
		BufferedReader keyboard = new BufferedReader(
				new InputStreamReader(System.in));
		boolean repeat;
		do {
			repeat = false;
			System.out.print("Enter a number: ");
			try {
				String text = keyboard.readLine();
				int number = Integer.parseInt(text);
				System.out.println("The square of " + number
						+ " is " + number * number);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid number");
				repeat = true;
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				ex.printStackTrace(System.out);
			}
		} while (repeat);
	}
}
