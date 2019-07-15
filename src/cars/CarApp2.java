package cars;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {
		int count = 1;
		int count1 = 1;
		int count2 = 1;
		String userInput2 = "";
		Scanner scnr = new Scanner(System.in);
		ArrayList<UsedCar> carsList = new ArrayList<>();
		ArrayList<Double> MileageList = new ArrayList<>();
        carsList.add(new UsedCar("Hyonda", "prior", 2015, 14795.50, 35987.6));
		carsList.add(new UsedCar("GC","Chirpus", 2013, 8500.00, 12345.50));
		carsList.add(new UsedCar("GC", "Witherell", 2016, 14450.90, 3500.40));
		carsList.add(new UsedCar("Cadilac", "C3", 1998, 9803.45, 12345.56));
		carsList.add(new UsedCar("Toyota", "Corolla", 2010, 9900.11, 23451.34));
		carsList.add(new UsedCar("Honda", "Civic", 2011, 2316.44, 98723.12));
		try {
			do {
				for (UsedCar u : carsList) {

					if (u.getMileage() > 0.0) {
						System.out.printf(count + " %-8s %-8s %-8d $%-8.2f (Used)%-8.2f miles \n", u.getMake(),
								u.getModel(), u.getYear(), u.getPrice(), u.getMileage());
						MileageList.add(u.getMileage());

					} else {
						System.out.printf(count + " %-8s %-8s %-8d %-8.2f %-8.2f\n", u.getMake(), u.getModel(),
								u.getYear(),u.getPrice(),u.getMileage());
						MileageList.add(u.getMileage());
					}
					count++;

				}
				System.out.println(count + " Quit");

				System.out.println("Which car would you like?");
				int userInput = scnr.nextInt();

				for (UsedCar i : carsList) {
					if (count1 == (userInput)) {
						if (i.getMileage() > 0.0) {
							System.out.printf(count1 + " %-8s %-8s %-8d %-8.2f (Used)%-8.2f miles \n", i.getMake(),
									i.getModel(), i.getYear(),i.getPrice(),i.getMileage());
;
							
						} else {
							System.out.printf(count1 + " %-8s %-8s %-8d %-8.2f %-8.2f\n", i.getMake(),
									i.getModel(),i.getYear(),i.getPrice(),i.getMileage());

						}
						break;
					}
					count1++;
				}

				System.out.println("Would you like to buy this car? y/n");
				String userInput1 = scnr.next();
				if (userInput1.equalsIgnoreCase("Y")) {
					carsList.remove(count1 - 1);

					System.out.println("Excellent! Our Finance department will be in touch shortly.");
					System.out.println();
					for (UsedCar k : carsList) {

						if (k.getMileage() > 0.0) {
							System.out.printf(count2 + " %-8s %-8s %-8d %-8.2f (Used)%-8.2f miles \n", k.getMake(),
									k.getModel(),k.getYear(),k.getPrice(),k.getMileage());

						} else {
							System.out.printf(count2 + " %-8s %-8s %-8d %-8.2f %-8.2f\n", k.getMake(),k.getModel(),
									k.getYear(),k.getPrice(),k.getMileage());
									

						}
						count2++;

					}
					System.out.println(count2 + " Quit");
				}
				System.out.println("Would you like shop more? y/n");
				userInput2 = scnr.next();
				count = 1;
				count1 = 1;
				count2 = 1;
			} while (userInput2.equalsIgnoreCase("y"));
			System.out.println("Have a great day");

		} catch (InputMismatchException ex) {
			System.out.println("The exception is " + ex);
		}
		scnr.close();
	}

	}


