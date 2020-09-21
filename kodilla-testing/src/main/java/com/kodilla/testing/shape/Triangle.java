package com.kodilla.testing.shape;

public class Triangle implements  Shape{
    private String shapeName;
    private int field;

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
