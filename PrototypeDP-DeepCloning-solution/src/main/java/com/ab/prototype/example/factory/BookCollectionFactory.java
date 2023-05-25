package com.ab.prototype.example.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ab.prototype.example.components.Book;
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
        // Deep Cloning
        BookCollection originalCollection = cacheMap.get(bookType);
        BookCollection cloneBookCollection = (BookCollection) originalCollection.clone();
        
        String originalCollectionString = originalCollection.getType();
        String cType = new String(originalCollectionString);

        List<Book> oBooks = originalCollection.getBookeList();
        List<Book> cbooks = new ArrayList<>();

        for (Book book : oBooks) {
            Book cb = (Book) oBooks.clone();
        }

       return (BookCollection)cacheMap.get(bookType).clone(); // Shallow cloning
    }
}
// start watching again from 1:00:00

// Wrapper, String, StringBuffer and Collections are not clobeable by default.
