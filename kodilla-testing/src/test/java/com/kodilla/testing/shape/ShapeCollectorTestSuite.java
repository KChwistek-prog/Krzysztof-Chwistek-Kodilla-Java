package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;


@DisplayName("TDD: Testing Shape Collector")
public class ShapeCollectorTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Starting new test.");
    }
    @Nested
    @DisplayName("Tests for shapes")
    class testShapes {

        @Test
        void testAddFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("Circle", 6);

            //when
            shapeCollector.addFigure(circle);

            //then
            Assertions.assertEquals(circle, shapeCollector.getFigure(0));
        }


        @Test
        void testRemoveFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle("Triangle", 6);
            shapeCollector.addFigure(triangle);

            //when
            shapeCollector.removeFigure(triangle);

            //then
            Assertions.assertEquals(0, shapeCollector.getFiguresCount());
        }


        @Test
        void testGetFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square", 6);
            shapeCollector.addFigure(square);

            //when
            Shape expectedFigure = shapeCollector.getFigure(0);

            //then
            Assertions.assertEquals(square, expectedFigure);
        }

        @Test
        void testShowFigures() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle("Triangle", 6);
            Square square = new Square("Square", 6);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(square);

            //when
            String result = shapeCollector.showFigures();

            //then
            Assertions.assertEquals("Triangle, Square, ", result);
        }
    }
}

