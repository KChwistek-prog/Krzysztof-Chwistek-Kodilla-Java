package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest(){
        //given
        MedianAdapter process = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("Author1", "Title1", 1987,"Signature1");
        Book book2 = new Book("Author2", "Title2", 1997,"Signature2");
        Book book3 = new Book("Author3", "Title3", 2007,"Signature3");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        //when
        int result = process.publicationYearMedian(bookSet);

        //then
        Assertions.assertEquals(1997, result);
    }
}
