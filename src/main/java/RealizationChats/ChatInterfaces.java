package RealizationChats;
import User.Person;


// Разделение интерфейсов

interface ISendMessage {
    void sendMessage(String text, Person me);

    void sendMessage(String text, Person other, Person me);
}

interface IPrintMessage {
    void printMessage(String text, Person me);

    void printMessage(String text, Person me, Person other);
}

interface IAppend_delete {
    void appendClient(Person user);

    boolean deleteUser(Person user);
}


interface IGroup {
    void setAdmin(Person user);

    void setNameOfGroup(String nameOfGroup);

    void complainToUser(Person user);
}