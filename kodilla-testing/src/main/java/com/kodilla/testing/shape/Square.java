package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName;
    private double field;
    private double a;
    private double b;

    public Square(String shapeName, double a, double b) {
        this.shapeName = shapeName;
        this.a = a;
        this.b = b;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        field = a * b;
        return this.field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.field, field) != 0) return false;
        if (Double.compare(square.a, a) != 0) return false;
        if (Double.compare(square.b, b) != 0) return false;
        return shapeName.equals(square.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(field);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}