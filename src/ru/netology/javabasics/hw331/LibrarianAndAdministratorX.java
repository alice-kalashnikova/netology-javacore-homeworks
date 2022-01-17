package ru.netology.javabasics.hw331;

import ru.netology.javabasics.hw331.user_roles.Administrator;
import ru.netology.javabasics.hw331.user_roles.Librarian;
import ru.netology.javabasics.hw331.user_roles.Reader;
import ru.netology.javabasics.hw331.user_roles.Supplier;

import java.util.Random;

public class LibrarianAndAdministratorX implements Librarian, Administrator {
    String name;

    LibrarianAndAdministratorX(String name) {
        this.name = name;
    }

    @Override
    public void orderBook(Supplier supplier, Book book) {
        System.out.printf("Библиотекарь %s заказал(a) у поставщика книгу \"%s\"", supplier.getName(), book);
        System.out.println();
    }

    @Override
    public void findBook(Book book) {

    }

    @Override
    public void giveBook(Book book, Reader reader) {
        System.out.printf("Библиотекарь-Администратор %s выдал(а) книгу \"%s\" читателю %s", this.name, book.getName(), reader.getName());
        System.out.println();
    }

    @Override
    public void checkDueDate(Book book, Reader reader) {
        System.out.printf("Библиотекарь-Администратор %s проверил(а) дату возврата книги \"%s\"", this.name, book.getName());
        System.out.println();
        Random random = new Random();
        double num = random.nextInt(100);
        if (num % 2 == 0) {
            book.setHasExpired(true);
        } else {
            book.setHasExpired(false);
        }
        if (book.hasExpired) {
            notifyAboutOverdue(book, reader);
        }
    }

    @Override
    public void notifyAboutOverdue(Book book, Reader reader) {
        System.out.printf("Библиотекарь-Администратор %s уведомил читателя %s о том, что просрочено время возврата книги \"%s\"", this.name, reader.getName(), book.getName());
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
