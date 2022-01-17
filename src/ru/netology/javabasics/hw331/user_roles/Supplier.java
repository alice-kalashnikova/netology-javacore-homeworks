package ru.netology.javabasics.hw331.user_roles;

import ru.netology.javabasics.hw331.Book;

public interface Supplier extends User {
    void deliverBook(Book book);

}
