package virtualpetsrunamok;

public class OrganicDogs extends Dogs implements OrganicPets {
	private int cageFilth;
	private int bathroomNeed;
	private int thirst;
	private int hunger;

	public OrganicDogs(String name, String species, int bathroomNeed, int thirst, int hunger, int cageFilth) {
		super(name, species, true);
		this.bathroomNeed = bathroomNeed;
		this.thirst = thirst;
		this.hunger = hunger;
		this.cageFilth = 0;
	}

	public int getCageFilth() {
		return cageFilth;
	}

	public int getBathroomNeed() {
		return bathroomNeed;
	}

	public int getThirst() {
		return thirst;
	}

	public int getHunger() {
		return hunger;
	}

	@Override
	public void feed() {
		health += 15;
		hunger -= 30;
	}

	@Override
	public void giveWater() {
		health += 15;
		thirst -= 30;
	}

	@Override
	public void takeToBathroom() {
		health += 15;
		bathroomNeed -= 30;
	}

	public void cleanCage() {
		cageFilth = 0;
	}

	@Override
	public void walk() {
		health += 10;
		thirst += 5;
		hunger += 5;
		cageFilth -= 10;
	}

	public String individualDogStats() {
		return name + "\t" + species + "\t" + isReal + "\t" + bathroomNeed + "\t" + thirst + "\t" + hunger + "\t"
				+ cageFilth;
	}

	boolean isCageFilthy() {
		return cageFilth > 50;
	}

	public void tick() {
		thirst += 10;
		hunger += 10;
		cageFilth += 5;
		bathroomNeed += 5;
	}
}