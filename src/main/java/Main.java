import User.Person;
import User.User;

public class Main {
    public static void main(String[] args) {
        ICQ icq = new ICQ();

        //создаем профили пользователей

        Person firstUser = new User("Я первый");
        Person secondUser = new User("Я второй");
        Person thirdUser = new User("Я третий");
        Person forthUser = new User("Я четвертый");

        System.out.println("-----------------------");
        // приватный чат

        icq.privateChat.appendClient(firstUser);
        icq.privateChat.appendClient(secondUser);

        icq.privateChat.sendMessage("Привет второй!", firstUser);
        icq.privateChat.sendMessage("Привет первый! Как дела?", secondUser);


        // групповой чат
        icq.group.setNameOfGroup("Одна из первых");
        icq.group.appendClient(firstUser);
        icq.group.appendClient(secondUser);
        icq.group.appendClient(thirdUser);
        icq.group.appendClient(forthUser);

        icq.group.setAdmin(firstUser); //устанавиваем админа

        //переписка
        icq.group.sendMessage("Правила нашей группы:...", icq.group.getAdmin());
        icq.group.sendMessage("Я первый! Уху", secondUser);
        icq.group.sendMessage("Как у всех дела? Как настрой?", forthUser);
        icq.group.sendMessage("**** - плохое слово", thirdUser);


        icq.group.sendMessage("Ты нарушил правила группы. К сожалению, тебя придется удалить",
                thirdUser, icq.group.getAdmin());

        //удаление пользователя из чата
        icq.group.complainToUser(thirdUser);
        icq.group.deleteUser(thirdUser);

    }

}


