package virtualpetsrunamok;

public class RoboticDogs extends Dogs implements RoboticPets {

	private int dogMaintenanceNeed;
	private int oilNeed;

	public RoboticDogs(String name, String species, int dogMaintenanceNeed) {
		super(name, species, false);
		this.dogMaintenanceNeed = dogMaintenanceNeed;
	}
	
	public void tick(){
		oilNeed+=5;
		dogMaintenanceNeed+=10;
	}

	@Override
	public void performMaintenance() {
		health += 15;
		dogMaintenanceNeed -= 30;

	}

	@Override
	public void provideOil() {
		oilNeed = 0;
		health += 5;
	}

	public String individualDogStats() {
		return name + "\t|\t" + species + "\t|\t" + isReal + "\t|\t" + dogMaintenanceNeed + "\t|\t" + oilNeed + "\t|\t";
	}
	
	
}