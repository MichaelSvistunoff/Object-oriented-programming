package HomeWork001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FTComands {
    /* Get family Tree */
    static List<BaseUnit> getFamilyTree() {
        //#region Humans
        BaseUnit humanOne = new Human(
                29,
                "Michael S.",
                "Parent",
                new ArrayList<>(List.of("Max's father", "Elena's husband")),
                "Designer",
                "Maxim S.");
        BaseUnit humanTwo = new Human(
                25,
                "Elena K.",
                "Parent",
                new ArrayList<>(Arrays.asList("Max's mother", "Michael's wife", "Viktor's daughter")),
                "Housewife",
                "Maxim S.");
        BaseUnit humanThree = new Human(
                1,
                "Maxim S.",
                "Baby",
                new ArrayList<>(List.of()),
                "",
                "");
        BaseUnit humanFour = new Human(
                51,
                "Svetlana S.",
                "Grandmother",
                new ArrayList<>(List.of("Max's grandmother", "Michael's mother", "Andrey's wife")),
                "Entrepreneur",
                "Michael S.");
        BaseUnit humanFive = new Human(
                55,
                "Andrey S.",
                "Grandfather",
                new ArrayList<>(List.of("Max's grandfather", "Michael's father", "Svetlana's husband")),
                "Engineer",
                "Michael S.");
        BaseUnit humanSix = new Human(
                2,
                "Olivia L.",
                "Baby",
                new ArrayList<>(List.of()),
                "",
                "");
        BaseUnit humanSeven = new Human(
                32,
                "Yuri L.",
                "Parent",
                new ArrayList<>(List.of("Michael's Brother", "Olivia's father", "Lyudmila's husband")),
                "Manager",
                "Olivia L.");
        BaseUnit humanEight = new Human(
                30,
                "Lyudmila L.",
                "Parent",
                new ArrayList<>(List.of("Olivia's mother")),
                "Nurse",
                "Olivia L.");
        BaseUnit humanNine = new Human(
                23,
                "Angelika K.",
                "Sister",
                new ArrayList<>(List.of("Elena's sister")),
                "Manager",
                "");
        BaseUnit humanTen = new Human(
                55,
                "Viktor K.",
                "Grandfather",
                new ArrayList<>(List.of("Max's grandfather", "Elena's father", "Svetlana's husband")),
                "Farmer",
                "Elena K.");
        BaseUnit humanEleven = new Human(
                55,
                "Svetlana K.",
                "Grandmother",
                new ArrayList<>(List.of("Max's grandmother", "Elena's mother", "Viktor's wife")),
                "Manager",
                "Elena K.");
        //#endregion

        //#region Pets
        BaseUnit petOne = new Pet(4, "Monika", "Pet", "Cat");
        BaseUnit petTwo = new Pet(7, "Lisa", "Pet", "Cat");
        BaseUnit petThree = new Pet(4, "Aeron", "Pet", "Dog");
        //#endregion

        //#region FamilyList
        List<BaseUnit> familyOne = new ArrayList<>();
        Collections.addAll(familyOne, humanOne, humanTwo, humanThree, humanFour, humanFive, humanSix, humanSeven,
                humanEight, humanNine,humanTen, humanEleven);
        //#endregion

        return familyOne;
    }

    /* Show parents only */
    static void getParentsFromFT() {
        for (int i = 0; i < getFamilyTree().size(); i++) {
            if (getFamilyTree().get(i).getRole().equals("Parent")) {
                System.out.println(getFamilyTree().get(i).getInfo());
            }
        }
    }
    static void getParentsByChild(Human child, List familyTree) {
        List<Human> temp = new ArrayList<>(familyTree);
        List<Human> parents = new ArrayList<>();

        for (int i = 0; i < temp.size(); i++) {
            if (child.getName().equals(temp.get(i).getChild())) {
                parents.add((Human) temp.get(i));
            }
        }

        System.out.printf("%s has next relations:%n", child.getName());

        for (int i = 0; i < parents.size(); i++) {
            System.out.println(parents.get(i).getInfo());
        }
    }
}
