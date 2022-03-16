package com.example.bookswithspring.services;

import com.example.bookswithspring.dao.BooksDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    BooksDao booksDao;

    MyService(BooksDao booksDao) {
        this.booksDao = booksDao;
    }

    public void addBook(String book) {
        if (!(booksDao.getList().contains(book))){
            booksDao.add(book);
        }
    }
    public void removeBook(String book) {
        if (booksDao.getList().contains(book)){
            booksDao.remove(book);
        }
    }
    public List<String> getList(){
        return booksDao.getList();
    }
}
