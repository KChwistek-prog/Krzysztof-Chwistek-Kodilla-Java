package com.kodilla.testing.library;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    @Mock
   private LibraryDatabase libraryDatabaseMock;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }


    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        Assertions.assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {

            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                    .thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                    .thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                    .thenReturn(resultListOf40Books);

            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
            // Then

            Assertions.assertEquals(0, theListOfBooks0.size());
            Assertions.assertEquals(15, theListOfBooks15.size());
            Assertions.assertEquals(40, theListOfBooks40.size());
    }
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        Assertions.assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(1)).listBooksWithCondition(anyString());
    }
    @Test
    public void testListBooksInHandsOf(){
        //given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser john = new LibraryUser("John", "Doe", "988341");
        LibraryUser jane = new LibraryUser("Jane", "Doe", "976341");
        LibraryUser djin = new LibraryUser("Djin", "Doe", "988091");
        List<Book> rented0Books = new ArrayList<>();
        List<Book> rented1Book = generateListOfNBooks(1);
        List<Book> rented5Books = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(john))
                .thenReturn(rented0Books);
        when(libraryDatabaseMock.listBooksInHandsOf(jane))
                .thenReturn(rented5Books);
        when(libraryDatabaseMock.listBooksInHandsOf(djin))
                .thenReturn(rented1Book);

        //when
        rented0Books = bookLibrary.listBooksInHandsOf(john);
        rented1Book = bookLibrary.listBooksInHandsOf(djin);
        rented5Books = bookLibrary.listBooksInHandsOf(jane);

        //then
        Assertions.assertEquals(0, rented0Books.size());
        Assertions.assertEquals(1, rented1Book.size());
        Assertions.assertEquals(5, rented5Books.size());
    }
}