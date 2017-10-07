package virtualpetsamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {
	VirtualPet organicDog = new OrganicDog(null, null, 0, 0, 0, 0, 0);
	VirtualPet organicCat = new OrganicCat(null, null, 0, 0, 0, 0, 0);
	VirtualPet robotDog = new RobotDog(null, null, 0, 0, 0);
	VirtualPet robotCat = new RobotCat(null, null, 0, 0, 0);
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
			System.out.println("Name : " + entry.getKey() + " \tType : " + adoptablePet.getPetType() + "\tHealth "
					+ entry.getValue().getPetHealth() + "\tHappiness: " + entry.getValue().getPetHappiness());
		}
	}

	public void showPetName() {

		for (Entry<String, VirtualPet> entry : myShelter.entrySet()) {
			System.out.print(entry.getKey() + "\t");
		}
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
}

/*
 * 
 * 
 * public void showTypes(VirtualPet adoptablePet) { for (Entry<String,
 * VirtualPet> entry : myShelter.entrySet()) { System.out.println("Name : " +
 * entry.getKey() + "\tType: " + entry.getValue().getPetType()); }
 * 
 * }
 * 
 * 
 * 
 * public boolean hasPets() { return !myShelter.isEmpty(); }
 */
