package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (titleFragment.length() < 3) return bookList;
        bookList = resultList;
        if (resultList.size() > 20) return bookList;

        return bookList;
    }

    public List<Book>listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        List<Book> bookList = new ArrayList<>();
        if(resultList.size() == 0) {
            return bookList;
        }
        return resultList;
    }
}