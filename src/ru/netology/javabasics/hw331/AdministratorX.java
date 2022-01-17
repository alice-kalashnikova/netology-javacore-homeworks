package ru.netology.javabasics.hw331;

import ru.netology.javabasics.hw331.user_roles.Administrator;
import ru.netology.javabasics.hw331.user_roles.Reader;

import java.util.Random;

public class AdministratorX implements Administrator {
    String name;

    AdministratorX(String name) {
        this.name = name;
    }

    @Override
    public void findBook(Book book) {
        System.out.printf("Администратор %s нашел(ла) книгу \"%s\"", this.name, book);
        System.out.println();
    }

    @Override
    public void giveBook(Book book, Reader reader) {
        System.out.printf("Администратор %s выдал(а) книгу \"%s\" читателю %s", this.name, book, reader.getName());
        System.out.println();
    }

    @Override
    public void checkDueDate(Book book, Reader reader) {
        Random random = new Random();
        double num = random.nextInt(100);
        System.out.println(num);
        if (num % 2 == 0) {
            book.setHasExpired(true);
            notifyAboutOverdue(book, reader);
        } else {
            book.setHasExpired(false);
        }
    }

    @Override
    public void notifyAboutOverdue(Book book, Reader reader) {
        System.out.printf("Администратор %s уведомил читателя %s о том, что просрочено время возврата книги \"%s\"", this.name, reader.getName(), book.getName());
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
