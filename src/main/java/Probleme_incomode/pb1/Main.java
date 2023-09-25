package Probleme_incomode.pb1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        List<String> allContacts = new ArrayList<>();
        allContacts.add("23");
        allContacts.add("34");
        allContacts.add("56");

        List<String> blackList = new ArrayList<>();
        blackList.add("23");
        blackList.add("34");
        blackList.add("56");

        phoneBook.setContacts(allContacts);
        phoneBook.setBlackList(blackList);

        PhoneBook phoneBook1 = new PhoneBook(allContacts, blackList);

        phoneBook.getContacts().add("23");
        phoneBook.getContacts().add("34");
        phoneBook.getContacts().add("56");
        // List<String> blackList = new ArrayList<>();
        phoneBook.getBlackList().add("23");
        phoneBook.getBlackList().add("33");
        phoneBook.getBlackList().add("34");
        //System.out.println(PhoneBook.filterContacts(allContacts, blackList));
        phoneBook.addToBlackList("56");
        System.out.println(phoneBook.getContacts());
        System.out.println(phoneBook.getBlackList() );

    }
}
