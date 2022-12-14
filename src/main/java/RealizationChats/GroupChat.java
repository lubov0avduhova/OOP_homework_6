package RealizationChats;

import User.Person;

// Принцип Лисков
public class GroupChat extends PrivateChat implements IGroup {
    private String nameOfGroup;
    private Person isAdmin;


    public void setAdmin(Person user) {
        isAdmin = user;
        System.out.printf("\nАдмин теперь %s", isAdmin);
    }

    public Person getAdmin() {
        return isAdmin;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
        System.out.printf("\nГруппа называется теперь: %s", this.nameOfGroup);
    }

    public void complainToUser(Person user) {
        System.out.printf("\nЖалоба на %s отправлена", user);
    }


}
