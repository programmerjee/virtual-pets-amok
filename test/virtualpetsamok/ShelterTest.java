package virtualpetsamok;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class ShelterTest {
	@Test
	public void shouldBeAbleToShowPets() {
	VirtualPet aPet = new OrganicDog("Bud", "dog", 10, 10, 10, 10, 10);
	VirtualPetShelter underTest = new VirtualPetShelter();
	Collection<VirtualPet> result = underTest.availablePets();
	assertNotNull(result);
	}
	@Test
	public void shouldBeAbleToAddOrganicDog() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicDog adoptablePet = new OrganicDog("Bud", "dog", 10, 10, 10, 10, 10);
		underTest.addPet(adoptablePet);
		assertNotNull(underTest);
	}
	@Test
	public void shouldTickAllVirtualPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet aPet = new OrganicDog("Bud", "dog", 10, 10, 10, 10, 10);
		underTest.addPet(aPet);
		underTest.tickAllPets(aPet);
		int result = aPet.getPetHealth();
		assertEquals(9, result);
	}
	@Test
	public void shouldFeedAllOrganics() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicDog aPet = new OrganicDog("Bud", "dog", 10, 10, 10, 10, 10);
		underTest.addPet(aPet);
		underTest.feedPets();
		int result = aPet.getHunger();
		assertEquals(15, result);
	}
	@Test
	public void shouldFeedMultiplePets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicDog aPet = new OrganicDog("Bud", "dog", 10, 10, 10, 10, 10);
		OrganicCat aCat = new OrganicCat("tabby", "cat", 10, 10, 10, 10, 10);
		underTest.addPet(aPet);
		underTest.addPet(aCat);
		underTest.feedPets();
		int result = aCat.getHunger() + aPet.getHunger();
		assertEquals(30, result);
	}
	@Test
	public void shouldWaterPetOrganicCats() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicCat aCat = new OrganicCat("tabby", "cat", 10, 10, 10, 10, 10);
		underTest.addPet(aCat);
		underTest.waterAllPets();
		int result = aCat.getThirst();
		assertEquals(15, result);
	}
	@Test
	public void shouldOilAllRobots() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		RobotDog roboDog = new RobotDog("robo", "dog", 10, 10, 10);
		underTest.addPet(roboDog);
		underTest.oilRobots();
		int result = roboDog.getMaintenance();
		assertEquals(15, result);
	}
}
