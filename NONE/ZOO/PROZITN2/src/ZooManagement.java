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
        Zoo myZoo = new Zoo("chebba", "Annaba", 46);

        // Create and assign values to an Animal object
        Animal lion = new Animal("bledi", "chebbalion", 27, true);

        // Add the lion to the zoo
        myZoo.animals[0] = lion;

        // Display the zoo information using the displayZoo() method
        myZoo.displayZoo();

        // Display the animal information using the displayAnimal() method
        lion.displayAnimal();

        // Alternatively, print the animal using the toString method
        System.out.println(lion);

        // Close the Scanner to avoid resource leak
        sc.close();
    }
}
