package console;

import java.util.Scanner;

public class Main {

	public void pruebas() {
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consoleIn = new ConsoleInput(keyboard);
		System.out.println(consoleIn.readBooleanUsingChar('s', 'n'));

	}

	public static void main(String[] args) {
		new Main().pruebas();
	}

}
