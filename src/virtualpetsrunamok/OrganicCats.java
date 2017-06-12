package virtualpetsrunamok;

public class OrganicCats extends Cats implements OrganicPets {
	private int litterboxFilth;
	private int bathroomNeed;
	private int thirst;
	private int hunger;

	public OrganicCats(String name, String species, int bathroomNeed, int thirst, int hunger, int litterboxFilth) {
		super(name, species, true);
		this.bathroomNeed = bathroomNeed;
		this.thirst = thirst;
		this.hunger = hunger;
		this.litterboxFilth = 0;
	}

	public int getLitterboxFilth() {
		return litterboxFilth;
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

	
	public void cleanLitterBox() {
		litterboxFilth = 0;
	}

	boolean isLitterboxFilthy() {
		return litterboxFilth > 50;
	}

	public String individualCatStats() {
		return name + "\t" + species + "\t" + isReal + "\t" + bathroomNeed + "\t" + thirst + "\t" + hunger + "\t"
				+ litterboxFilth;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
	public void tick(){
		hunger+=5;
		thirst+=5;
	litterboxFilth+=10;
	}

	@Override
	public void takeToBathroom() {
		// TODO Auto-generated method stub
		
	}

}
