package virtualpetsamok;

public abstract class VirtualPet {
	public  String petName;
	public  String petType;
	public  int petHappiness;
	public  int petHealth;

	public VirtualPet(String name, String type, int happiness, int health) {
		petName = name;
		petType = type;
		petHappiness = happiness;
		petHealth = health;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
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
		
		petHappiness +=5;
	}

	public abstract void tick();
	
}
