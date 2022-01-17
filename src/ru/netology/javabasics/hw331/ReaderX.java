package ru.netology.javabasics.hw331;

import ru.netology.javabasics.hw331.user_roles.Reader;

public class ReaderX implements Reader {
    String name;

    ReaderX(String name) {
        this.name = name;
    }

    @Override
    public void requestBook(Book book) {
        System.out.printf("Читатель %s хочет взять почитать книгу \"%s\"", this.name, book.getName());
        System.out.println();
    }

    @Override
    public void takeBook(Book book) {
        System.out.printf("Читатель %s взял(a) книгу \"%s\"", this.name, book.getName());
        System.out.println();
    }

    @Override
    public void returnBook(Book book) {
        System.out.printf("Читатель %s вернул(a) книгу \"%s\"", this.name, book.getName());
        System.out.println();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
