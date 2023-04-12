package HomeWork002.Units.Pets;

import HomeWork002.Interface.PetActions;
import HomeWork002.Units.BaseUnit;
import HomeWork002.Units.Pet;

public class Cat extends Pet implements PetActions {
    /* Name */
    private String name;
    /* Age */
    private Integer age;
    /* Family role */
    private String role;

    /**
     * @param name - имя
     * @param age  - возраст
     * @param role - роль в семье
     */
    public Cat(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public Cat() {
    }

    public String getInfo() {
        return String.format("Name: %s Age: %d Role: %s",
                this.name, this.age, this.role);
    }

    public String getName() {
        return this.name;
    }

    public void voice() {
        System.out.println("meoooooowww...");
    }
}
