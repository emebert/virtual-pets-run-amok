package virtualpetsrunamok;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean fun = true;

		OrganicDogs dogPistol = new OrganicDogs("Pistol", "dog", 9, 25, 18, 0);
		OrganicDogs dogPippa = new OrganicDogs("Pippa", "dog", 24, 17, 33, 0);

		OrganicCats catGreta = new OrganicCats("Greta", "cat", 20, 21, 22, 0);
		OrganicCats catRoscoe = new OrganicCats("Roscoe", "cat", 9, 11, 34, 0);

		RoboticDogs dogCosmo = new RoboticDogs("Cosmo", "dog", 23);
		RoboticDogs dogSputnik = new RoboticDogs("Sputnik", "dog", 34);

		RoboticCats catGizmo = new RoboticCats("Gizmo", "cat", 24);
		RoboticCats catSpaceOddity = new RoboticCats("Space Oddity", "cat", 29);

		VirtualPetShelter allPetShelter = new VirtualPetShelter();

		allPetShelter.intakeNewRoboticDog(dogCosmo);
		allPetShelter.intakeNewRoboticDog(dogSputnik);
		allPetShelter.intakeNewOrganicDog(dogPippa);
		allPetShelter.intakeNewOrganicDog(dogPistol);
		allPetShelter.intakeNewRoboticCat(catSpaceOddity);
		allPetShelter.intakeNewRoboticCat(catGizmo);
		allPetShelter.intakeNewOrganicCat(catGreta);
		allPetShelter.intakeNewOrganicCat(catRoscoe);

		System.out.println(allPetShelter.roboticDogRoster());
		System.out.println(allPetShelter.roboticCatRoster());
		System.out.println(allPetShelter.organicCatRoster());
		System.out.println(allPetShelter.organicDogRoster());

		do {
			allPetShelter.shelterTick();
			writeLine("How would you like to interact with the animals in the shelter?");
			writeLine("Enter 'feed', 'water','clean', 'provide oil', 'walk'. To quit, enter 'quit.");

			String interact = input.nextLine();
			switch (interact) {
			case "feed":
				allPetShelter.feedPets(); // feeds all pets
				writeLine("You provided food to all the organic pets in the shelter.");
				break;
			case "water":
				allPetShelter.waterPets(); // gives all pets water
				writeLine("You provided water to all the organic pets in the shelter!");
				break;
			case "walk":
				allPetShelter.walkPets(); // walk all the dogs
				writeLine("You took all the dogs for a walk.");
				break;
			case "provide oil":
				allPetShelter.oilPets(); // provides oil to the robotic pets
				writeLine("You gave the robotic pets some oil! Now they won't be nearly as squeaky.");
				break;
			case "clean":
				allPetShelter.cleanLitterBox(); // cleans the litterbox
				writeLine("The shelter's litter box has been cleaned. Hoping that improves the smell around here...");
				break;
			case "quit":
				writeLine("You have opted to quit Virtual Pet Shelter");
				System.exit(0); // exits Virtual Pet Shelter
				break;

			default:
				writeLine(
						"Invalid entry. Your options are 'feed', 'water','clean', 'provide oil', 'walk'. To quit, enter 'quit.");
				break;
			}
		} while (!allPetShelter.organicDogRoster.isEmpty());
	}

	public static void writeLine(String message) {
		System.out.println(message);
	}
}
