package com.kodilla.testing.shape;

public class Circle implements Shape {
    private final String shapeName;
    private final int field;

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
