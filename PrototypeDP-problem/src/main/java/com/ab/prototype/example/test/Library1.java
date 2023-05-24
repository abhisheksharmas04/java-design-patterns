package com.ab.prototype.example.test;

import com.ab.prototype.example.components.BookCollection;
import com.ab.prototype.example.factory.BookCollectionFactory;

public class Library1 {
    public static void main(String[] args) {
        BookCollection fBooks = BookCollectionFactory.getBookCollection("Fictional");
        System.out.println(fBooks);

        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();

        BookCollection RBooks = BookCollectionFactory.getBookCollection("RealityBooks");
        System.out.println(RBooks);
    }
}
