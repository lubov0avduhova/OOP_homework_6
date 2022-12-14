package User;

public class User implements Person {

    String nickname;

    public User(String name) {
        this.nickname = name;
    }


    public String toString() {
        return nickname;
    }
}
