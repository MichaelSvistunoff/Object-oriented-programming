package HomeWork003;

import HomeWork003.Units.Groups.FamilyType.Family;
import HomeWork003.Units.Groups.FamilyType.Humans.Baby;
import HomeWork003.Units.Groups.FamilyType.Humans.GrandParent;
import HomeWork003.Units.Groups.FamilyType.Humans.Parent;
import HomeWork003.Units.Groups.FamilyType.Pets.Cat;
import HomeWork003.Units.Groups.WorkType.Work;
import HomeWork003.Units.Groups.WorkType.Worker;
import HomeWork003.Units.Member;

import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        // Family group
        Family familyOne = new Family();
        familyOne.addMemeber(new Parent("Michael", 30, "Father", "Designer",
                Collections.singletonList("Maxim")));
        familyOne.addMemeber(new Parent("Elena", 25, "Mother", "Housewife",
                Collections.singletonList("Maxim")));
        familyOne.addMemeber(new Baby("Maxim", 1, "Baby"));
        familyOne.addMemeber(new GrandParent("Svetlana", 51, "Grandmother", "Entrepreneur",
                Collections.singletonList("Michael")));
        familyOne.addMemeber(new GrandParent("Andrey", 55, "Grandfather", "Engineer",
                Collections.singletonList("Michael")));
        familyOne.addMemeber(new Cat("Monika", 4, "Pet"));
        familyOne.addMemeber(new Cat("Lisa", 6, "Pet"));
        System.out.println("Members of family #1:");
        for (Member member : familyOne) {
            System.out.println(member);
        }
        //Some actions to add
        familyOne.getMember(0).sleep();

        // Work group
        Work collective = new Work();
        collective.addMemeber(new Worker("Michael", 30,
                "Regular staff", "Designer", 40_000));
        collective.addMemeber(new Worker("Olga", 46, "Regular staff", "Manager", 27_000));
        System.out.println("----------------------------\nMembers of work #1:");
        for (Member member : collective) {
            System.out.println(member);
        }
    }
}
