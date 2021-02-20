package com.kodilla.testing.shape;

public class Triangle implements  Shape{
    private final String shapeName;
    private final int field;

    public Triangle(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getField() {
        return field;
    }
}
