package RealizationChats;
import User.Person;

import java.util.LinkedList;
import java.util.List;

//Принцип единственности
public abstract class AbstractChat {
    List<Person> groupOfNicknames;
    int count = 0;

    public AbstractChat() {
        groupOfNicknames = new LinkedList<>();
    }

}
