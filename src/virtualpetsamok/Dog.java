package virtualpetsamok;

public class Dog extends VirtualPet{
	

	public Dog(String name, String type, int happiness, int health) {
		super(name, type, happiness, health);
	}
	public void walk() {
		petHappiness +=5;
	}
	@Override
	public void tick() {
		petHappiness-=1;
		petHealth-=1;
	}
	
	
	
	
}
