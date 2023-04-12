package HomeWork002;

import HomeWork002.Units.BaseUnit;
import HomeWork002.Units.Furniture.Food;
import HomeWork002.Units.Furniture.Furniture;
import HomeWork002.Units.Humans.Child;
import HomeWork002.Units.Humans.Parents;
import HomeWork002.Units.Pet;
import HomeWork002.Units.Pets.Cat;
import HomeWork002.Units.Staff;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // Let's create and fill a family
        List<BaseUnit> family = new ArrayList<>();
        family.add(new Parents("Michael", 30, "Father", "Designer", "Maxim"));
        family.add(new Parents("Elena", 25, "Mother", "Housewife", "Maxim"));
        family.add(new Child("Maxim", 1, "Baby"));

        List<Pet> familysPet = new ArrayList<>();
        familysPet.add(new Cat("Monika", 4, "Pet"));

        List<Staff> furnitureList = new ArrayList<>();
        furnitureList.add(new Furniture("Kitchen"));
        furnitureList.add(new Furniture("Couch"));

        List<Staff> foodLits = new ArrayList<>();
        foodLits.add(new Food("Cake"));
        foodLits.add(new Food("Some cool fod with meat"));

        /* Let's show Father's Day */
        System.out.println();   // Divider
        System.out.println("Father's day:");
        family.get(0).sleep();
        System.out.println("*alarm at 07:30");
        family.get(0).wakeUP();
        familysPet.get(0).voice();
        family.get(0).makeFoodForPet(familysPet.get(0));
        System.out.println();   // Divider
        family.get(0).eating((Furniture) furnitureList.get(0), (Food) foodLits.get(0));
        System.out.println();   // Divider
        family.get(0).preparingToWork();
        family.get(0).working();
        family.get(0).goHome();
        family.get(0).niceTimeWithFamily(family.get(1), family.get(2));
        System.out.println();   // Divider
        System.out.println("Walking outside, having some shopping etc");
        family.get(0).eating((Furniture) furnitureList.get(1), (Food) foodLits.get(1));
        System.out.println();   // Divider
        family.get(0).sleep();
    }
}
