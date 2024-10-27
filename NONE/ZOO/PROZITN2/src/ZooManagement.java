import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoom = new ZooManagement();
        System.out.println(zoom.zooName + " comporte " + zoom.nbrCages + " cages");

        Scanner sc = new Scanner(System.in);

        // Prompt user for number of cages
        System.out.println("Enter the number of cages:");
        zoom.nbrCages = sc.nextInt();
        sc.nextLine();  // Consume the newline

        // Prompt user for zoo name
        System.out.println("Enter the zoo name:");
        zoom.zooName = sc.nextLine();

        System.out.println(zoom.zooName + " comporte " + zoom.nbrCages + " cages");

        // Create a Zoo object
        Zoo myZoo = new Zoo("chebba", "Annaba");

        // Create aquatic animals using concrete classes
        Dolphin fish = new Dolphin("Delphinidae", "Nemo", 2, true, "Coral Reef", 10.0f);
        fish.swim();

        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 25.0f);
        Penguin penguin = new Penguin("Spheniscidae", "Pingu", 3, false, "Antarctic", 15.0f);
        Terrestrial lion = new Terrestrial("Felidae", "Simba", 8, true, 4);

        // Displaying animals
        System.out.println(dolphin);
        penguin.displayAnimal();
        lion.displayAnimal();

        // Add animals (e.g., lions) to the zoo
        for (int i = 0; i < 30; i++) {
            Animal lionAnimal = new Animal("bledi", "chebbalion", 27 + i, true);
            boolean added = myZoo.addAnimal(lionAnimal);
            if (added) {
                System.out.println("Animal added: " + lionAnimal.getName());
            } else {
                System.out.println("NO success for animal: " + lionAnimal.getName());
            }
        }

        // Adding aquatic animals
        System.out.println("Adding aquatic animals:");
        for (int i = 0; i < 5; i++) { // Adding 5 aquatic animals for demonstration
            Penguin aquaticAnimal = new Penguin("Spheniscidae", "AquaticPenguin" + i, 1 + i, false, "Water Tank", 12.0f); // Example penguin
            boolean aquaticAdded = myZoo.addAquaticAnimal(aquaticAnimal); // Add to aquatic animals
            if (aquaticAdded) {
                System.out.println("Aquatic animal added: " + aquaticAnimal.getName());
            } else {
                System.out.println("Aquatic section is full!");
            }
        }

        // Display the zoo information using the displayZoo() method
        myZoo.displayZoo();
        System.out.println("*************");
        myZoo.displayAnimals();
        System.out.println("*************");
        myZoo.displayAquaticAnimals(); // Display aquatic animals
        System.out.println("*************");

        // Afficher la méthode swim() de tous les animaux aquatiques dans le zoo
        System.out.println("Tous les animaux aquatiques nagent :");
        for (Aquatic aquaticAnimal : myZoo.getAquaticAnimals()) { // myZoo.getAquaticAnimals() returns the array of aquatic animals
            if (aquaticAnimal != null) {
                aquaticAnimal.swim();
            }
        }

        // Search for an animal
        Animal searchAnimal = new Animal("makrem", "chebbal", 44, true);
        int result = myZoo.searchAnimal(searchAnimal);
        if (result == -1) {
            System.out.println("Not found, I'm sorry :(");
        } else {
            System.out.println("Found at index " + result);
        }

        // Close the Scanner to avoid resource leak
        sc.close();
    }
}
