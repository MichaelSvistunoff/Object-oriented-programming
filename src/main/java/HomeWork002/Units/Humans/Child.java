package HomeWork002.Units.Humans;

import HomeWork002.Interface.HumanActions;
import HomeWork002.Units.BaseUnit;
import HomeWork002.Units.Furniture.Food;
import HomeWork002.Units.Furniture.Furniture;
import HomeWork002.Units.Pet;

public class Child extends BaseUnit implements HumanActions {

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
    public Child(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public Child() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void wakeUP() {

    }

    @Override
    public void makeFoodForPet(Pet pet) {

    }

    @Override
    public void preparingToWork() {

    }

    @Override
    public void eating(Furniture unit, Food food) {

    }

    @Override
    public void working() {

    }

    @Override
    public void goHome() {

    }

    @Override
    public void niceTimeWithFamily(BaseUnit unit, BaseUnit unit1) {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void makeFoodForPet() {

    }

    @Override
    public String getInfo() {
        return String.format("Name: %s Age: %d Role: %s",
                this.name, this.age, this.role);
    }
}
