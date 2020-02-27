package com.kodilla.testing.shape;

public class Circle implements Shape{

    private String shapeName;
    private double field;
    private double r;

    public Circle(String shapeName, double r) {
        this.shapeName = shapeName;
        this.r = r;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        field = Math.PI + Math.pow(r, 2);
        return this.field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.field, field) != 0) return false;
        if (Double.compare(circle.r, r) != 0) return false;
        return shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(field);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}