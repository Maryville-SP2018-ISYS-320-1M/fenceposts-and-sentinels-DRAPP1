
/*
ISYS 320 DONE DONE DONE DONE DONE DONE
	Name(s): Dave Rapp
	Date: 4-18-18
*/

import java.util.Scanner;

public class P1_FindMinAndMax {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int SENTINEL = -1;
		System.out.print("Type a number (or " + SENTINEL + " to stop): ");

		int input = console.nextInt();
		int min = input;
		int max = input;
		while (input != SENTINEL) {
			if (input < min) {
				min = input;
			} else if (input > max) {
				max = input;
			}

			System.out.print("Type a number (or " + SENTINEL + " to stop): ");
			input = console.nextInt();
		}

		if (min != SENTINEL) {
			System.out.println("Maximum was " + max);
			System.out.println("Minimum was " + min);
		}
	}

}
