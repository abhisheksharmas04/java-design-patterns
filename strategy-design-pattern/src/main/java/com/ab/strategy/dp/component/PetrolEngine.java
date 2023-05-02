package com.ab.strategy.dp.component;

// PetrolEngine.java Dependent class
// Class is taken as final classe to follow ruleno 3 ie. class must be closed for modification
public final class PetrolEngine implements IEngine {
    public PetrolEngine() {
        System.out.println("Pertrol Engine zero param constructor");
    }

    @Override
    public void start() {
        System.out.println("Petrol engine is started");
    }

    @Override
    public void stop() {
        System.out.println("Petrol engine is stoped");
    }

}
