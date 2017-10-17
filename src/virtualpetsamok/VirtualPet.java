package virtualpetsamok;

public abstract class VirtualPet {
	protected String petName;
	protected int petHappiness;
	protected int petHealth;

	public VirtualPet(String name, int happiness, int health) {
		petName = name;
		petHappiness = happiness;
		petHealth = health;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getPetHappiness() {
		return petHappiness;
	}

	public void setPetHappiness(int petHappiness) {
		this.petHappiness = petHappiness;
	}

	public int getPetHealth() {
		return petHealth;
	}

	public void setPetHealth(int petHealth) {
		this.petHealth = petHealth;
	}

	public void play() {

		petHappiness += 5;
	}

	public abstract void tick();

}
