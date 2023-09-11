package co.edu.unbosque.controller;

import co.edu.unbosque.model.AnimalDTO;
import co.edu.unbosque.view.Console;

public class Controller {

	private AnimalDTO adto;
	private Console con;

	public Controller() {
		adto = new AnimalDTO();
		con = new Console();
		run();
	}

	public void run() {

		con.println("Welcome to the Animals Hospital of Juanpilin and Paulita");
		con.println(" ");
		con.println("**** MENU ****");
		con.println("\nSelect one option: ");
		con.println("1) Add new animal \n2) Delete animal \n3) Exit");

		int selection = con.nextInt();

		switch (selection) {
		case 1: {
			con.println("Complete the info belong");

			con.println("Animals name: ");
			String name = con.next();

			con.println("Arrival time: ");
			int arrivalTime = con.nextInt();

			con.println("The animal already have a blanket? yes/no");
			boolean blanket = con.nextBoolean();

			con.println("Animal successfully added");
			break;
		}
		case 2: {
			con.println("Want to delete an animal? yes/no");
			String a = con.next();
			boolean ans = (a.equalsIgnoreCase("yes") ? true : false);

			if (ans) {
				con.println("Type the position of the animal");
				int n = con.nextInt();

				con.println("Successfully deleted");
				
			} else {
				run();
			}
			break;
		}

		case 3: {
			con.println("Thanks for using our service :D");
			System.exit(0);
		}
		}
	}
}
