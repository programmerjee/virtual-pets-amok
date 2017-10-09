package virtualpetsamok;

public class Cat extends VirtualPet {

	public Cat(String name, int happiness, int health) {
		super(name, happiness, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		petHappiness -= 1;
	}

}
