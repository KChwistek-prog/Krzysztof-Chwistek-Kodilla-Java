package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    public List<Shape> shapeList = new ArrayList<>();

    public int getFiguresCount() {
        return shapeList.size();
    }

    void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    void removeFigure(Shape shape) {
        shapeList.remove(shape);

    }

    public Shape getFigure(int n) {
        return shapeList.get(n);
    }

    public String showFigures() {
        String figList = "";
        for(int i = 0; i < shapeList.size(); i++) {
            figList = figList + shapeList.get(i).getShapeName();
            figList = figList + ", ";
        }
        return figList;
    }

}
