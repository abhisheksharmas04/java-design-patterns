package com.ab.strategy.dp.component;
// Vehicle.java Target class
// Class is taken as final classe to follow ruleno 3 ie. class must be closed for modification
public final class Vehicle {
    private IEngine engine; // Has-A-Property Composition

    public Vehicle() {
        System.out.println("Zero Param constructor");
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public void drive(String sourcePlace, String destinationPlace){
        System.out.println("Vehicle: drive() method");
        engine.start();
        System.out.println("Vehicle: drivning started " + sourcePlace);
        System.out.println("Vehicle: Driving is going on");
        engine.stop();
        System.out.println("Driving ended at " + destinationPlace);
    }
}