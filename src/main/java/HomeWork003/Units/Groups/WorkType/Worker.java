package HomeWork003.Units.Groups.WorkType;

import HomeWork003.Units.Member;

import java.util.List;

public class Worker extends Member {
    /* Position at work */
    protected String position;
    /* List of children */
    protected Integer salary;

    /**
     * @param name     имя
     * @param age      возраст
     * @param role     статус
     * @param position должноатсь на работе
     * @param salary зарплата
     */
    public Worker(String name, int age, String role, String position, int salary) {
        super(name, age, role);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", super.toString(), position, salary);
    }

    @Override
    public void sleep() {}
}
