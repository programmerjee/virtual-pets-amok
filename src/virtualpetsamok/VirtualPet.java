package virtualpetsamok;

public abstract class VirtualPet {
	public static String petName;
	public static String petType;
	public static int petHappiness;
	public static int petHealth;

	public VirtualPet(String name, String type, int happiness, int health) {
		petName = name;
		petType = type;
		petHappiness = happiness;
		petHealth = health;
	}

	public static String getPetName() {
		return petName;
	}

	public static void setPetName(String petName) {
		VirtualPet.petName = petName;
	}

	public static String getPetType() {
		return petType;
	}

	public static void setPetType(String petType) {
		VirtualPet.petType = petType;
	}

	public int getPetHappiness() {
		return petHappiness;
	}

	public static void setPetHappiness(int petHappiness) {
		VirtualPet.petHappiness = petHappiness;
	}

	public int getPetHealth() {
		return petHealth;
	}

	public static void setPetHealth(int petHealth) {
		VirtualPet.petHealth = petHealth;
	}

	public void play() {
		
		petHappiness +=5;
	}

	public abstract void tick();
	
}
