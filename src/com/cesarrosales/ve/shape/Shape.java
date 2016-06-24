package com.cesarrosales.ve.shape;

import com.cesarrosales.ve.shape.factory.ShapeType;

/**
 * Created by César Rosales
 */
public interface Shape {

    /**
     * the area of the shape
     * @return
     */
    double getArea();

    /**
     *
     * @return the type of the shape
     */
    ShapeType getType();

    /**
     * the perimeter of the shape
     * @return
     */
    double getPerimeter();

}
