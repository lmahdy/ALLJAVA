public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin() {
        super();
        this.swimmingSpeed = 0;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed: " + swimmingSpeed + " km/h";
    }

    @Override
    public void swim() {
        System.out.println(getName() + " the dolphin is swimming at a speed of " + swimmingSpeed + " km/h.");
    }
}
