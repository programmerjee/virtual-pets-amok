package virtualpetsamok;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import virtualpetsamok.VirtualPet;

public class _01_VirtualPetAmokTest {
	
	@Test
	public void shouldCreateAOrganicDog() {
		OrganicDog underTest = new OrganicDog(null, null, 0, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldCreateARobotDog() {
		RobotDog underTest = new RobotDog(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldCreateAOrganicCat() {
		OrganicCat underTest = new OrganicCat(null, null, 0, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldCreateARobotCat() {
		RobotCat underTest = new RobotCat(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void walksMakeDogsHappy() {
		Dog underTest = new OrganicDog(null, null, 0, 0, 0, 0, 0);
		underTest.walk();
		int response = underTest.getPetHappiness();
		assertEquals(5, response);
	}

	@Test
	public void playMakesVirtualPetsHappy() {
		VirtualPet underTest = new RobotDog (null, null, 0, 0, 0);
		underTest.play();
		int response = underTest.getPetHappiness();
		assertEquals(5, response);
	}

	@Test
	public void virtualPetsCanTick() {
		VirtualPet underTest = new RobotDog(null, null, 10, 10, 10);
		underTest.tick();
		int response = underTest.getPetHappiness() + underTest.getPetHealth();
		assertEquals(18, response);
	}

	@Test
	public void organicCatsAreThirstyHappyAndHaveWaste() {
		OrganicCat underTest = new OrganicCat("Scratchy", "tabby", 10, 10, 10, 10, 10);
		int check = underTest.getHunger() + underTest.getThirst() + underTest.getCleanliness();
		assertEquals(30, check);
	}

	@Test
	public void organicDogsAreThirstyHappyAndHaveWaste() {
		OrganicDog underTest = new OrganicDog("Bud", "dog", 10, 10, 10, 10, 10);
		int check = underTest.getHunger() + underTest.getThirst() + underTest.getCleanliness();
		assertEquals(30, check);
	}

	@Test
	public void odogTicksShouldReduceAllLevels() {
		OrganicDog underTest = new OrganicDog("Bud", "dog", 10, 10, 10, 10, 10);
		underTest.tick();
		int check = underTest.getPetHappiness() + underTest.getPetHealth() + underTest.getHunger()
				+ underTest.getThirst() + underTest.getCleanliness();
		assertEquals(45, check);
	}
	@Test
	public void ocatTicksShouldReduceAllLevels() {
		OrganicCat underTest = new OrganicCat("Scratchy", "cat", 10, 10, 10, 10, 10);
		underTest.tick();
		int check = underTest.getPetHappiness() + underTest.getPetHealth() + underTest.getHunger() + underTest.getThirst() + underTest.getCleanliness();
		assertEquals(45, check);
	}
	@Test
	public void rDogTicksShouldReduceAllLevels() {
		RobotDog underTest = new RobotDog("Robo", "dog", 10, 10, 10);
		underTest.tick();
		int check = underTest.getMaintenance() + underTest.getPetHappiness() + underTest.getPetHealth();
		assertEquals(27, check);
	}
	@Test
	public void rCatTicksShouldReduceAllLevels(){
		RobotCat underTest = new RobotCat("Robocat", "cat", 10, 10, 10);
		underTest.tick();
		int check = underTest.getMaintenance() + underTest.getPetHappiness() + underTest.getPetHealth();
		assertEquals(27, check);
	}
	@Test
	public void shouldBeAbleToFeedOrganics() {
		OrganicCat underTest = new OrganicCat("Scratchy", "cat", 10, 10, 10, 10, 10);
		underTest.feed();
		int check = underTest.getHunger();
		assertEquals(15, check);
	}
	@Test
	public void shouldBeAbleToWaterOrganics() {
		OrganicCat underTest = new OrganicCat("Scratchy", "cat", 10, 10, 10, 10, 10);
		underTest.water();
		int check = underTest.getThirst();
		assertEquals(15, check);
	}
	@Test
	public void shouldBeAbleToOilRobots() {
		RobotCat underTest = new RobotCat("Robocat", "cat", 10, 10, 10);
		underTest.oil();
		int check = underTest.getMaintenance();
		assertEquals(15, check);
	}
	@Test
	public void walksShouldIncreaseODogCleanliness() {
		OrganicDog underTest = new OrganicDog("Bud", "dog", 10, 10, 10, 10, 10);
		underTest.walk();
		int check = underTest.getCleanliness();
		assertEquals(15, check);
	}
	@Test
	public void shouldBeAbleToCleanLitterBox() {
		OrganicCat underTest = new OrganicCat("Scratchy", "cat", 10, 10, 10, 10, 10);
		underTest.cleanLitterBox();
		int check = underTest.getCleanliness();
		assertEquals(15, check);
	}
	@Test
	public void shouldBeAbleToCleanCages() {
		OrganicDog underTest = new OrganicDog("Bud", "dog", 10, 10, 10, 10, 10);
		underTest.cleanCages();
		int check = underTest.getCleanliness();
		assertEquals(15, check);
	}
	@Test
	public void variablesShouldAffectOHealth() {
		OrganicCat underTest = new OrganicCat("Scratchy", "cat", 10, 10, 0, 0, 0);
		underTest.checkHealth();
		int check = underTest.getPetHealth();
		assertEquals(0, check);
	}
	@Test
	public void maintenanceShouldAffectHealth() {
		RobotDog underTest = new RobotDog("Robodog", "cat", 10, 10, 0);
		underTest.checkHealth();
		int check = underTest.getPetHealth();
		assertEquals(0, check);
	}
}
