package ru.netology.javabasics.hw331.user_roles;

import ru.netology.javabasics.hw331.Book;

public interface Librarian extends User {
    void orderBook(Supplier supplier, Book book);
}
