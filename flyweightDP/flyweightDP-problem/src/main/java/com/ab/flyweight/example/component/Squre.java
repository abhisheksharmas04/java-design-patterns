package com.ab.flyweight.example.component;

public class Squre implements Shape {
    private String label;

    public Squre() {
        System.out.println("Squre: 0 Param Constructor");
        this.label = "Squre";
    }

    @Override
    public void draw(float side, String fillColor, String lineStyle) {
        System.out.println("drawing square with side length " + side
        + "having fill color " + fillColor + ", line style " + lineStyle);
    }
    
}
