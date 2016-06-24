package com.testwithshapes.ve;

import com.cesarrosales.ve.shape.Shape;
import com.cesarrosales.ve.shape.factory.ShapeType;

/**
 * this is just a test oriented class to mimic an external
 * and unregistered shape into the factory class
 * just like it were the implementation of a shape from a third party.
 * Created by César Rosales
 */
public class Rectangle implements Shape {

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public ShapeType getType() {
        return null;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{}";
    }
}
