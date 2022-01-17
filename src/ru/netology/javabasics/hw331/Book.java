package ru.netology.javabasics.hw331;

public class Book {
    String name;
    String author;
    String dueDate;
    boolean hasExpired;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDueDate() {
        return dueDate;
    }

    public boolean isHasExpired() {
        return hasExpired;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setHasExpired(boolean hasExpired) {
        this.hasExpired = hasExpired;
    }
}
