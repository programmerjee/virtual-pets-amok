package virtualpetsamok;

import java.util.Scanner;

public class VirtualPetApp {
	public static void main(String[] args) {

		VirtualPet pets = new OrganicDog("Penny",10, 10, 10, 10, 10);
		VirtualPetShelter myShelter = new VirtualPetShelter();
		myShelter.addPet(pets);
		VirtualPet oCat = new OrganicCat("Scratches", 10, 10, 10, 10, 10);
		myShelter.addPet(oCat);
		VirtualPet rDog = new RobotDog("RoboDog",  10, 10, 10);
		myShelter.addPet(rDog);
		VirtualPet rCat = new RobotCat("Sparky", 10, 10, 10);
		myShelter.addPet(rCat);

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the County Shelter");

		String showMenu = "\n\t	What would you like to do next?\n" + "\n\t" + "1. Feed the pets\n\t"
				+ "2. Water the pets\n\t" + "3. Clean the dog cages.\n\t" + "4. Clean the litter box.\n\t"
				+ "5. Walk the dogs.\n\t" + "6. Oil the robots. \n\t" + "7. Play with a pet\n\t" + "8. Adopt a pet\n\t"
				+ "9. Admit a pet\n\t" + "10. Show all pets.\n\t" + "11. Quit";
		String userChoice;
		while (myShelter.hasPets()) {
			do {System.out.println(showMenu);
			userChoice = input.next();
			} while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")
					&& !userChoice.equals("4") && !userChoice.equals("5") && !userChoice.equals("6")
					&& !userChoice.equals("7") && !userChoice.equals("8") && !userChoice.equals("9")
					&& !userChoice.equals("10") && !userChoice.equals("11"));
			switch (userChoice) {
			case "1": // feed all organics
				myShelter.tickAllPets(pets);
				myShelter.feedPets();
				System.out.println("All of the organic cats and dogs have been fed!");
				break;
			case "2": // water all organics
				myShelter.tickAllPets(pets);
				myShelter.waterAllPets();
				System.out.println("All of the organic cats and dogs have water available.");
				break;
			case "3": // clean dog cages
				myShelter.tickAllPets(pets);
				myShelter.cleanCages();
				System.out.println("The dog cages are smelling fresh!");
				break;
			case "4": // clean litter box
				myShelter.tickAllPets(pets);
				myShelter.emptyLitterBox();
				System.out.println("The litter box smells much better.");
				break;
			case "5": // walk all dogs
				myShelter.tickAllPets(pets);
				myShelter.walkDogs();
				System.out.println("The dogs are happy (and less likely to need their cage cleaned.");
				break;
			case "6": // oil robots
				myShelter.tickAllPets(pets);
				myShelter.oilRobots();
				System.out.println("The robots are nice and shiny!");
				break;
			case "7": // play with a pet
				myShelter.tickAllPets(pets);
				System.out.println("Which pet would you like to play with?");
				myShelter.showPetName(pets);
				String chosenPet = input.next();
				VirtualPet playPet = myShelter.getPetNamed(chosenPet);
				playPet.play();
				System.out.println(chosenPet + " had a lot of fun!  He's starting to get tired.");
				break;
			case "8": // adopt a pet
				myShelter.tickAllPets(pets);
				myShelter.showPets(pets);
				System.out.println("Which pet would you like to adopt?");
				String upForAdoption = input.next();
				myShelter.removePet(upForAdoption);
				System.out.println("Congratulations! You have a new furbaby, " + upForAdoption);
				break;
			case "9": // admit a pet
				myShelter.tickAllPets(pets);
				System.out.println("Do you have a: \n\tA. Organic Dog \n\t B. Organic Cat \n\t C. Robot Dog \n\t D. Robot Cat");
				String petType = input.next();
				switch (petType.toUpperCase()) {
				case "A"://odog
					System.out.println("What will you name the new dog?");
					String oDogName = input.next();
					VirtualPet newODog = new OrganicDog(oDogName, 10, 10, 10, 10, 10);
					myShelter.addPet(newODog);
					break;
				case "B"://ocat
					System.out.println("What will you name the new cat?");
					String oCatName = input.next();
					VirtualPet newOCat = new OrganicDog(oCatName, 10, 10, 10, 10, 10);
					myShelter.addPet(newOCat);
					break;
				case "C"://rcat
					System.out.println("What will you name the new dog?");
					String rDogName = input.next();
					VirtualPet newRDog = new OrganicDog(rDogName, 10, 10, 10, 10, 10);
					myShelter.addPet(newRDog);
					break;
				case "D":
					System.out.println("What will you name the new cat?");
					String rCatName = input.next();
					VirtualPet newRCat = new OrganicDog(rCatName, 10, 10, 10, 10, 10);
					myShelter.addPet(newRCat);
					break;
				}
				System.out.println("Welcome to your new home!" );
				break;
			case "10": 
				myShelter.tickAllPets(pets);
				System.out.println("These are the pets at our shelter:");
				myShelter.showPets(pets);
				break;
			case "11":
				System.out.println("Thank you for volunteering at the County Shelter.\nGoodbye!");
				System.exit(0);
				break;
			}

		}

		input.close();
	}
}
