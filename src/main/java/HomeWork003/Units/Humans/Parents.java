package HomeWork003.Units.Humans;

import HomeWork002.Interface.HumanActions;
import HomeWork003.Units.BaseUnit;
import HomeWork003.Units.Furniture.Food;
import HomeWork003.Units.Furniture.Furniture;
import HomeWork003.Units.Pet;

public class Parents extends BaseUnit implements HumanActions {
    /* Name */
    private String name;
    /* Age */
    private Integer age;
    /* Family role */
    private String role;
    private String position;
    /* Children */
    private String child;

    /**
     * @param name     - имя
     * @param age      - возраст
     * @param role     - роль в семье
     * @param position - должность
     * @param child    - ребенок
     */
    public Parents(String name, Integer age, String role, String position, String child) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.position = position;
        this.child = child;
    }

    public Parents() {
    }

    public String getName() {
        return this.name;
    }

    public String getInfo() {
        return String.format("Name: %s Age: %d Role: %s Position: %s Child: %s",
                this.name, this.age, this.role, this.position, this.child);
    }

    @Override
    public void sleep() {
        System.out.println("Shhhhhhh....");
    }

    @Override
    public void wakeUP() {
        System.out.println("Owwwwwww...Brrrrrr...");
    }

    @Override
    public void makeFoodForPet() {

    }

    @Override
    public void working() {
        System.out.println("I'm busy right now! *from 09:00 to 18:00");
    }

    @Override
    public void goHome() {
        System.out.println("*going home from work");
    }

    @Override
    public void niceTimeWithFamily(BaseUnit unit, BaseUnit unit1) {
        System.out.printf("*having nice time with %s and %s", unit.getName(), unit1.getName());
    }

    @Override
    public void makeFoodForPet(Pet pet) {
        System.out.printf("*making some food for %s", pet.getName());
    }

    public void eating(Furniture unit, Food food) {
        System.out.printf("*eating %s on the %s", food.getName(), unit.getName());
    }

    @Override
    public void preparingToWork() {
        System.out.println("*preparing to work: washing, dressing, doing to work...");
    }
}
