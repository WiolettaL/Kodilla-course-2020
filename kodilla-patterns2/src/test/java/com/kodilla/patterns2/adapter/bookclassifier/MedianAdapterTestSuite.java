package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookLibraryA = new HashSet<>();
        bookLibraryA.add(new Book("Author1",
                "Title1",
                1992,
                "11111111"));
        bookLibraryA.add(new Book("Author2",
                "Title2",
                1982,
                "2222222"));
        bookLibraryA.add(new Book("Author3",
                "Title3",
                1973,
                "3333333"));
        bookLibraryA.add(new Book("Author4",
                "Title4",
                2004,
                "444444"));
        bookLibraryA.add(new Book("Author5",
                "Title5",
                1995,
                "55555"));

        //When
        int median = medianAdapter.publicationYearMedian(bookLibraryA);

        //Then
        Assert.assertEquals(1992, median);
    }
}