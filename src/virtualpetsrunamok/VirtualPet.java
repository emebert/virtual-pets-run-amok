package virtualpetsrunamok;

abstract class VirtualPets {

	protected String name;
	protected int health;
	protected String species;
	protected boolean isReal;

	public VirtualPets(String name, String species, boolean isReal) {
		this.name = name;
		this.health = 100;
		this.species = species;
		this.isReal = isReal;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	@Override
	public String toString() {
		return name + ":" + " Health: " + health + ", type " + species + ", isReal = " + isReal;
	}

	public void tick() {
		// TODO Auto-generated method stub
		
	}

}