package HomeWork001;

import static HomeWork001.FTComands.*;
import static HomeWork001.FTComands.getParentsByChild;

public class Program {
    public static void main(String[] args) {
        getRelations();
    }

    private static void getRelations() {
        // Divider
        System.out.println("------------------------------------ All family tree");

        // Show the full family tree
        for (int i = 0; i < getFamilyTree().size(); i++) {
            System.out.printf("%d:\t%s%n", i, getFamilyTree().get(i).getInfo());
        }

        // Divider
        System.out.println("------------------------------------ Show just parents: ");

        // Show parents
        getParentsFromFT();

        // Divider
        System.out.println("------------------------------------ Show parents by baby: ");
        getParentsByChild((Human) getFamilyTree().get(2), getFamilyTree());
        getParentsByChild((Human) getFamilyTree().get(5), getFamilyTree());
        getParentsByChild((Human) getFamilyTree().get(0), getFamilyTree());
        getParentsByChild((Human) getFamilyTree().get(1), getFamilyTree());
    }
}