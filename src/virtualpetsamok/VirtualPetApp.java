package virtualpetsamok;

//import java.util.Scanner;

public class VirtualPetApp {
	//user input switch case to determine class
}
/*
Scanner input = new Scanner(System.in);
VirtualPet pets = new VirtualPet("Goldie", "lab");
VirtualPetShelter shelterPets = new VirtualPetShelter();
shelterPets.addPet(pets);
VirtualPet oldPet = new VirtualPet("Penny", "beagle");
shelterPets.addPet(oldPet);
VirtualPet permanentPit = new VirtualPet("Bud", "pitbull");
shelterPets.addPet(permanentPit);
VirtualPet strayCat = new VirtualPet("Miley", "tabbycat");
shelterPets.addPet(strayCat);
System.out.println("Welcome to the County Shelter!");

String showMenu = "\n\t	What would you like to do next?\n" + "\n\t" + "1. Feed the pets\n\t"
		+ "2. Water the pets\n\t" + "3. Play with a pet\n\t" + "4. Adopt a pet\n\t" + "5. Admit a pet\n\t"
		+ "6. Show all pets.\n\t" + "7. Quit";

String userChoice;
while (shelterPets.hasPets()) {
	do {
		System.out.println(showMenu);
		userChoice = input.next();
	} while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")
			&& !userChoice.equals("4") && !userChoice.equals("5") && !userChoice.equals("6")
			&& !userChoice.equals("7"));
	switch (userChoice) {
	case "1":
		shelterPets.callTick(pets);
		shelterPets.feedPets(pets);
		System.out.println("The shelter pets have polished off the last of the dog bones.");
		break;
	case "2":
		shelterPets.callTick(pets);
		shelterPets.waterPets(pets);
		System.out.println("Your pets are starting to slobber all over you.  They've had enough water");
		break;
	case "3":
		shelterPets.callTick(pets);
		System.out.println("Which pet would you like to play with?");
		shelterPets.showPetName(pets);
		String chosenPet = input.next();
		VirtualPet playPet = shelterPets.getPetNamed(chosenPet);
		playPet.play();
		System.out.println(chosenPet + " had a lot of fun!  He's starting to get tired.");
		break;
	case "4":
		shelterPets.callTick(pets);
		shelterPets.showTypes(pets);
		System.out.println("Which pet would you like to adopt?");
		String upForAdoption = input.next();
		shelterPets.removePet(upForAdoption);
		System.out.println("Congratulations! You have a new furbaby, " + upForAdoption);
		break;
	case "5":
		shelterPets.callTick(pets);
		System.out.println("What will you name the new pet?");
		String homelessName = input.next();
		System.out.println("What type of pet is it?");
		String homelessType = input.next();
		VirtualPet homelessPet = new VirtualPet(homelessName, homelessType);
		shelterPets.addPet(homelessPet);
		System.out.println("Welcome to your new home, " + homelessName);
		break;
	case "6":
		System.out.println("These are the pets at our shelter:");
		shelterPets.showPets(pets);
		break;
	case "7":
		System.out.println("Thank you for volunteering at the County Shelter.\nGoodbye!");
		System.exit(0);
		break;
	}
}
input.close();
}*/