package HomeWork002.Units.Furniture;

import HomeWork002.Units.Staff;

public class Furniture extends Staff {
    private String name;

    public Furniture(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }
}
