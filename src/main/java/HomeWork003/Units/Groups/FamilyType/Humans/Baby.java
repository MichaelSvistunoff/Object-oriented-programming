package HomeWork003.Units.Groups.FamilyType.Humans;

import HomeWork003.Units.Member;

public class Baby extends Member {
    /**
     * @param name имя
     * @param age  возраст
     * @param role статус
     */
    public Baby(String name, int age, String role) {
        super(name, age, role);
    }

    @Override
    public void sleep() {}
}
