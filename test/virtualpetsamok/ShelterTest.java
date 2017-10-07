package virtualpetsamok;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

public class ShelterTest {
	@Test
	public void shouldBeAbleToShowPets() {
	VirtualPetShelter underTest = new VirtualPetShelter();
	Collection<VirtualPet> result = underTest.availablePets();
	assertNotNull(result);
	}
	@Test
	public void shouldBeAbleToAddOrganicDog() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicDog adoptablePet = new OrganicDog("Bud", 10, 10, 10, 10, 10);
		underTest.addPet(adoptablePet);
		assertNotNull(underTest);
	}
	@Test
	public void shouldTickAllVirtualPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet aPet = new OrganicDog("Bud", 10, 10, 10, 10, 10);
		underTest.addPet(aPet);
		underTest.tickAllPets(aPet);
		int result = aPet.getPetHealth();
		assertEquals(9, result);
	}
	@Test
	public void shouldFeedAllOrganics() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicDog aPet = new OrganicDog("Bud", 10, 10, 10, 10, 10);
		underTest.addPet(aPet);
		underTest.feedPets();
		int result = aPet.getHunger();
		assertEquals(15, result);
	}
	@Test
	public void shouldFeedMultiplePets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicDog aPet = new OrganicDog("Bud", 10, 10, 10, 10, 10);
		OrganicCat aCat = new OrganicCat("tabby", 10, 10, 10, 10, 10);
		underTest.addPet(aPet);
		underTest.addPet(aCat);
		underTest.feedPets();
		int result = aCat.getHunger() + aPet.getHunger();
		assertEquals(30, result);
	}
	@Test
	public void shouldWaterPetOrganicCats() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicCat aCat = new OrganicCat("tabby", 10, 10, 10, 10, 10);
		underTest.addPet(aCat);
		underTest.waterAllPets();
		int result = aCat.getThirst();
		assertEquals(15, result);
	}
	@Test
	public void shouldOilAllRobots() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		RobotDog roboDog = new RobotDog("robo",  10, 10, 10);
		underTest.addPet(roboDog);
		underTest.oilRobots();
		int result = roboDog.getMaintenance();
		assertEquals(15, result);
	}
	@Test
	public void doesShelterHavePets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		boolean result = underTest.hasPets();
		assertEquals(false, result);
	}
	@Test
	public void shelterCanCleanCages() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicDog aPet = new OrganicDog("Bud", 10, 10, 10, 10, 10);
		underTest.addPet(aPet);
		underTest.cleanCages();
		int result = aPet.getCleanliness();
		assertEquals(15, result);
	}
	@Test
	public void shelterCanEmptyLitterBox() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicCat aCat = new OrganicCat("Scratch", 10, 10, 10, 10, 10);
		underTest.addPet(aCat);
		underTest.emptyLitterBox();
		int result = aCat.getCleanliness();
		assertEquals(15, result);
	}
	@Test
	public void shelterCanWalkAllDogs() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicDog aDog = new OrganicDog("Bud", 10, 10, 10, 10, 10);
		underTest.addPet(aDog);
		underTest.walkDogs();
		int result = aDog.getCleanliness();
		assertEquals(15, result);
	}
}
