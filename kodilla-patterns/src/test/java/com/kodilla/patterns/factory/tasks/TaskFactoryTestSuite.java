package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task doShopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        String taskName = doShopping.getTaskName();

        //Then
        Assert.assertEquals("Buy new lamp", taskName);
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task doPainting = factory.makeTask(TaskFactory.PAINTING_TASK);
        String taskName = doPainting.getTaskName();

        //Then
        Assert.assertEquals("Paint the table", taskName);
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task doDrive = factory.makeTask(TaskFactory.DRIVING_TASK);
        String taskName = doDrive.getTaskName();

        //Then
        Assert.assertEquals("Spring tour", taskName);
    }
}
