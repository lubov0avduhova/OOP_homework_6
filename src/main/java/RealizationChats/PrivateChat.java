package RealizationChats;

import User.Person;


public class PrivateChat extends AbstractChat implements ISendMessage, IPrintMessage, IAppend_delete {


    @Override
    public void sendMessage(String text, Person me) {
        printMessage(text, me);
    }

    @Override
    public void sendMessage(String text, Person other, Person me) {
        printMessage(text, other, me);
    }

    public void printMessage(String text, Person me) {
        System.out.printf("\nЛогин - сообщение %s: %s", me, text);
    }


    public void printMessage(String text, Person me, Person other) {
        System.out.printf("\nЛогин - сообщение %s: %s - %s", me, other, text);
    }


    public void appendClient(Person other) {
        groupOfNicknames.add(count, other);
        count++;
    }

    public boolean deleteUser(Person user) {
        System.out.println("\nПользователь удален");
        return groupOfNicknames.remove(user);
    }
}
