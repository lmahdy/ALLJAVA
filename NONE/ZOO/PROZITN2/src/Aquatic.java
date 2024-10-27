public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public Aquatic() {
        super();
        this.habitat = "Unknown";
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }

    // Méthode swim pour les animaux aquatiques
    // Abstract swim method: subclasses must provide their own implementation
    public abstract void swim();
}