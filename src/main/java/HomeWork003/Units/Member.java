package HomeWork003.Units;

public abstract class Member {
    /* Name */
    protected String name;
    /* Age */
    protected Integer age;
    /* Role */
    protected String role;

    /**
     * @param name имя
     * @param age  возраст
     * @param role статус
     */
    public Member(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", name, age, role);
    }

    @Override
    public boolean equals(Object obj) {
        Member m = (Member) obj;
        return m.name == this.name;
    }

    public abstract void sleep();
}
