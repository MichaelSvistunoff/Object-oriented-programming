package HomeWork003.Units.Groups.FamilyType;

import HomeWork003.Units.Group;
import HomeWork003.Units.Member;

import java.util.Iterator;

public class Family extends Group {

    @Override
    public Iterator<Member> iterator() {
        Iterator<Member> it = new Iterator<Member>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < members.size();
            }

            @Override
            public Member next() {
                return members.get(index++);
            }

        };
        return it;

    }
}
