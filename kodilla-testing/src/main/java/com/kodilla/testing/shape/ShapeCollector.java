package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private String showFigures;
    private  int i = 0;

    public ArrayList<Shape> shapeList = new ArrayList<>();

    public String getShowFigures() {
        return showFigures;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape shape = shapeList.get(n);
        if(n < 0 || n >= shapeList.size()) {
            return null;
        } else {
            return shapeList.get(n);
        }
    }

    public void showFigures() {
        showFigures = "";
        for(Object elements : shapeList) {
            if(i != 0 && i < shapeList.size()) {
                showFigures = showFigures + " " + elements.toString();
            }
            i++;
        }
    }

    public Object getShapesSize() {
        return shapeList.size();
    }
}
