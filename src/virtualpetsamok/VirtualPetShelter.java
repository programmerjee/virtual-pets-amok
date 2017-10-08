package virtualpetsamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	Map<String, VirtualPet> myShelter = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> availablePets() {
		return myShelter.values();
	}

	public void addPet(VirtualPet adoptablePet) {
		String petsAvailable = adoptablePet.getPetName();
		myShelter.put(petsAvailable, adoptablePet);
	}

	public void removePet(String upForAdoption) {
		myShelter.remove(upForAdoption);
	}

	public void showPets(VirtualPet adoptablePet) {

		for (Entry<String, VirtualPet> entry : myShelter.entrySet()) {
			entry.getValue();
			System.out.println("Name : " + entry.getKey() + "\tHealth " + entry.getValue().getPetHealth()
					+ "\tHappiness: " + entry.getValue().getPetHappiness());
		}
	}

	public VirtualPet getPetNamed(String name) {
		return myShelter.get(name);
	}

	public void feedPets() {
		for (VirtualPet pet : availablePets()) {
			if (pet instanceof Organic) {
				Organic organicPet = (Organic) pet;
				organicPet.feed();
			}
		}
	}

	public void tickAllPets(VirtualPet adoptablePet) {
		for (VirtualPet pet : availablePets()) {
			if (pet instanceof Organic) {
				Organic organicPet = (Organic) pet;
				organicPet.tick();
			} else if (pet instanceof RobotPet) {
				RobotPet robotPet = (RobotPet) pet;
				robotPet.tick();
			}
		}
	}

	public void waterAllPets() {

		for (VirtualPet pet : availablePets()) {
			if (pet instanceof Organic) {
				Organic organicPet = (Organic) pet;
				organicPet.water();
			}
		}

	}

	public void oilRobots() {
		for (VirtualPet pet : availablePets()) {
			if (pet instanceof RobotPet) {
				RobotPet robotPet = (RobotPet) pet;
				robotPet.oil();
			}
		}
	}

	public boolean hasPets() {

		return !myShelter.isEmpty();
	}

	public void cleanCages() {
		for (VirtualPet pet : availablePets()) {
			if (pet instanceof OrganicDog) {
				OrganicDog organicDog = (OrganicDog) pet;
				organicDog.cleanCages();
			}
		}
	}

	public void emptyLitterBox() {
		for (VirtualPet pet : availablePets()) {
			if (pet instanceof OrganicCat) {
				OrganicCat organicCat = (OrganicCat) pet;
				organicCat.emptyLitterBox();
			}
		}
	}

	public void walkDogs() {
		for (VirtualPet pet : availablePets()) {
			if (pet instanceof Dog) {
				Dog aDog = (Dog) pet;
				aDog.walk();
			}
		}
	}

	public void showPetName(VirtualPet pets) {
		for (Entry<String, VirtualPet> entry : myShelter.entrySet()) {
			System.out.print(entry.getKey() + "\t");
		}
	}
}
