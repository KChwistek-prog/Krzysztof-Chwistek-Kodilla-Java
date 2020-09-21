package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private int field;

    public Circle(String shapeName, int field) {
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
