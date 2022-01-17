package ru.netology.javabasics.hw431;

import java.util.*;

public class PhoneContacts {
    Map<String, List<Contact>> contactBook = new HashMap<>();

    public void addGroup(String name) {
        contactBook.put(name, new ArrayList<>());
    }

    public void addContact(String group, Contact contact) {
        if (!contactBook.keySet().contains(group)) {
            System.out.println("Такой группы не существует. Cперва создайте группу, чтобы добавить в нее контакт");
        } else {
            List<Contact> contacts = contactBook.get(group);
            contacts.add(contact);
            contactBook.put(group, contacts);
        }
    }

    public Map<String, List<Contact>> getContactBook() {
        return contactBook;
    }

    public Set<String> getGroups() {
        return contactBook.keySet();
    }
}
