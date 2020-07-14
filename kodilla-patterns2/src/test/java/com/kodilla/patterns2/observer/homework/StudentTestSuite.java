package com.kodilla.patterns2.observer.homework;
import org.junit.Assert;
import org.junit.Test;

public class StudentTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Student iza = new Student("Iza");
        Student rafi = new Student("Rafał");
        Student pawel = new Student("Paweł");
        Mentor mentor1 = new Mentor("Erwin The Mentor");
        Mentor mentor2 = new Mentor("Andrzej The Mentor");

        iza.registerObserver(mentor1);
        rafi.registerObserver(mentor1);
        pawel.registerObserver(mentor2);
        rafi.registerObserver(mentor2);

        //When
        iza.addTask("Task 1");
        rafi.addTask("Task 2");
        rafi.addTask("Task 4");
        pawel.addTask("Task 1");
        pawel.addTask("Task 3");

        //Then
        Assert.assertEquals(3, mentor1.getUpdateCount());
        Assert.assertEquals(4, mentor2.getUpdateCount());
    }
}
