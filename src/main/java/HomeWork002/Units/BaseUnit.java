package HomeWork002.Units;

import HomeWork002.Units.Furniture.Food;
import HomeWork002.Units.Furniture.Furniture;

public abstract class BaseUnit {
    public abstract String getInfo();

    public abstract void sleep();

    public abstract void wakeUP();

    public abstract void makeFoodForPet(Pet pet);

    public abstract void preparingToWork();

    public abstract void eating(Furniture unit, Food food);

    public abstract void working();

    public abstract void goHome();

    public abstract void niceTimeWithFamily(BaseUnit unit, BaseUnit unit1);

    public abstract String getName();
}