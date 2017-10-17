package virtualpetsamok;

public abstract class Dog extends VirtualPet {

	public Dog(String name, int happiness, int health) {
		super(name, happiness, health);
	}

	public void walk() {
		petHappiness += 5;
	}

	@Override
	public void tick() {
		petHappiness -= 1;
	}

}
