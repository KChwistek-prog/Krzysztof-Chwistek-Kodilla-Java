package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.Arrays;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        if (bookSet.size() == 0) return 0;
        int[] year = new int[bookSet.size()];
        int x = 0;

        for (Book books : bookSet) {
            year[x] = books.getPublicationYear();
            x++;
        }

        Arrays.sort(year);
        if (year.length % 2 == 0) {
            return year[(int) (year.length / 2 + 0.5)];
        } else {
            return year[year.length / 2];

        }
    }
}
