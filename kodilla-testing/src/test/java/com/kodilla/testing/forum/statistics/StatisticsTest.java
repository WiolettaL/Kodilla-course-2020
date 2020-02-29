package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTest {

    private Statistics statisticsMock;
    private StatisticsCalculator statisticsCalculator;
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of the tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }

    @Before
    public void testData(){
        testCounter++;
        System.out.println("Preparing to execute test " + testCounter);

        statisticsMock = mock(Statistics.class);
        List<String> listForMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listForMock.add("ForumUser");
        }

        when(statisticsMock.usersName()).thenReturn(listForMock);
        when(statisticsMock.postsCount()).thenReturn(80);
        when(statisticsMock.commentsCount()).thenReturn(40);

        statisticsCalculator = new StatisticsCalculator();
    }

    @Test
    public void testForumPostsCountZero(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticsCalculator.getForumPostsCount());
    }

    @Test
    public void testForumPostsCountThousand(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, statisticsCalculator.getForumPostsCount());
    }

    @Test
    public void testForumCommentsCountZero(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticsCalculator.getForumCommentsCount());
    }

    @Test
    public void testForMorePostThanComment(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(5, statisticsCalculator.getForumCommentsCount());
        Assert.assertEquals(10, statisticsCalculator.getForumPostsCount());
        Assert.assertEquals(1, statisticsCalculator.getAvgUsersPosts(), 0.01);
        Assert.assertEquals(0.5, statisticsCalculator.getAvgUsersComments(),0.01);
        Assert.assertEquals(0.5, statisticsCalculator.getAvgCommentsPerPosts(),0.01);
    }

    @Test
    public void testMoreCommentsThanPost(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(20, statisticsCalculator.getForumCommentsCount());
        Assert.assertEquals(10, statisticsCalculator.getForumPostsCount());
        Assert.assertEquals(1, statisticsCalculator.getAvgUsersPosts(), 0.01);
        Assert.assertEquals(2, statisticsCalculator.getAvgUsersComments(),0.01);
        Assert.assertEquals(2, statisticsCalculator.getAvgCommentsPerPosts(),0.01);
    }

    @Test
    public void testForZeroUsers(){
        //Given
        List<String> listForMock = new ArrayList<>();
        when(statisticsMock.usersName()).thenReturn(listForMock);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticsCalculator.getForumUsersCount());
    }

    @Test
    public void testForHundredUsers(){
        //Given
        List<String> listForMock = new ArrayList<>();
        for (int i=0; i<100; i++){
            listForMock.add("ForumUser");
        }
        when(statisticsMock.usersName()).thenReturn(listForMock);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, statisticsCalculator.getForumUsersCount());
    }
}
