package ru.netology.javabasics.hw331;

import ru.netology.javabasics.hw331.user_roles.Librarian;
import ru.netology.javabasics.hw331.user_roles.Supplier;

public class LibrarianX implements Librarian {
    String name;

    LibrarianX(String name) {
        this.name = name;
    }

    @Override
    public void orderBook(Supplier supplier, Book book) {
        System.out.printf("Библиотекарь %s заказал(a) у поставщика книгу \"%s\"", supplier.getName(), book.getName());
        System.out.println();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
