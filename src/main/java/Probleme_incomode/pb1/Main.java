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
        blackList.add("33");
        blackList.add("34");
        System.out.println(PhoneBook.filterContacts(allContacts, blackList));

    }
}
