package virtualpetsrunamok;

public class RoboticCats extends Cats implements RoboticPets {

	private int catMaintenanceNeed;

	private int oilNeed;
	
	private int health;

	public RoboticCats(String name, String species, int catMaintainenceNeed) {
		super(name, species, false);
		this.catMaintenanceNeed = catMaintainenceNeed;
		this.oilNeed = 0;
	}

	@Override
	public void provideOil() {
		oilNeed = 0;
		health += 5;
	}

	@Override
	public void performMaintenance() {
		health += 15;
		catMaintenanceNeed -= 30;

	}

	public String individualCatStats() {
		return name + "\t|\t" + species + "\t|\t" + isReal + "\t|\t" + catMaintenanceNeed + "\t|\t" + oilNeed
				+ "\t|\t" + health;
	}
	
	public void tick(){
		oilNeed+=5;
		catMaintenanceNeed+=5;
	}

}