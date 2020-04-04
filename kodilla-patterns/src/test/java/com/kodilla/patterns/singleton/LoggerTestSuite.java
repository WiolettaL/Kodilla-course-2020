package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void testLoggerSystem() {
        Logger.getInstance().log("login131");
    }

    @Test
    public void testGetLastLog() {
        //Given

        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Logged: " + lastLog);

        //Then
        Assert.assertEquals("login131", lastLog);
    }
}
