package ru.netology.javabasics.hw331;

public class Main {
    public static void main(String[] args) {
        LibrarianX librarian = new LibrarianX("Bacя");
        SupplierX supplier = new SupplierX("Петя");
        AdministratorX admin = new AdministratorX("Катя");
        ReaderX reader = new ReaderX("Аня");
        LibrarianAndAdministratorX librarianandadmin = new LibrarianAndAdministratorX("Вера");
        Book book = new Book("Игра Престолов");

        librarian.orderBook(supplier, book);
        supplier.deliverBook(book);
        reader.requestBook(book);

        librarianandadmin.findBook(book);
        book.setDueDate("15-06-2021");
        librarianandadmin.giveBook(book, reader);

        reader.takeBook(book);
        librarianandadmin.checkDueDate(book, reader);
        reader.returnBook(book);
    }
}
