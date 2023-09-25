package Probleme_incomode.pb1;

import java.util.List;

public class PhoneBook {

    List<String> contacts;
    List<String> blackList;


    public static List<String> filterContacts(List<String> allContacts, List<String> blackList){
        for(String contact: allContacts){
            if(blackList.contains(contact)){
                allContacts.remove(contact);
            }
        }
        return allContacts;
    }

}
