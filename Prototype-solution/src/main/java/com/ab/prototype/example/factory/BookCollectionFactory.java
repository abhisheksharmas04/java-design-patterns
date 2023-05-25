package com.ab.prototype.example.factory;

import java.util.HashMap;
import java.util.Map;

import com.ab.prototype.example.components.BookCollection;
import com.ab.prototype.example.components.FictionalBooksCollection;
import com.ab.prototype.example.components.RealityBooksCollection;

public class BookCollectionFactory {
    private static Map<String, BookCollection> cacheMap = new HashMap<>();

    static{
        // In Application startup itself load the all types of books from DB s/w and keep them in cache
        BookCollection fCollectoin = new FictionalBooksCollection();
        fCollectoin.loadBooks();

        BookCollection rCollectoin = new RealityBooksCollection();
        rCollectoin.loadBooks();

        //Keep the book collection in cache
        cacheMap.put("Fictional", fCollectoin);
        cacheMap.put("RealityBooks", rCollectoin);
    }

    public static BookCollection getBookCollection(String bookType) throws Exception{
       return (BookCollection)cacheMap.get(bookType).clone(); // Shallow cloning
    }
}
