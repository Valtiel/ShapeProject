package com.cesarrosales.ve.shape.factory;

import com.cesarrosales.ve.shape.Circle;
import com.cesarrosales.ve.shape.Shape;
import com.cesarrosales.ve.shape.Square;
import com.cesarrosales.ve.shape.Triangle;

/**
 * Created by César Rosales
 */
public enum ShapeType {

    CIRCLE(Circle.class), SQUARE(Square.class), TRIANGLE(Triangle.class), NOT_REGISTERED(null);

    public Class<? extends Shape> shapeClass;

    ShapeType(Class<? extends Shape> b) {
        this.shapeClass = b;
    }
}
