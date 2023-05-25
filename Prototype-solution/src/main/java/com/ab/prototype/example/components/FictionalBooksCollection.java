package com.ab.prototype.example.components;

public class FictionalBooksCollection extends BookCollection {

    @Override
    public void loadBooks() {
        // -- Write JDBC Code to get books from DB software and load into books
        // collection (List collection)

        Book book = null;
        System.out.println("Hitting database software to get Fictional Books");
        for (int i = 0; i <= 10; i++) {
            book = new Book(2000 + i, "Fictional Book--" + i);
            getBookeList().add(book);
        }
        System.out.println("Books are loaded into books collection from DB s/w  db table records");
    }

}
