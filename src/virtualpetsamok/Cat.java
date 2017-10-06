package virtualpetsamok;

public class Cat extends VirtualPet{

	public Cat(String name, String type, int happiness, int health) {
		super(name, type, happiness, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		petHappiness-=1;
		petHealth-=1;
	}

}
