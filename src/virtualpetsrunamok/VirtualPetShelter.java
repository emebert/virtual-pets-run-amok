package virtualpetsrunamok;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	Map<String, RoboticDogs> roboticDogRoster = new HashMap<String, RoboticDogs>();

	public void intakeNewRoboticDog(RoboticDogs dog) {
		roboticDogRoster.put(dog.getName().toLowerCase(), dog);
	}

	Map<String, OrganicDogs> organicDogRoster = new HashMap<String, OrganicDogs>();

	public void intakeNewOrganicDog(OrganicDogs dog) {
		organicDogRoster.put(dog.getName().toLowerCase(), dog);
	}

	Map<String, RoboticCats> roboticCatRoster = new HashMap<String, RoboticCats>();

	public void intakeNewRoboticCat(RoboticCats cat) {
		roboticCatRoster.put(cat.getName().toLowerCase(), cat);
	}

	Map<String, OrganicCats> organicCatRoster = new HashMap<String, OrganicCats>();

	public void intakeNewOrganicCat(OrganicCats cat) {
		organicCatRoster.put(cat.getName().toLowerCase(), cat);
	}

	public String roboticDogRoster() {
		String rosterMenu = "Name	" + "\tt" + "Type	" + "\t" + "Is Real?	" + "\t" + "Maintenence Need" + "\t"
				+ "Oil Need" + "\t" + "Overall Health" + "\t";
		String menuDivider = "---------------------------------------------------------------------------";
		String menuLine = "";
		System.out.println("Here is the status of the shelter's robotic dogs: " + "\n");
		for (RoboticDogs entry : roboticDogRoster.values()) {
			menuLine = entry.individualDogStats();
			rosterMenu = rosterMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}
		return rosterMenu;
	}

	public String roboticCatRoster() {
		String rosterMenu = "Name" + "\t" + "                Type" + "\t" + " Is Real?" + "\t" + " Maintenence Need"
				+ "\t" + "Oil Need" + "\t" + "Overall Health" + "\t";
		String menuDivider = "---------------------------------------------------------------------------";
		String menuLine = "";
		System.out.println("Here is the status of the shelter's robotic cats: " + "\n");
		for (RoboticCats entry : roboticCatRoster.values()) {
			menuLine = entry.individualCatStats();
			rosterMenu = rosterMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}
		return rosterMenu;
	}

	public String organicCatRoster() {
		String rosterMenu = "Name" + "\t" + " Type" + "\t" + " Is Real?" + "\t" + "Bathroom Need" + "\t" + "Thirst"
				+ "\t" + "Hunger" + "\t" + "Litterbox Filth" + "Overall Health" + "\t";
		String menuDivider = "---------------------------------------------------------";
		String menuLine = "";
		System.out.println("Here is the status of the shelter's organic cats: " + "\n");
		for (OrganicCats entry : organicCatRoster.values()) {
			menuLine = entry.individualCatStats();
			rosterMenu = rosterMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}
		return rosterMenu;
	}

	public String organicDogRoster() {
		String rosterMenu = "Name" + "\t" + " Type" + "\t" + "  Is Real?" + "\t" + "Bathroom Need" + "\t" + "Thirst"
				+ "\t" + "Hunger" + "\t" + " Filth" + "Overall Health" + "\t";
		String menuDivider = "---------------------------------------------------------";
		String menuLine = "";
		System.out.println("Here is the status of the shelter's organic dogs: " + "\n");
		for (OrganicDogs entry : organicDogRoster.values()) {
			menuLine = entry.individualDogStats();
			rosterMenu = rosterMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}

		return rosterMenu;
	}

	public void waterPets() {
		for (OrganicCats currentPet : organicCatRoster.values()) {
			currentPet.giveWater();
		}
		for (OrganicDogs currentPet : organicDogRoster.values()) {
			currentPet.giveWater();
		}
	}

	public void feedPets() {
		for (OrganicCats currentPet : organicCatRoster.values()) {
			currentPet.feed();
		}
		for (OrganicDogs currentPet : organicDogRoster.values()) {
			currentPet.feed();
		}
	}

	public void oilPets() {
		for (RoboticCats currentPet : roboticCatRoster.values()) {
			currentPet.provideOil();
		}
		for (RoboticDogs currentPet : roboticDogRoster.values()) {
			currentPet.provideOil();
		}
	}

	public void performMaintenance() {
		for (RoboticCats currentPet : roboticCatRoster.values()) {
			currentPet.performMaintenance();
		}

		for (RoboticDogs currentPet : roboticDogRoster.values()) {
			currentPet.performMaintenance();
		}
	}

	public void walkPets() {
		for (OrganicDogs currentPet : organicDogRoster.values()) {
			currentPet.walk();
		}
	}

	public void cleanCage() {
		for (OrganicDogs currentPet : organicDogRoster.values()) {
			currentPet.cleanCage();
		}
	}

	public void cleanLitterBox() {
		for (OrganicCats currentPet : organicCatRoster.values()) {
			currentPet.cleanLitterBox();
		}
	}

	public void shelterTick() {
		for (OrganicCats currentPet : organicCatRoster.values()) {
			currentPet.tick();
		}
		for (OrganicDogs currentPet : organicDogRoster.values()) {
			currentPet.tick();
		}
		for (RoboticDogs currentPet : roboticDogRoster.values()) {
			currentPet.tick();
		}
		for (RoboticDogs currentPet : roboticDogRoster.values()) {
			currentPet.tick();
		}
	}
}
