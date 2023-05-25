package com.ab.prototype.example.components;

import java.io.Serializable;

public class Book implements Serializable {
    private int bookId;
    private String bookName;

    public Book(int bookId, String bookName) {
        System.out.println("Book class two param constructor");
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
