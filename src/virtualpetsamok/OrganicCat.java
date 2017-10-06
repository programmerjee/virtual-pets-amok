package virtualpetsamok;

public class OrganicCat extends Cat implements Organic {
	int hunger = 10;
	int thirst = 10;
	int cleanliness = 10;
	
	public OrganicCat(String name, String type, int happiness, int health, int hunger, int thirst, int cleanliness) {
		super(name, type, happiness, health);
		this.hunger = hunger;
		this.thirst = thirst;
		this.cleanliness = cleanliness;
	}
	public int getHunger() {
		return hunger;
	}
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	public int getThirst() {
		return thirst;
	}
	public void setThirst(int thirst) {
		this.thirst = thirst;
	}
	public int getCleanliness() {
		return cleanliness;
	}
	public void setCleanliness(int cleanliness) {
		this.cleanliness = cleanliness;
	}
	@Override
	public void tick() {
		super.tick();
		hunger-=1;
		thirst-=1;
		cleanliness-=1;
	}
	public void feed() {
		hunger += 5;
	}
	public void water() {
		thirst+=5;
	}
	public void cleanLitterBox() {
		cleanliness+=5;
	}
	public void checkHealth() {
		if (cleanliness==0 || hunger == 0 || thirst == 0) {
			petHealth=0;
		}
	}

}
