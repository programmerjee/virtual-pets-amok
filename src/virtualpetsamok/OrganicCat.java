package virtualpetsamok;

public class OrganicCat extends Cat implements Organic {
	int hunger = 10;
	int thirst = 10;
	int cleanliness = 10;

	public OrganicCat(String name, int happiness, int health, int hunger, int thirst, int cleanliness) {
		super(name, happiness, health);
		this.hunger = hunger;
		this.thirst = thirst;
		this.cleanliness = cleanliness;
	}

	@Override
	public void tick() {
		petHappiness -=1;
		hunger -= 1;
		thirst -= 1;
		cleanliness -= 1;
		if (hunger <= 0 || thirst <=0 || cleanliness <=0 || petHappiness <=0) {
			petHealth-=1;
		}
		
	}

	public void feed() {
		hunger += 5;
	}

	public void water() {
		thirst += 5;
	}

	public void emptyLitterBox() {
		cleanliness += 5;

	}

}
