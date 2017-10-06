package virtualpetsamok;

import java.util.Collection;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class _02_VirtualPetAmokTest {
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
		VirtualPet adoptablePet = null;//create dog & check that pet is in the shelter)
		underTest.addPet(adoptablePet);
		
	}
	
}
