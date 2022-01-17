package ru.netology.javabasics.hw331.user_roles;

import ru.netology.javabasics.hw331.Book;

public interface Administrator extends User {
    void findBook(Book book);
    void giveBook(Book book, Reader reader);
    void checkDueDate(Book book, Reader reader);
    void notifyAboutOverdue(Book book, Reader reader);
}
