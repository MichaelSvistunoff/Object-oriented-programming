package HomeWork001;

public class Pet extends BaseUnit {
    /* What type of animal: cat, dog, fish etc */
    private String type;

    public Pet(int age, String name, String role, String type) {
        super(age, name, role);
        this.type = type;
    }

    public String getInfo() {
        return String.format("%s  Type: %s",super.getInfo(), this.type);
    }
}
