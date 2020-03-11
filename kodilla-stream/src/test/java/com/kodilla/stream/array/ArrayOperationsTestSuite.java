package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbersArray = {1, 9, 9, 4, 8, 4, 1, 8, 9, 1, 1, 9, 9, 4, 8, 4, 1, 8, 9, 1};

        //When
        double testedArray = ArrayOperations.getAverage(numbersArray);
        System.out.println(testedArray);

        //Then
        Assert.assertEquals(5.4, testedArray, 0);

    }
}
