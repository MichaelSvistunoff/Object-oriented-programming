package HomeWork003.Units.Groups.FamilyType.Humans;

import HomeWork003.Units.Member;

import java.util.List;

public class GrandParent extends Member {
    /* Position at work */
    protected String position;
    /* List of children */
    protected List<String> children;

    /**
     * @param name     имя
     * @param age      возраст
     * @param role     статус
     * @param position должноатсь на работе
     * @param children дети
     */
    public GrandParent(String name, int age, String role, String position, List children) {
        super(name, age, role);
        this.position = position;
        this.children = children;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", super.toString(), position, children);
    }

    @Override
    public void sleep() {}
}
