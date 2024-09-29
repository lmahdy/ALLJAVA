public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructor with parameters
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void displayAnimal() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Family: " + family);
        System.out.println("Animal Age: " + age);
        System.out.println("Is Mammal: " + isMammal);
    }

    @Override
    public String toString() {
        return "Animal{family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "}";
    }
}
