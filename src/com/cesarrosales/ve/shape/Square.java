package com.cesarrosales.ve.shape;

import com.cesarrosales.ve.shape.factory.ShapeType;

/**
 * Created by César Rosales
 */
public class Square implements Shape {

    private double side;

    /**
     * simple constructor, set prototype square to 1
     */
    public Square() {
        this(1);
    }

    /**
     *
     * @param side one side of the square
     */
    public Square(double side) {
        if(this.isValid(side)){
            this.side = side;
        }else{
            throw new IllegalArgumentException();
        }
    }

    /**
     *
     * @param side
     * @return true if the given side constructs a valid square
     */
    private boolean isValid(double side) {
        if(Double.isFinite(side) && side>0){
            return true;
        }
        return false;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public ShapeType getType() {
        return ShapeType.SQUARE;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(side);
        return (int) (temp ^ (temp >>> 32));
    }

    /**
     *
     * @return
     */
    public double getSide() {
        return side;
    }

    /**
     *
     * @param side
     */
    public void setSide(double side) {
        this.side = side;
    }
}
