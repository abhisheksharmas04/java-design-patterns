package com.ab.prototype.example.components;

import java.util.ArrayList;
import java.util.List;

public abstract class BookCollection implements Cloneable {
    private String type;
    private List<Book> bookeList = new ArrayList<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Book> getBookeList() {
        return bookeList;
    }

    public void setBookeList(List<Book> bookeList) {
        this.bookeList = bookeList;
    }

    public abstract void loadBooks();

    @Override
    public String toString() {
        return "BookCollection [type=" + type + ", bookeList=" + bookeList + "]";
    }

}
