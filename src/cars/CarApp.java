package cars;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
	
		  Scanner scnr = new Scanner(System.in);
		  
		  System.out.println("Welcome to the Grand Circus Motors admin console! \n");
		  int UserInput = 0;
		  
		  System.out.println("How many cars are you entering : ");
		  UserInput = scnr.nextInt();
		  
		  ArrayList<Car> cars = new ArrayList<>();
		  for(int i = 0 ; i < UserInput ; i++){
			 
			  System.out.println("Enter Car #1 make: ");
			 String make = scnr.next();
			  System.out.println("Enter Car #1 model: ");
			 String model = scnr.next();
			  System.out.println("Enter Car #1 year: ");
			 int year = scnr.nextInt();
			  System.out.println("Enter Car #1 price: ");
			 double price = scnr.nextDouble();
			  cars.add(new Car(make,model,year,price));
			  
		    }
		  
		   for (Car s : cars) {
			   System.out.printf ("%-8s %-8s %-8d $%-8.2f \n" , s.getMake(),s.getModel(),s.getYear(),s.getPrice());
			   scnr.close();
		   }
		  
		  
		 

	}

}
