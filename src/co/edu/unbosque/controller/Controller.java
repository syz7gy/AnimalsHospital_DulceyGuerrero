package co.edu.unbosque.controller;

import co.edu.unbosque.model.AnimalDTO;
import co.edu.unbosque.model.persistance.AnimalDAO;
import co.edu.unbosque.util.StackImpl;
import co.edu.unbosque.view.Console;

public class Controller {

	private AnimalDAO adao;
	private Console con;
	private StackImpl<Integer> availableBlankets;

	public Controller() {
		adao = new AnimalDAO();
		con = new Console();
		availableBlankets = new StackImpl<Integer>();

		con.println("Welcome to the Animals' Hospital of Juanpilin and Paulita");
		con.println(" ");
		con.println("Please type down the number of blankets in stack:");
		int blankets = con.nextInt();

		for (int i = 0; i < blankets; i++) {
			availableBlankets.push(i);
		}

		run();
	}

	public void run() {
		con.println("");
		con.println("**** MENU ****");
		con.println("");
		con.println("Available blankets: " + availableBlankets.size());
		con.println("Animals in queue: " + adao.size());
		con.println("\nSelect one option: ");
		con.println("1) Enqueue new animal \n2) Dequeue animals \n3) Show animals in queue \n4) Exit");

		int selection = con.nextInt();

		switch (selection) {
		case 1: {
			con.println("\nComplete the info below");
			con.println("");

			con.println("Animal's name: ");
			String name = con.next();
			con.println("Species:");
			String species = con.next();
			con.println("Age:");
			int age = con.nextInt();

			AnimalDTO animal = new AnimalDTO(name, species, age);
			adao.create(animal);
			con.println("Animal successfully enqueued");
			break;
		}
		case 2: {
			con.println("\nStart checking on the animals in queue? yes/no");
			String a = con.next();
			boolean ans = (a.equalsIgnoreCase("yes") ? true : false);

			if (ans) {
				if (adao.size() <= availableBlankets.size()) {
					for (int i = 0; i <= adao.size(); i++) {
						adao.delete();
						availableBlankets.pop();
					}
					con.println("\nAll animals have been attended! Thanks for your trust.");
					con.println("Available blankets: " + availableBlankets.size());
				} else if (adao.size() > availableBlankets.size()) {
					con.println("\nExcuse us, but only " + availableBlankets.size()
					+ " animals could be attended. There aren't any other blankets left in stack.");
					for (int i = 0; i <= availableBlankets.size(); i++) {
						adao.delete();
						availableBlankets.pop();
					}
					con.println("The following animals could not be attended:");
					con.println("\n" + adao.read() + "\n");
				}
			} else {
				run();
			}
			break;
		}
		case 3: {
			con.println("\nThese are the animals in queue: ");
			System.out.println("\n" + adao.read() + "\n");;
			break;
		}

		case 4: {
			con.println("\nThanks for using our service :D");
			System.exit(0);
		}
		}
		if (selection != 4) {
			run();
		}
	}
}
