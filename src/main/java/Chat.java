import java.util.LinkedList;
import java.util.List;

interface Chat {
    void sendMessage(String msg, User user);

    void appendClient(User user);
}

class OnebyOne implements Chat {
    List<User> groupOfNames;
    int count = 0;

    public OnebyOne() {
        groupOfNames = new LinkedList<>();
    }

    @Override
    public String toString() {
        return groupOfNames.toString();
    }

    public void getGroupOfNames() {
        System.out.println(groupOfNames.toString());
    }

    public void sendMessage(String text, User me) {
        me.printMessage(text);

    }

    public void sendMessageByDirect(String text, User badGuy, User me) {
        me.printMessageByDirect(text, badGuy);
    }


    public void appendClient(User user) {
        groupOfNames.add(count, user);
        count++;
    }

}


class IsGroup extends OnebyOne {
    private String nameOfGroup;
    private User isAdmin;


    public void setAdmin(User user) {
        isAdmin = user;
        System.out.printf("\nАдмин теперь %s", isAdmin.name);
    }

    public User getAdmin() {
        return isAdmin;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
        System.out.printf("\nГруппа называется теперь: %s", this.nameOfGroup);
    }

    List deleteUser(User user) {
        groupOfNames.remove(user);
        System.out.println("\nПользователь удален");
        return groupOfNames;
    }

    void complainToUser(User user) {
        System.out.printf("\nЖалоба на %s отправлена", user.name);
    }


}