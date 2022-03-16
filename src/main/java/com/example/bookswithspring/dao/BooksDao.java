package com.example.bookswithspring.dao;

import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class BooksDao {
    private final List<String> list = new LinkedList<>();
    BooksDao(){
        list.add("Hey");
        list.add("Good");
    }

    public List<String> getList() {
        return list;
    }

    public void add(String book) {
        list.add(book);
    }

    public void remove(String book) {
        list.remove(book);
    }
}
