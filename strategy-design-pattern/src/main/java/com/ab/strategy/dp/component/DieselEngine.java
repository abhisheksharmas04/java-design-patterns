package com.ab.strategy.dp.component;

// DieselEngine.java Dependent class
// Class is taken as final classe to follow ruleno 3 ie. class must be closed for modification
public final class DieselEngine implements IEngine {
    public DieselEngine() {
        System.out.println("0-param constructor");
    }

    @Override
    public void start() {
        System.out.println("Diesel Engine is started");
    }

    @Override
    public void stop() {
        System.out.println("Diesel Engine is stop");
    }
}
