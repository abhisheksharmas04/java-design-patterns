package com.ab.flyweight.example.factory;

import com.ab.flyweight.example.component.Circle;
import com.ab.flyweight.example.component.Shape;
import com.ab.flyweight.example.component.Squre;

public class ShapeFactory {
    public static Shape getShape(String type) {
        Shape shape = null;

        if (type.equalsIgnoreCase("Square")) {
            shape = new Squre();
        } else if (type.equalsIgnoreCase("Circle")) {
            shape = new Circle();
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
        return shape;
    }
}
