package Probleme_incomode.pb1;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<String> contacts;
    private List<String> blackList;

    public PhoneBook(List<String> contacts, List<String> blackList) {
        this.contacts = contacts;
        this.blackList = blackList;
    }

    public PhoneBook(){
        this.contacts = new ArrayList<>();
        this.blackList = new ArrayList<>();
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public List<String> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    public static List<String> filterContacts(List<String> allContacts, List<String> blackList){
        for(String blackListContact: blackList){
            if(allContacts.contains(blackListContact)){
                allContacts.remove(blackListContact);
            }
        }
        return allContacts;
    }

    public void addToBlackList(String phoneNumber){
        blackList.add(phoneNumber);
        contacts.remove(phoneNumber);
        System.out.println(blackList);
        System.out.println(contacts);
    }

}
