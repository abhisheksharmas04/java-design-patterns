package com.ab.prototype.example.test;

import com.ab.prototype.example.components.BookCollection;
import com.ab.prototype.example.factory.BookCollectionFactory;

public class Library1 {
    public static void main(String[] args) throws Exception{
        BookCollection fBooks = BookCollectionFactory.getBookCollection("Fictional");
        System.out.println(fBooks);

        BookCollection fBooks1 = BookCollectionFactory.getBookCollection("Fictional");
        System.out.println(fBooks1);
        // Remove one book using fbook1 from List collection
        fBooks1.getBookeList().remove(0);
        // To check weather fbook1 & fbook2 are using same chache or not.
        // Because of Shallow cloning the changes will reflect fbook which is against of Prototype DP
        // Shallow cloning is not suitable here
        System.out.println(fBooks.getBookeList().size() + " " + fBooks1.getBookeList().size());

        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();

        BookCollection RBooks = BookCollectionFactory.getBookCollection("RealityBooks");
        System.out.println(RBooks);
    }
}
