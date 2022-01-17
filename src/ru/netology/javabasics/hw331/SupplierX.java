package ru.netology.javabasics.hw331;

import ru.netology.javabasics.hw331.user_roles.Reader;
import ru.netology.javabasics.hw331.user_roles.Supplier;

public class SupplierX implements Supplier, Reader {
    String name;

    SupplierX(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void deliverBook(Book book) {
        System.out.printf("Поставщик %s доставил(а) книгу \"%s\" в библиотеку", this.name, book.getName());
        System.out.println();
    }

    @Override
    public void requestBook(Book book) {

    }

    @Override
    public void takeBook(Book book) {

    }

    @Override
    public void returnBook(Book book) {

    }
}
