package edu.skypro.homework1_13;


import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publishingYear;

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }

    @Override
    public String toString() {
        return "Книгу " + bookName + " написал " + author + " и издал в " + publishingYear + " году.";
    }
}
