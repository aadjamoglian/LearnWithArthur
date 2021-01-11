package basic;

public class Car {
	
	String make;
	String model;
	int horsePower;
	int weightPounds;
	int topSpeed;
	double zeroToSixty;

	public static void main(String[] args) {
		
		Car h = new Car();
		
		h.make = "Honda";
		h.model = "CR-V";
		h.horsePower = 184;
		h.weightPounds = 3569;
		h.topSpeed = 112;
		h.zeroToSixty = 7.5;
		
		
		System.out.println("Info about my car.");
		System.out.println("Make: " + h.make);
		System.out.println("Model: " + h.model);
		System.out.println("Horsepower: " + h.horsePower);
		System.out.println("Weight in pounds: " + h.weightPounds);
		System.out.println("Top speed is " + h.topSpeed);
		System.out.println("Goes 0 to 60 in " + h.zeroToSixty + " seconds");
		
		System.out.println(Car.);
		

	}

}
