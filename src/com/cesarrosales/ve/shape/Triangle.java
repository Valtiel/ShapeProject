package com.cesarrosales.ve.shape;

import com.cesarrosales.ve.shape.factory.ShapeType;

/**
 * Created by César Rosales 
 */
public class Triangle implements Shape {

    private double a;
    private double b;
    private double c;

    /**
     * simple constructor, set prototype triangle to 1, 1, 1
     */
    public Triangle() {
        this(1,1,1);
    }

    /**
     * @param l side of equilateral triangle
     */
    public Triangle(double l){
        this(l,l,l);
    }

    /**
     *
     * @param a side of triangle A
     * @param b side of triangle B
     * @param c side of triangle C
     */
    public Triangle(double a, double b, double c) {
        if (this.isValid(a,b,c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    /**
     *
     * @param a side of triangle A
     * @param b side of triangle B
     * @param c side of triangle C
     * @return true if the given sides constructs a valid triangle
     */
    private boolean isValid(double a, double b, double c) {
        double s = (a+b+c)/2;
        if (((s-a)*(s-b)*(s-c))<=0){
            return false;
        }
        return true;
    }

    /**
     *
     * @return calcule and return the perimeter of the triangle
     */
    public double getPerimeter() {
        return a+b+c;
    }

    /**
     *
     * @return calcule and return the area of the triangle
     */
    @Override
    public double getArea() {
        double area, s;
        s = (a+b+c)/2;
        return  (double) Math.sqrt(s *(s-a) * (s-b) * (s-c));
    }

    /**
     *
     * @return the type of the shape
     */
    @Override
    public ShapeType getType() {
        return ShapeType.TRIANGLE;
    }

    /**
     * calcule the area and perimeter as part of the values shown
     * @return an string with all the values that conforms this object
     */
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.a, a) != 0) return false;
        if (Double.compare(triangle.b, b) != 0) return false;
        return Double.compare(triangle.c, c) == 0;

    }

    /**
     *
     * @return A
     */
    public double getA() {
        return a;
    }

    /**
     *
     * @param a side A of the Triangle
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     *
     * @return B
     */
    public double getB() {
        return b;
    }

    /**
     *
     * @param b
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     *
     * @return
     */
    public double getC() {
        return c;
    }

    /**
     *
     * @param c
     */
    public void setC(double c) {
        this.c = c;
    }
}
