package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class LibraryTestSuite {


    @Test
    void testGetBooks() {
        //given
        Library library = new Library("Original Library");
        Book wiedzmin = new Book("Wiedzmin", "Sapkowski", LocalDate.now());
        Book wedrowycz = new Book("Wędrowycz", "Pilipiuk", LocalDate.now());
        Book potter = new Book("Harry", "Rowling", LocalDate.now());

        library.getBooks().add(wiedzmin);
        library.getBooks().add(wedrowycz);
        library.getBooks().add(potter);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Shalow Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deeplyClonedLibrary = null;
        try {
            deeplyClonedLibrary = library.deepCopy();
            deeplyClonedLibrary.setName("Deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(potter);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deeplyClonedLibrary);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deeplyClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deeplyClonedLibrary.getBooks(), library.getBooks());

    }

}
