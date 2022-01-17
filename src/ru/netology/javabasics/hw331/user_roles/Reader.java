package ru.netology.javabasics.hw331.user_roles;

import ru.netology.javabasics.hw331.Book;

public interface Reader extends User {
    void requestBook(Book book);
    void takeBook(Book book);
    void returnBook(Book book);
}
