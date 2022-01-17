package ru.netology.javabasics.hw431;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneContacts phoneContacts = new PhoneContacts();

        System.out.println("Программа справочник");
        System.out.println("Введите название группы контактов:");
        String input = scanner.nextLine();
        phoneContacts.addGroup(input);

        while(true) {
            System.out.println("Создать еще одну группу (введите название или введите \"нет\")?");
            input = scanner.nextLine();
            if (input.equals("нет")) {
                break;
            } else {
                phoneContacts.addGroup(input);
            }
        }

        while(true) {
            System.out.println("Создать контакт (введите наименование и его номер или введите \"нет\")?");
            //todo: не введен номер телефона
            input = scanner.nextLine();
            String inputArray[] = input.split(" ");
            if (input.equals("нет")) {
                break;
            } else {
                if (inputArray.length < 2) {
                    System.out.println("Вы не ввели имя или номер телефона");
                    continue;
                } else {
                    String name = inputArray[0];
                    String phone = inputArray[1];
                    Contact contact = new Contact(name, phone);
                    System.out.println("Укажите группы контакта через пробел");
                    String groups = scanner.nextLine();
                    String groupsArray[] = groups.split(" ");
                    for (int i = 0; i < groupsArray.length; i++) {
                        phoneContacts.addContact(groupsArray[i], contact);
                    }
                }
            }
        }
        System.out.println("Группы в справочнике:");
        for (String group: phoneContacts.getGroups()) {
            List<Contact> contacts = phoneContacts.getContactBook().get(group);
            if (!contacts.isEmpty()) {
                System.out.println("- " + group);
                for(Contact contact: contacts) {
                    System.out.println("\tИмя: " + contact.getName() + ", Телефон: " + contact.getPhoneNumber());
                }
            }
        }
    }
}
