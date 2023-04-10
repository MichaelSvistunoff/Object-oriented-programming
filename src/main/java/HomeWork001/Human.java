package HomeWork001;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Human extends  BaseUnit {

    /* Position */
    private final String work;
    /* Who's your baby */
    private final String child;
    /* Role description*/
    private ArrayList roleDescription;

    public Human(int age, String name, String role, ArrayList roleDescription, String work, String child) {
        super(age, name, role);
        this.roleDescription = roleDescription;
        this.work = work;
        this.child = child;
    }

    public String getInfo() {
        if (!role.equals("Baby")) {
            return String.format("%s Role descr: %s Work: %s Children: %s",
                    super.getInfo(), this.roleDescription, this.work, this.child);
        }
        else {
            return String.format("%s",super.getInfo());
        }
    }
    public String getChild() {
        return child;
    }@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Human human = (Human) o;
        return Objects.equals(work, human.work) && Objects.equals(child, human.child) && Objects.equals(roleDescription, human.roleDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), work, child, roleDescription);
    }

}
