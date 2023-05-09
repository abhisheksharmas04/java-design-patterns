package com.ab.flyweight.example.test;

import com.ab.flyweight.example.component.Shape;
import com.ab.flyweight.example.factory.ShapeFactory;

public class FlyweightProblemTest {
    public static void main(String[] args) {
        for(int i=0; i<=500; i++){
            Shape shape = ShapeFactory.getShape("Circle");
            shape.draw(i+10, "Blue", "Doted");
        }
        System.out.println("========================================");
        for(int i=0; i<=500; i++){
            Shape shape = ShapeFactory.getShape("Square");
            shape.draw(i+10, "Green", "Doted");
        }

    }
}
