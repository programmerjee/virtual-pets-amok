package virtualpetsamok;

public class RobotCat extends Cat implements RobotPet{
	int maintenance = 10;
	public RobotCat(String name, String type, int happiness, int health, int maintenance) {
		super(name, type, happiness, health);
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

}
