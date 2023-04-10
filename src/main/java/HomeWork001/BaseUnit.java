package HomeWork001;

import java.util.ArrayList;
import java.util.Objects;

public class BaseUnit {
    /** Age */
    protected int age;
    /** Name */
    protected String name;
    /** Role */
    protected String role;

    public BaseUnit(int age, String name, String role) {
        this.age = age;
        this.name = name;
        this.role = role;
    }

    public BaseUnit() {
    }

    public String getInfo() {
        return String.format("Type: %s  Name: %s  Age: %d Role: %s",
                this.getClass().getSimpleName(), this.name, this.age, this.role);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseUnit baseUnit = (BaseUnit) o;
        return age == baseUnit.age && Objects.equals(name, baseUnit.name) && Objects.equals(role, baseUnit.role);
    }
    @Override
    public int hashCode() {
        return Objects.hash(age, name, role);
    }

    public String getRole() {
        return role;
    }
    public String getName() {
        return name;
    }
}
