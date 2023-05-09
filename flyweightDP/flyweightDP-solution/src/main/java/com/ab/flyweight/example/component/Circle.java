package com.ab.flyweight.example.component;

public class Circle implements Shape {
    private String label;

    public Circle() {
        System.out.println("Circle: 0 Param Constructor");
        this.label = "Circle";
    }

    @Override
    public void draw(float radious, String fillColor, String lineStyle) {
        System.out.println("drawing circle with radious " + radious
                + "having fill color " + fillColor + ", line style " + lineStyle);
    }

}
