package com.cesarrosales.ve.shape;

import com.cesarrosales.ve.shape.factory.ShapeType;

/**
 * Created by César Rosales
 */
public class Circle implements Shape {

    private double radius;

    /**
     * simple constructor, set prototype circle to radius 1
     */
    public Circle(){
        this(1);
    }

    /**
     * initialize a new Circle
     * @param radius the radius of the circule
     */
    public Circle(double radius){
        if(this.isValid(radius)){
            this.radius = radius;
        }else{
            throw new IllegalArgumentException();
        }
    }

    /**
     *
     * @param radius radius of the circle
     * @return true if the given radius constructs a valid circle
     */
    private boolean isValid(double radius) {
        if(Double.isFinite(radius) && (radius > 0)){
            return true;
        }
        return false;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public ShapeType getType() {
        return ShapeType.CIRCLE;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;

    }

    /**
     * calcule the area and perimeter as part of the values shown
     * @return an string with all the values that conforms this object
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                '}';
    }

    /**
     *
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     *
     * @param radius the radius of the circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
