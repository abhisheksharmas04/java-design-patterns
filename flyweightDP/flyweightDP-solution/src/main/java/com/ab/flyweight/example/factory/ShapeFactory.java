package com.ab.flyweight.example.factory;

import java.util.HashMap;
import java.util.Map;

import com.ab.flyweight.example.component.Circle;
import com.ab.flyweight.example.component.Shape;
import com.ab.flyweight.example.component.Square;

public class ShapeFactory {
    private static Map<String, Shape> cacheMap = new HashMap<>();

    public static Shape getShape(String type) {
        Shape shape = null;

        if(! cacheMap.containsKey(type)){
            if (type.equalsIgnoreCase("Square")) {
                shape = new Square();
            } else if (type.equalsIgnoreCase("Circle")) {
                shape = new Circle();
            } else {
                throw new IllegalArgumentException("Invalid shape type");
            }

            cacheMap.put(type, shape);
        }
        shape = cacheMap.get(type);
        return shape;
    }
}
