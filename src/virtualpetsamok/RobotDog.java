package virtualpetsamok;

public class RobotDog extends Dog implements RobotPet {
	
	int maintenance = 10;
	public RobotDog(String name, String type, int happiness, int health, int maintenance) {
		super(name, type, happiness, health);
		this.maintenance = maintenance;
		
	}
	public int getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(int maintenance) {
		this.maintenance = maintenance;
	}
	@Override
	public void tick() {
		petHealth-=1;
		petHappiness-=1;
		maintenance-=1;
	}
	public void oil() {
		maintenance +=5;
	}
	public void checkHealth() {
		if (maintenance ==0) {
			petHealth=0;
		}
	}

}
