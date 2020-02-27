package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

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
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test " + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Before
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle", 5);
        Square square = new Square("square", 8, 8);
        Triangle triangle = new Triangle("triangle", 7, 5);
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        //Then
        Assert.assertEquals(3, shapeCollector.getShapesSize());
    }

    @Test
    public void testRemoveFigure(){
        //Before
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle", 5);
        shapeCollector.addFigure(circle);
        Square square = new Square("square", 8, 8);
        shapeCollector.addFigure(square);
        Triangle triangle = new Triangle("triangle", 7, 5);
        shapeCollector.addFigure(triangle);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(2, shapeCollector.getShapesSize());
    }

    @Test
    public void testGetFigure(){
        //Before
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle", 5);
        shapeCollector.addFigure(circle);
        Square square = new Square("square", 8, 8);
        shapeCollector.addFigure(square);
        Triangle triangle = new Triangle("triangle", 7, 5);
        shapeCollector.addFigure(triangle);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, result);
    }
}
