import java.util.Objects;

public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals; // Array to store aquatic animals
    private String name;
    private String city;
    private final int nbrCages = 25; // Zoo can have 25 animals in general
    private final int nbrAquaticCages = 10; // Maximum 10 aquatic animals
    private int animalCount;
    private int aquaticAnimalCount;

    // Constructor with parameters
    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        aquaticAnimals = new Aquatic[nbrAquaticCages]; // Initialize aquatic animals array
        setName(name);
        this.city = city;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Zoo name cannot be empty");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public int getNbrAquaticCages() {
        return nbrAquaticCages;
    }

    public int getAquaticAnimalCount() {
        return aquaticAnimalCount;
    }

    // Method to display zoo details
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("Zoo City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Number of Aquatic Animal Cages: " + nbrAquaticCages);
    }

    public boolean addAnimal(Animal animal) {
        if (!isZooFull()) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }
        return false;
    }

    // Added method to add an aquatic animal
    public boolean addAquaticAnimal(Aquatic aquatic) {
        if (!isAquaticZooFull()) { // Check if there's space for more aquatic animals
            aquaticAnimals[aquaticAnimalCount] = aquatic; // Add to the aquatic animals array
            aquaticAnimalCount++; // Increment the count of aquatic animals
            return true;// Return true if added successfully means there's space
        }
        return false;
    }

    public void displayAnimals() {
        System.out.println("Animals in " + name + ":");
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }

    // Added method to display aquatic animals
    public void displayAquaticAnimals() {
        System.out.println("Aquatic Animals in " + name + ":");
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                System.out.println(aquatic);
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && Objects.equals(animals[i].getName(), animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    // Check if the zoo is full for general animals
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // Check if the aquatic animal section is full
    public boolean isAquaticZooFull() {
        return aquaticAnimalCount >= nbrAquaticCages;
    }

    // Method to compare two zoos by number of animals
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getAnimalCount() > z2.getAnimalCount()) {
            return z1;
        } else {
            return z2;
        }
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    // Method to find the maximum swimming depth of penguins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;

        // Loop through all animals and find instances of Penguin
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }

        // Return the maximum swimming depth found
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        // Parcourir le tableau des animaux aquatiques
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                if (aquatic instanceof Dolphin) {
                    dolphinCount++; // Incrémenter le compteur de dauphins
                } else if (aquatic instanceof Penguin) {
                    penguinCount++; // Incrémenter le compteur de pingouins
                }
            }
        }

        // Afficher les résultats
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }



}
