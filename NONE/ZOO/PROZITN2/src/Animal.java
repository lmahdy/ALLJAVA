public class Animal {
    protected String family;  // Changed to protected for subclass access
    protected String name;
    protected int age;
    protected boolean isMammal;

    // Constructor with parameters
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age); // Use setter to validate age
        this.isMammal = isMammal;
    }

    public Animal() {
        this.family = "Unknown";
        this.name = "Unknown";
        this.age = 0;
        this.isMammal = false;
    }

    // Getters and Setters
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
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