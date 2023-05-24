package com.ab.prototype.example.factory;

import com.ab.prototype.example.components.BookCollection;
import com.ab.prototype.example.components.FictionalBooksCollection;
import com.ab.prototype.example.components.RealityBooksCollection;

public class BookCollectionFactory {
    public static BookCollection getBookCollection(String bookType) {
        BookCollection collection = null;
        
        if (bookType.equalsIgnoreCase("Fictional")) {
            collection = new FictionalBooksCollection();
        } else if (bookType.equalsIgnoreCase("RealityBooks")) {
            collection = new RealityBooksCollection();
        } else {
            throw new IllegalArgumentException("Invalid Books Type");
        }
        collection.loadBooks();
        return collection;
    }
}
