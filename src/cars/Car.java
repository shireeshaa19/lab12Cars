package cars;

public class Car {
	
	private String make;
	private String model;
	private int year;
	private double price;
	
	public Car(){
		setMake(" ");
		setModel(" ");
		int year = 0;
		double price = 0.0;
		
	}
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
      // Constructor
	public Car(String make,String model,int year,double price){
		   this.setMake(make);
		   this.setModel(model);
		   this.setYear(year);
		   this.setPrice(price);
		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
