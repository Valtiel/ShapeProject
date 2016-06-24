package com.cesarrosales.ve.shape.factory;

import com.cesarrosales.ve.shape.Shape;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by César Rosales
 */
public class ShapeFactory {

    private static ShapeFactory ourInstance = new ShapeFactory();

    /**
     * @return the singleton instance of the ShapeFactory
     */
    public static ShapeFactory getInstance() {
        return ourInstance;
    }

    private ShapeFactory() {

    }

    /**
     * Create a Shape with the given ShapeType
     * @param shapeType the type of shape to create
     * @return the Shape with the given ShapeType
     */
    public Shape createShape(ShapeType shapeType){

        try {
            if(shapeType.shapeClass != null){
                return shapeType.shapeClass.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Create a Shape with the given ShapeType and custom initialization values
     * @param shapeType the type of shape to create
     * @param classes the values types
     * @param objects the values
     * @return the shape with the given values and ShapeType
     */
    public Shape createShape(ShapeType shapeType, Class<?>[] classes, Object ... objects) {

        try {
            if(shapeType.shapeClass != null){
                Constructor<?> objectConstructor = shapeType.shapeClass.getDeclaredConstructor(classes);
                return (Shape) objectConstructor.newInstance(objects);
            }
        } catch (SecurityException
                | InvocationTargetException
                | IllegalAccessException
                | IllegalArgumentException
                | NoSuchMethodException
                | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Create a Shape with the given .class and custom initialization values
     * @param objectClass the .class type of shape to create
     * @param classes the values types
     * @param objects the values
     * @return the shape with the given values and .class
     */
    public Shape createShape(Class<? extends Shape> objectClass, Class<?>[] classes, Object ... objects) {

        try {
            Constructor<?> objectConstructor = objectClass.getDeclaredConstructor(classes);
            return (Shape) objectConstructor.newInstance(objects);
        } catch (SecurityException
                | InvocationTargetException
                | IllegalAccessException
                | InstantiationException
                | IllegalArgumentException
                | NoSuchMethodException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Create a Shape with the given .class
     * @param objectClass the .class type of shape to create
     * @return the shape with the given .class
     */
    public Shape createShape(Class<? extends Shape> objectClass) {

        try {
            return objectClass.newInstance();
        } catch (SecurityException
                | IllegalArgumentException
                | InstantiationException
                | IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}
