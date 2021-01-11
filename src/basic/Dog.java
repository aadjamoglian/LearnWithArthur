package basic;

import basic.Dog.WildDog.Coyote;

public class Dog {
	
	
	static String speciesName = "Canis lupus familiaris";
	static String dogHistory = "Evidence of domesticated dogs dates back to 36,900 and 41,500 YBP.";
	
	String name;
	String breed;
	int weightPounds;
	int heightInches;
	String coatColor;
	boolean Sheds;
	
	
	// Class within dogs called WildDog
	public static class WildDog{
			
			// Coyote class within WildDog within Dog.
			public static class Coyote{
			
			static String WildBreeds = "The coyote(Canis latrans) is a wild dog!";
			String sound = "Grrrrrrrrr";
			
			}
			
		}


	public static void main(String[] args) {

		System.out.println("The history of dogs...");
		System.out.println(Dog.dogHistory);
		
		System.out.println("Their scientific name is:");
		System.out.println(Dog.speciesName);
		
		Dog lucky = new Dog();
		
		lucky.name = "Lucky";
		lucky.breed = "Chihuahua Terrier Mix";
		lucky.weightPounds = 20;
		lucky.heightInches = 12;
		lucky.coatColor = "White";
		lucky.Sheds = true;

		
		System.out.println("\nMy dog's name is: " + lucky.name);
		System.out.println("She is a " + lucky.breed);
		System.out.println("She weighs: " + lucky.weightPounds + " she needs to go on a diet");

		System.out.println("She is " + lucky.heightInches + "inches tall");
		System.out.println("Her fur color is " + lucky.coatColor);
		System.out.println("Does she shed? " + lucky.Sheds);
		
		System.out.println(Dog.WildDog.Coyote.WildBreeds);
		System.out.println(Coyote.WildBreeds);
		
		WildDog.Coyote c = new WildDog.Coyote();
		System.out.println("The coyote goes " + c.sound);

		Coyote c2 = new Coyote();
		System.out.println("The coyote goes " + c2.sound);
		


}
	
}
