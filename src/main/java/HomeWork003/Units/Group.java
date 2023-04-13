package HomeWork003.Units;

import java.util.ArrayList;
import java.util.List;

public abstract class Group implements Iterable<Member> {
    /* List of members */
    public List<Member> members;
    /* Index to show */
    int index;

    public Group() {
        members = new ArrayList<>();
        index = 0;
    }

    public Member getMember(int index) {
        return members.get(index);
    }

    public void addMemeber(Member member) {
        members.add(member);
    }
}
