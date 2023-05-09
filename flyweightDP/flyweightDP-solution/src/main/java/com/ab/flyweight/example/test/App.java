package com.ab.flyweight.example.test;

import com.ab.flyweight.example.component.Shape;
import com.ab.flyweight.example.factory.ShapeFactory;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i <= 500; i++) {
            Shape shape = ShapeFactory.getShape("Circle");
            shape.draw(i + 10, "Blue", "Doted");
        }
        System.out.println("========================================");
        for (int i = 0; i <= 500; i++) {
            Shape shape = ShapeFactory.getShape("Square");
            shape.draw(i + 10, "Green", "Doted");
        }
    }
}

/*
 * There will not be any mutlithrerading issues though multiple threads are acting on single objects Each shape class object because only shareable or common intrinsic data will be there inside the object. the entire extrinics data is comming to object from outside the object.
 */