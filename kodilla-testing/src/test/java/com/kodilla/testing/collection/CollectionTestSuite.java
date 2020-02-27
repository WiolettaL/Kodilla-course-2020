package com.kodilla.testing.collection;
import org.junit.*;
import java.util.ArrayList;


public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("\nTest Case: start");
    }

    @After
    public void after() {
        System.out.println("Test Case: end \n");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        System.out.println("Testing if the list is empty...");
        //Then
        Assert.assertTrue(emptyList.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(4);
        normalList.add(6);
        normalList.add(19);
        normalList.add(34);
        normalList.add(47);
        normalList.add(51);

        //When
        ArrayList<Integer> testedList = oddNumbersExterminator.exterminate(normalList);

        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(4);
        expectedList.add(6);
        expectedList.add(34);

        //Then
        Assert.assertEquals(expectedList, testedList);
    }
}