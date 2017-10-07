package virtualpetsamok;

public class RobotCat extends Cat implements RobotPet{
	int maintenance = 10;
	public RobotCat(String name, int happiness, int health, int maintenance) {
		super(name, happiness, health);
		this.maintenance=maintenance;
	}
	public int getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(int maintenance) {
		this.maintenance = maintenance;
	}
	@Override
	public void tick() {
		petHappiness-=1;
		petHealth-=1;
		maintenance-=1;
	}
	public void oil() {
		maintenance +=5;
	}
	@Override
	public void checkHealth() {
	}

}
