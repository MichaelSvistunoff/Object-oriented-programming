package HomeWork003.Units.Groups.FamilyType.Pets;

import HomeWork003.Units.Member;

public class Cat extends Member {
    /**
     * @param name имя
     * @param age  возраст
     * @param role статус
     */
    public Cat(String name, int age, String role) {
        super(name, age, role);
    }

    @Override
    public void sleep() {}
}
