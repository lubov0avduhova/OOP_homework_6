public class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    void printMessage(String msg) {
        System.out.printf("\nЛогин - сообщение %s: %s", name, msg);
    }

    void printMessageByDirect(String msg, User badGuy) {
        System.out.printf("\nЛогин - сообщение %s: %s - %s",name, badGuy.name, msg);
    }

}
